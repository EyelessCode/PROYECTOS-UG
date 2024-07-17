package controlador;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterfazVentana {

    public void display(){
        Stage nuevaVentana=new Stage();
        StackPane secundaria=new StackPane();
        Label l=new Label("HOLA DESDE LA NUEVA VENTANA");
        secundaria.getChildren().add(l);

        Scene segunVentana=new Scene(secundaria,230,100);

        nuevaVentana.setTitle("NUEVA VENTANITA");
        nuevaVentana.setScene(segunVentana);;
        nuevaVentana.show();
    }


}
