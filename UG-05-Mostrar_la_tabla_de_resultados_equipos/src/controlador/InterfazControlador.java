package controlador;

import java.sql.SQLException;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.ConstructorPoints;
import modelo.ConstructorResult;
import modelo.DriverPoints;
import modelo.Season;
import repositorio.ConstructorPointsRepositorio;
import repositorio.ConstructorResultRepositorio;
import repositorio.DriverPointsRepositorio;
import repositorio.SeasonRepositorio;

public class InterfazControlador extends Application{
    private ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();
    private ConstructorPointsRepositorio cpr=new ConstructorPointsRepositorio();
    private DriverPointsRepositorio dpr=new DriverPointsRepositorio();

    private BarChart<String,Number>barChart;

	@Override
	public void start(Stage arg0) throws Exception {
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
        comboBoxPoints.getItems().addAll("Drivers","Constructors");
        comboBoxPoints.setValue("Drivers");

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

        //! ACCIÓN DE COMBOBOX DE GRÁFICO DE BARRAS
        comboBoxPoints.setOnAction(ev->{
            try {
                actualizacion(comboBoxPoints.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //! IMPLEMENTACIÓN DE LOS EJES
        //? ESTABLECIENDO EL EJE 'X'
        CategoryAxis x=new CategoryAxis();
        x.setLabel("NOMBRE/APELLIDO");
        //? ESTABLECIENDO EL EJE 'Y'
        NumberAxis y=new NumberAxis();
        y.setLabel("PUNTAJE TOTAL");
        
        //! IMPLEMENTACIÓN DE LOS GRÁFICOS DE BARRAS
        barChart=new BarChart<String,Number>(x, y);
        barChart.setTitle("TABLA DE POSICIONES HORIZONTAL");
        
        //! IMPLEMENTACIÓN DE LA PRESENTACIÓN DE LOS COMBOBOXs
        HBox contenedorYear=new HBox(tituloYear,comboBoxYear);
        contenedorYear.setAlignment(Pos.CENTER);
        HBox contenedorTabla=new HBox(tituloTabla,comboBoxPoints);
        contenedorTabla.setAlignment(Pos.CENTER);

        //! IMPLEMENTACIÓN EN LA INTERFAZ POR VBOX
        VBox v=new VBox(contenedorYear,constructorTableView,contenedorTabla,barChart);
        
        //? RESOLUCIÓN DE LA INTERFAZ
        Scene ventana=new Scene(v,800,800);
        
        //! IMPLEMENTACIÓN DEL TÍTULO Y SE MUESTRA LA INTERFAZ EN PANTALLA
        arg0.setScene(ventana);
        arg0.setTitle("VENTANA PARA LA PRESENTACIÓN DE LOS DATOS DE UNA TABLA XD");
        arg0.show();

        // //! CARGO DE DATO INICIAL
        // if (!comboBoxYear.getItems().isEmpty()) {
        //     comboBoxYear.setValue(comboBoxYear.getItems().get(0));
        //     comboBoxYear.getOnAction().handle(null);
        // }
    }

    //! MÉTODO DE ACTUALIZACIÓN DE GRÁFICO DE BARRA
    private void actualizacion(String seleccion)throws SQLException{
        barChart.getData().clear();
        if (seleccion.equals("Drivers")) {
            List<DriverPoints> listDriverPoints=dpr.totalPointsOrder();
            XYChart.Series<String,Number>serie=new XYChart.Series<>();
            for (DriverPoints driverPoints : listDriverPoints) {
                serie.getData().add(new XYChart.Data<>(driverPoints.getDriverName(),driverPoints.getTotalPoints()));
            }
            serie.setName("CONDUCTORES");
            barChart.getData().add(serie);
        }else if(seleccion.equals("Constructors")){
            List<ConstructorPoints>cpList=cpr.orderTotalPoints();
            XYChart.Series<String,Number>serie=new XYChart.Series<>();
            for (ConstructorPoints constructorPoints : cpList) {
                serie.getData().add(new XYChart.Data<>(constructorPoints.getName(),constructorPoints.getTotalPoints()));
            }
            serie.setName("EQUIPO");
            barChart.getData().add(serie);
        }
    }

}
