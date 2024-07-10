package controlador;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.DriverResult;
import modelo.Season;
import repositorio.DriverResultRepositorio;
import repositorio.SeasonRepositorio;

public class InterfazController extends Application{
    private DriverResultRepositorio drr=new DriverResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();

	@Override
	public void start(Stage arg0) throws Exception {
        //! IMPLEMENTACIÓN DE LOS AÑOS AL COMBOBOX
        ComboBox<Integer>comboBox=new ComboBox<>();

        List<Season> driverResultsList=sr.yearGeneral();
        for (Season season : driverResultsList) {
            comboBox.getItems().addAll(season.getYear());
        }

        //! PARA EL TABLEVIEW Y SU IMPLEMENTACIÓN A LA PRESENTACIÓN
        TableView<DriverResult>tableView=new TableView<>();

        //? IMPLEMENTACIÓN DE LA COLUMNAS - PRIMERA COLUMNA
        TableColumn<DriverResult,String>nameColumn=new TableColumn<>("NOMBRE / APELLIDO");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        //? SEGUNDA COLUMNA
        TableColumn<DriverResult,Integer>winsColumn=new TableColumn<>("VICTORIAS");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        //? TERCERA COLUMNA
        TableColumn<DriverResult,Integer>pointsColumn=new TableColumn<>("PUNTOS TOTALES");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));
        //? CUARTA COLUMNA
        TableColumn<DriverResult,Integer>rankColumn=new TableColumn<>("RANGO");
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));

        //? SE AGREGA LAS COLUMNAS
        tableView.getColumns().add(nameColumn);
        tableView.getColumns().add(winsColumn);
        tableView.getColumns().add(pointsColumn);
        tableView.getColumns().add(rankColumn);
        
        comboBox.setOnAction(ev->{
            try {
                //? SELECCIÓN DEL AÑO
                int seleccion=comboBox.getValue();

                //? LLAMADO DEL REPOSITORIO PARA ESTABLECER EL AÑO
                List<DriverResult> listDriverResults=drr.resultadoByYearList(seleccion);
                
                //? OBTENCIÓN DEL LISTADO
                tableView.getItems().setAll(listDriverResults);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");

                //? VENTANA DE INFORMACIÓN
                Alert alert=new Alert(AlertType.INFORMATION);
                alert.setTitle("ERROR EN LA CONEXIÓN DE LA BASE DE DATOS");
                alert.setHeaderText("HUBO UN PROBLEMA");
                alert.setContentText("VULEVA A INTENTARLO");
                alert.showAndWait();
            }
        });

        //! IMPLEMENTACIÓN DE LA PRESENTACIÓN DEL AÑO EN EL COMBOBOX
        HBox hBox=new HBox(comboBox);
        hBox.setAlignment(Pos.CENTER);

        //! IMPLEMENTACIÓN EN LA INTERFAZ POR VBOX
        VBox vBox=new VBox(hBox,tableView);

        //? RESOLUCIÓN DE LA INTERFAZ
        Scene ventaScene=new Scene(vBox,650,400);

        //! IMPLEMENTACIÓN DEL TÍTULO Y SE MUESTRA LA INTERFAZ EN PANTALLA
        arg0.setTitle("LISTA DE DATOS PARA PRESENTACIÓN DE DATOS DE CAMPO DE UNA TABLA XDXDXD");
        arg0.setScene(ventaScene);
        arg0.show();
	}
}
