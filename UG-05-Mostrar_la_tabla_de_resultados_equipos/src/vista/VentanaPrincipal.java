package vista;

import javafx.application.Application;
// import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
// import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaPrincipal extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Button btnTableDrivers=new Button("TABLEVIEW DE 'DRIVERS'");
        Button btnBarrasDrivers=new Button("GRÁFICO DE BARRAS DE 'DRIVERS'");
        Button btnTableConstructors=new Button("TABLEVIEW DE 'CONSTRUCTORS'");
        Button btnBarrasConstructors=new Button("GRÁFICO DE BARRAS DE 'CONSTRUCTORS'");

        Pane root=new Pane();

        btnTableDrivers.setLayoutX(230);
        btnTableDrivers.setLayoutY(90);
        btnTableDrivers.setPrefHeight(45);
        btnTableDrivers.setPrefWidth(150);
        
        btnBarrasDrivers.setLayoutX(194);
        btnBarrasDrivers.setLayoutY(145);
        btnBarrasDrivers.setPrefHeight(45);
        btnBarrasDrivers.setPrefWidth(220);

        btnTableConstructors.setLayoutX(194);
        btnTableConstructors.setLayoutY(201);
        btnTableConstructors.setPrefHeight(45);
        btnTableConstructors.setPrefWidth(220);
        
        btnBarrasConstructors.setLayoutX(160);
        btnBarrasConstructors.setLayoutY(258);
        btnBarrasConstructors.setPrefHeight(45);
        btnBarrasConstructors.setPrefWidth(260);
        
        // VBox v=new VBox(btnTableDrivers,btnBarrasDrivers,btnTableConstructors,btnBarrasConstructors);
        // v.setAlignment(Pos.BOTTOM_CENTER);

        root.getChildren().addAll(btnTableDrivers,btnBarrasDrivers,btnTableConstructors,btnBarrasConstructors);

        Image imagen=new Image(getClass().getResource("/resources/formula1.jpg").toExternalForm());

        BackgroundImage imagenBackground=new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
        root.setBackground(new Background(imagenBackground));
        // v.setBackground(new Background(imagenBackground));

        Scene stage=new Scene(root,600,400);
        // Scene stage=new Scene(v,600,400);

        arg0.setTitle("YA QUIERO DORMIR");
        arg0.setScene(stage);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}