package controlador;

import java.util.List;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
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
	}
}
