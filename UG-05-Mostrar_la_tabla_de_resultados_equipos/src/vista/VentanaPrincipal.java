package vista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VentanaPrincipal extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Image imagen=new Image(getClass().getResourceAsStream("C:\\Users\\Cristhian\\Documents\\GitHub\\PROYECTOS-UG\\UG-05-Mostrar_la_tabla_de_resultados_equipos\\src\\imagenes○\\formula1.jpg"));
            BackgroundImage fondo=new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,   true, true, false, true));
    
            Button btnTDrivers=new Button("TABLEVIEW 'DRIVERS'");
            Button btnTConstructors=new Button("TABLEVIEW 'CONSTRUCTORS'");
            Button btnBDrivers=new Button("GRÁFICO DE BARRA 'DRIVERS'");
            Button btnBConstructors=new Button("GRÁFICO DE BARRA 'CONSTRUCTORS'");
    
            HBox filaLeft=new HBox(btnTDrivers);
            filaLeft.setAlignment(Pos.CENTER_LEFT);
    }

}
