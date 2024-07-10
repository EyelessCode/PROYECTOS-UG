package controlador;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.ConstructorResult;
import modelo.Season;
import repositorio.ConstructorResultRepositorio;
import repositorio.SeasonRepositorio;

public class InterfazControlador extends Application{
    private ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();

	@Override
	public void start(Stage arg0) throws Exception {
        //! IMPLEMENTACIÓN DE LOS AÑOS AL COMBOBOX
        ComboBox<Integer> comboBoxYear=new ComboBox<>();
        List<Season> sList=sr.seasonAll();
        
        for (Season season : sList) {
            comboBoxYear.getItems().add(season.getYear());
        }
        
        //! PARA EL TABLEVIEW Y SU IMPLEMENTACIÓN A LA PRESENTACIÓN
        TableView<ConstructorResult> constructorTableView=new TableView<>();

        //? IMPLEMENTACIÓN DE LA COLUMNAS - PRIMERA COLUMNA
        TableColumn<ConstructorResult,String> nameColumn=new TableColumn<>("EQUIPO");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        //? SEGUNDA COLUMNA
        TableColumn<ConstructorResult,Integer>winsColumn=new TableColumn<>("VICTORIAS");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        //? TERCERA COLUMNA
        TableColumn<ConstructorResult,Integer>pointsColumn=new TableColumn<>("PUNTOS TOTALES");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));
        //? CUARTA COLUMNA
        TableColumn<ConstructorResult,Integer>rankColumn=new TableColumn<>("RANGO");
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));

        //? SE AGREGA LAS COLUMNAS
        constructorTableView.getColumns().add(nameColumn);
        constructorTableView.getColumns().add(winsColumn);
        constructorTableView.getColumns().add(pointsColumn);
        constructorTableView.getColumns().add(rankColumn);

        //! ACCIÓN DE COMBOBOX
        comboBoxYear.setOnAction(ev->{
            try {
                //? SELECCIÓN DEL AÑO
                int seleccion=comboBoxYear.getValue();
                
                //? LLAMADO DEL REPOSITORIO PARA ESTABLECER EL AÑO
                List<ConstructorResult> constructorResultsList=crr.ResultByYear(seleccion);
            
                //? OBTENCIÓN DEL LISTADO
                constructorTableView.getItems().setAll(constructorResultsList);
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
        HBox contenedor=new HBox(comboBoxYear);
        contenedor.setAlignment(Pos.CENTER);

        //! IMPLEMENTACIÓN EN LA INTERFAZ POR VBOX
        VBox v=new VBox(contenedor,constructorTableView);

        //? RESOLUCIÓN DE LA INTERFAZ
        Scene ventana=new Scene(v,650,400);

        arg0.setScene(ventana);
        arg0.setTitle("VENTANA PARA LA PRESENTACIÓN DE LOS DATOS DE UNA TABLA XD");
        arg0.show();

        // //! CARGO DE DATO INICIAL
        // if (!comboBoxYear.getItems().isEmpty()) {
        //     comboBoxYear.setValue(comboBoxYear.getItems().get(0));
        //     comboBoxYear.getOnAction().handle(null);
        // }
    }

}
