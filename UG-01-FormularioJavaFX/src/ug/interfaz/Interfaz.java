package ug.interfaz;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Interfaz extends Application{
    
    @Override
    public void start(Stage arg0) throws Exception {
        try{
        Label lb=new Label("Botón:");
        Button btn=new Button("Botón");
        Label lb0=new Label("Comprobador de Caja:");
        CheckBox cb=new CheckBox("Comprobador de Caja");
        Label lb1=new Label("HiperVínculo:");
        Hyperlink hLink=new Hyperlink("HiperVínculo");
        Label lb2=new Label("Botón de activación:");
        ToggleButton tbtn=new ToggleButton("Botón de activación");
        ToggleGroup grupo=new ToggleGroup();
        tbtn.setToggleGroup(grupo);

        Label lb3=new Label("Boton de Radio:");
        RadioButton rbtn=new RadioButton("Boton de Radio");
        Label lb4_0=new Label("Etiqueta:");
        Label lb4_1=new Label("Etiqueta");
        Label lb4=new Label("Campo de Texto:");
        TextField txf=new TextField("Algo de texto...");
        Label lb5=new Label("Campo de Contraseña:");
        PasswordField psswf=new PasswordField();
        Label lb6=new Label("Área de texto:");
        TextArea txa=new TextArea("Este es un texto muy largo, solo envolverá varias líneas.");
        Label lb7=new Label("Indicador de Progreso:");
        ProgressIndicator pi=new ProgressIndicator();
        Label lb8=new Label("Barra de Progreso:");
        ProgressBar pb=new ProgressBar();
        Label lb9=new Label("Deslizador:");
        Slider sl=new Slider();

            GridPane gp=new GridPane();
            gp.setHgap(10);
            gp.setVgap(10);
            gp.setAlignment(Pos.TOP_LEFT);
    
            gp.add(lb, 0, 0);
            gp.add(btn, 1, 0);
            gp.add(lb0, 0, 1);
            gp.add(cb, 1, 1);
            gp.add(lb1, 0, 2);
            gp.add(hLink, 1, 2);
            gp.add(lb2, 0, 3);
            gp.add(tbtn, 1, 3);
            gp.add(lb3, 0, 4);
            gp.add(rbtn, 1, 4);
            gp.add(lb4_0, 0, 5);
            gp.add(lb4_1, 1, 5);
            gp.add(lb4, 0, 6);
            gp.add(txf, 1, 6);
            gp.add(lb5, 0, 7);
            gp.add(psswf, 1, 7);
            gp.add(lb6, 0, 8);
            gp.add(txa, 1, 8);
            gp.add(lb7, 0, 9);
            gp.add(pi, 1, 9);
            gp.add(lb8, 0, 10);
            gp.add(pb, 1, 10);
            gp.add(lb9, 0, 11);
            gp.add(sl, 1, 11);
    
            Scene escena=new Scene(gp,800,600);
            // escena.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            arg0.setTitle("allControls.fxml");
            arg0.setScene(escena);
            arg0.show();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    //     launch(args);
    // }
}
