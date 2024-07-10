package controlador;

import java.util.List;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
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
        ComboBox<Integer> comboBoxYear=new ComboBox<>();
        List<Season> sList=sr.seasonAll();

        for (Season season : sList) {
            comboBoxYear.getItems().add(season.getYear());
        }
	}

}
