package vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PruebaIAVetnana extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // Crear los botones
        Button btnTDrivers = new Button("TABLEVIEW 'DRIVERS'");
        Button btnTConstructors = new Button("TABLEVIEW 'CONSTRUCTORS'");
        Button btnBDrivers = new Button("GRÁFICO DE BARRA 'DRIVERS'");
        Button btnBConstructors = new Button("GRÁFICO DE BARRA 'CONSTRUCTORS'");

        // Crear un Pane para colocar los botones
        Pane root = new Pane();

        // Posicionar los botones manualmente
        btnTDrivers.setLayoutX(385); // X position
        btnTDrivers.setLayoutY(88); // Y position
        btnTDrivers.setPrefWidth(150);
        btnTDrivers.setPrefHeight(40);
        
        btnTConstructors.setLayoutX(300); // X position
        btnTConstructors.setLayoutY(10); // Y position
        
        btnBDrivers.setLayoutX(105); // X position
        btnBDrivers.setLayoutY(88); // Y position
        
        btnBConstructors.setLayoutX(300); // X position
        btnBConstructors.setLayoutY(300); // Y position

        // Agregar los botones al Pane
        root.getChildren().addAll(btnTDrivers, btnTConstructors, btnBDrivers, btnBConstructors);

        // Cargar la imagen de fondo desde el directorio resources
        Image imagen = new Image(getClass().getResource("/resources/formula1.JPG").toExternalForm());
        BackgroundImage fondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
        root.setBackground(new Background(fondo));

        // Crear la escena y establecerla en el stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Ventana Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
