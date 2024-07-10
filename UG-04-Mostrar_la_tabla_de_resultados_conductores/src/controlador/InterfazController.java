package controlador;

import java.util.List;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
        TableColumn<DriverResult,String>nameColumn=new TableColumn<>("NOMBRE");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("forname"));
        //? SEGUNDA COLUMNA
        TableColumn<DriverResult,String>lastnameColumn=new TableColumn<>("APELLIDO");
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
        //? TERCERA COLUMNA
        TableColumn<DriverResult,Integer>winsColumn=new TableColumn<>("VICTORIAS");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        //? CUARTA COLUMNA
        TableColumn<DriverResult,Integer>pointsColumn=new TableColumn<>("PUNTOS TOTALES");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));
        //? QUINTA COLUMNA
        TableColumn<DriverResult,Integer>rankColumn=new TableColumn<>("RANGO");
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));

	}
}
