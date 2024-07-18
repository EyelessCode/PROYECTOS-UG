package vista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VentanaPrincipal extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        
        Button btnTDrivers=new Button("TABLEVIEW 'DRIVERS'");
        btnTDrivers.setAlignment(Pos.CENTER_LEFT);
        Button btnTConstructors=new Button("TABLEVIEW 'CONSTRUCTORS'");
        btnTConstructors.setAlignment(Pos.BASELINE_RIGHT);
        Button btnBDrivers=new Button("GRÁFICO DE BARRA 'DRIVERS'");
        btnBDrivers.setAlignment(Pos.CENTER_RIGHT);
        Button btnBConstructors=new Button("GRÁFICO DE BARRA 'CONSTRUCTORS'");
        btnBConstructors.setAlignment(Pos.BASELINE_LEFT);

        // HBox filaLeft=new HBox(btnBDrivers);
        // filaLeft.setAlignment(Pos.CENTER_LEFT);
        Pane ventanita=new Pane(btnTDrivers,btnTConstructors,btnBDrivers,btnBConstructors);

        Image imagen=new Image(getClass().getResourceAsStream("C:\\Users\\Cristhian\\Documents\\GitHub\\PROYECTOS-UG\\UG-05-Mostrar_la_tabla_de_resultados_equipos\\src\\imagenes○\\formula1.jpg"));
            BackgroundImage fondo=new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,true, true, false, true));
        ventanita.setBackground(new Background(fondo));
        
        Scene scene=new Scene(ventanita);
        arg0.setTitle("VENTANA PRINCIPAL XD");
        arg0.setScene(scene);
        arg0.show();
                
    }

}
