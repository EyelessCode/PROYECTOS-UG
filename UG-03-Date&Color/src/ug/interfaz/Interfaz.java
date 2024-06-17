package ug.interfaz;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Interfaz extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        DatePicker datePicker=new DatePicker();

        ColorPicker colorPicker=new ColorPicker();

        Label dateLabel=new Label("SELECCIONA UNA FECHA:");
        Label colorLabel=new Label("SELECCIONA UN COLOR:");

        Button confirma=new Button("CONFIRMA");

        Text seleccion=new Text();

        VBox v=new VBox(10);
        v.getChildren().addAll(dateLabel,datePicker,colorLabel,colorPicker,confirma,seleccion);

        confirma.setOnAction(e->{
            if(datePicker.getValue()!=null&&colorPicker.getValue()!=null){
                String escogeFecha="FECHA SELECCIONADA: "+datePicker.getValue();

                Color color=colorPicker.getValue();
                String nombreColor = getColorName(color);
                String seleccionarColor="COLOR SELECCIONADO: "+nombreColor;
            }
        });


    }

    private String getColorName(Color color) {
        int red = (int) (color.getRed() * 255);
        int green = (int) (color.getGreen() * 255);
        int blue = (int) (color.getBlue() * 255);
    
        
        return String.format("RGB(%d, %d, %d)", red, green, blue);
    }

}
