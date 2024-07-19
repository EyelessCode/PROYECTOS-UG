package vista;

import javafx.application.Application;
import javafx.geometry.Pos;
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

        // Crear un StackPane para colocar los botones y el fondo
        StackPane root = new StackPane();

        // Crear un BorderPane para posicionar los botones
        BorderPane borderPane = new BorderPane();
        
        // Configurar las posiciones de los botones
        BorderPane.setAlignment(btnTDrivers, Pos.TOP_LEFT);
        BorderPane.setMargin(btnTDrivers, new javafx.geometry.Insets(10, 0, 0, 10));
        borderPane.setTop(btnTDrivers);

        BorderPane.setAlignment(btnTConstructors, Pos.TOP_RIGHT);
        BorderPane.setMargin(btnTConstructors, new javafx.geometry.Insets(10, 10, 0, 0));
        borderPane.setTop(btnTConstructors);

        BorderPane.setAlignment(btnBDrivers, Pos.BOTTOM_LEFT);
        BorderPane.setMargin(btnBDrivers, new javafx.geometry.Insets(0, 0, 10, 10));
        borderPane.setBottom(btnBDrivers);

        BorderPane.setAlignment(btnBConstructors, Pos.BOTTOM_RIGHT);
        BorderPane.setMargin(btnBConstructors, new javafx.geometry.Insets(0, 10, 10, 0));
        borderPane.setBottom(btnBConstructors);

        // Agregar los botones al BorderPane
        StackPane.setAlignment(btnTDrivers, Pos.TOP_LEFT);
        StackPane.setAlignment(btnTConstructors, Pos.TOP_RIGHT);
        StackPane.setAlignment(btnBDrivers, Pos.BOTTOM_LEFT);
        StackPane.setAlignment(btnBConstructors, Pos.BOTTOM_RIGHT);

        root.getChildren().addAll(borderPane, btnTDrivers, btnTConstructors, btnBDrivers, btnBConstructors);

        // Cargar la imagen de fondo desde el directorio resources
        Image imagen = new Image(getClass().getResource("/fondo.jpg").toExternalForm());
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
