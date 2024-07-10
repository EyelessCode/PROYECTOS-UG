package controlador;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import repositorio.ConstructorResultRepositorio;
import repositorio.DriverResultRepositorio;
import repositorio.SeasonRepositorio;

public class InterfazControlador extends Application{
    private ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
    private DriverResultRepositorio drr=new DriverResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();

	@Override
	public void start(Stage arg0) throws Exception {
        
	}

}
