package vista;

import controlador.GraphicsConstructorsController;
import controlador.GraphicsDriversController;
import controlador.TableConstructorsController;
import controlador.TableDriversController;
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
import javafx.scene.text.Font;
// import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaPrincipal extends Application {
    private TableDriversController td=new TableDriversController(); 
    private GraphicsDriversController gdc=new GraphicsDriversController();
    private GraphicsConstructorsController gcc=new GraphicsConstructorsController();
    private TableConstructorsController tcc=new TableConstructorsController();

    @Override
    public void start(Stage arg0) throws Exception {
        Font fuente=new Font("Imprint MT Shadow", 12);
        
        Button btnTableDrivers=new Button("TABLEVIEW DE 'DRIVERS'");
        Button btnBarrasDrivers=new Button("GRÁFICO DE BARRAS DE 'DRIVERS'");
        Button btnTableConstructors=new Button("TABLEVIEW DE 'CONSTRUCTORS'");
        Button btnBarrasConstructors=new Button("GRÁFICO DE BARRAS DE 'CONSTRUCTORS'");

        Pane root=new Pane();

        btnTableDrivers.setFont(fuente);
        btnTableDrivers.setLayoutX(210);
        btnTableDrivers.setLayoutY(90);
        btnTableDrivers.setPrefHeight(45);
        // btnTableDrivers.setPrefWidth(150);


        btnBarrasDrivers.setFont(fuente);
        btnBarrasDrivers.setLayoutX(180);
        btnBarrasDrivers.setLayoutY(145);
        btnBarrasDrivers.setPrefHeight(45);
        // btnBarrasDrivers.setPrefWidth(220);
        

        btnTableConstructors.setFont(fuente);
        btnTableConstructors.setLayoutX(185);
        btnTableConstructors.setLayoutY(201);
        btnTableConstructors.setPrefHeight(45);
        // btnTableConstructors.setPrefWidth(220);
        

        btnBarrasConstructors.setFont(fuente);
        btnBarrasConstructors.setLayoutX(155);
        btnBarrasConstructors.setLayoutY(257);
        btnBarrasConstructors.setPrefHeight(45);
        // btnBarrasConstructors.setPrefWidth(260);

        btnTableDrivers.setOnAction(ev->td.ventanaEmergente());
        btnBarrasDrivers.setOnAction(ev->gdc.ventanaEmergente());
        btnTableConstructors.setOnAction(ev->tcc.ventanaEmergente());
        btnBarrasConstructors.setOnAction(ev->gcc.ventanaEmergente());
        
        // VBox v=new VBox(btnTableDrivers,btnBarrasDrivers,btnTableConstructors,btnBarrasConstructors);
        // v.setAlignment(Pos.BOTTOM_CENTER);

        root.getChildren().addAll(btnTableDrivers,btnBarrasDrivers,btnTableConstructors,btnBarrasConstructors);

        Image imagen=new Image(getClass().getResource("/resources/formula1.jpg").toExternalForm());

        BackgroundImage imagenBackground=new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
        root.setBackground(new Background(imagenBackground));
        // v.setBackground(new Background(imagenBackground));

        Scene stage=new Scene(root,600,400);
        // Scene stage=new Scene(v,600,400);

        arg0.setTitle("(╯°□°）╯︵ ┻━┻");
        arg0.setScene(stage);
        arg0.show();
    }

}