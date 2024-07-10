package controlador;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.ConstructorResult;
import modelo.Season;
import repositorio.ConstructorResultRepositorio;
import repositorio.DriverResultRepositorio;
import repositorio.SeasonRepositorio;

public class InterfazControlador extends Application{
    private ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
    private DriverResultRepositorio drr=new DriverResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();

	@Override
	public void start(Stage arg0) throws Exception {
        //! PARA EL COMBOBOX Y SU IMPLEMENTACIÓN A LA PRESENTACIÓN
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
    }

}
