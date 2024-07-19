package vista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
        AnchorPane ventanita=new AnchorPane(btnTDrivers,btnTConstructors,btnBDrivers,btnBConstructors);

        Image imagen = new Image(getClass().getResource("/resources/formula1.JPG").toExternalForm());
        BackgroundImage fondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
        ventanita.setBackground(new Background(fondo));
        
        // HBox h=new HBox(ventanita);

        Scene scene=new Scene(ventanita,525,350);
        arg0.setTitle("VENTANA PRINCIPAL XD");
        arg0.setScene(scene);
        arg0.show();
                
    }

    public static void main(String[] args) {
        launch(args);
    }
}
