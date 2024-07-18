package controlador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterfazMainPrueba extends Application{
    private InterfazVentana iv;

	@Override
	public void start(Stage arg0) throws Exception {
        Button btn=new Button("ABRIR VENTANA EMERGENTE");
        btn.setOnAction(ev->abrirVentana());
        StackPane root=new StackPane();
        root.getChildren().add(btn);

        Scene ventana=new Scene(root,500,200);
        arg0.setTitle("VENTANA PRINCIPAL");
        arg0.setScene(ventana);
        arg0.show();
    }

    private void abrirVentana(){
        iv=new InterfazVentana();
        iv.ventanaEmergente();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
