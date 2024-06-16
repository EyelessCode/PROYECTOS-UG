package ug.interfaz;

import javafx.application.Application;
import javafx.scene.control.Button;
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
import javafx.stage.Stage;

public class Interfaz extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Label lb=new Label("Botón:");
        Button btn=new Button("Botón");
        Label lb1=new Label("HiperVínculo:");
        Hyperlink hLink=new Hyperlink("HiperVínculo");
        Label lb2=new Label("Botón de activación:");
        ToggleButton tbtn=new ToggleButton("Botón de activación");
        Label lb3=new Label("Boton de Radio:");
        RadioButton rbtn=new RadioButton("Boton de Radio");
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


    }

}
