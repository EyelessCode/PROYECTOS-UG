package controlador;

import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.ConstructorResult;
import modelo.Season;
import repositorio.ConstructorResultRepositorio;
import repositorio.SeasonRepositorio;

public class TableDriversController {
    private ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();


	public void ventanaEmergente(){
        //! IMPLEMENTACIÓN DE LOS AÑOS AL COMBOBOX
        Label tituloYear=new Label("AÑO: ");
        ComboBox<Integer> comboBoxYear=new ComboBox<>();
        List<Season> sList=sr.seasonOrderByYear();
        
        for (Season season : sList) {
            comboBoxYear.getItems().add(season.getYear());
        }
        
        //! IMPLEMENTACIÓN DE GRÁFICO DE BARRAS AL COMBOBOX
        Label tituloTabla=new Label("TABLA: ");
        ComboBox<String>comboBoxPoints=new ComboBox<>();
        comboBoxPoints.getItems().addAll("CONDUCTORES","EQUIPO");
        comboBoxPoints.setValue("Filtre una tabla");

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
        
        //! ACCIÓN DE COMBOBOX DE AÑO
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
            }
        });

        
        //! IMPLEMENTACIÓN DE LA PRESENTACIÓN DE LOS COMBOBOXs
        HBox contenedorYear=new HBox(tituloYear,comboBoxYear);
        contenedorYear.setAlignment(Pos.CENTER);
        HBox contenedorTabla=new HBox(tituloTabla,comboBoxPoints);
        contenedorTabla.setAlignment(Pos.CENTER);

        //! IMPLEMENTACIÓN EN LA INTERFAZ POR VBOX
        VBox v=new VBox(contenedorYear,constructorTableView);
        
        //? RESOLUCIÓN DE LA INTERFAZ
        Scene ventana=new Scene(v,400,300);
        Stage ss=new Stage();

        ss.setTitle("a");
        ss.setScene(ventana);
        ss.show();
        
        //! IMPLEMENTACIÓN DEL TÍTULO Y SE MUESTRA LA INTERFAZ EN PANTALLA

        // //! CARGO DE DATO INICIAL
        // if (!comboBoxYear.getItems().isEmpty()) {
        //     comboBoxYear.setValue(comboBoxYear.getItems().get(0));
        //     comboBoxYear.getOnAction().handle(null);
        // }
    }

}
