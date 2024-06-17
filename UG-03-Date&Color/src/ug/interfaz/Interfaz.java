package ug.interfaz;

import javafx.application.Application;
import javafx.scene.Scene;
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

                System.out.println(escogeFecha);
                System.out.println(seleccionarColor);
                
                seleccion.setText(escogeFecha+"\n"+seleccionarColor);

                arg0.getScene().setFill(colorPicker.getValue());
            }else{
                System.out.println("POR FAVOR, SELECCIONE UNA FECHA Y UN COLOR. INTÉNTELO DE NUEVO");
                seleccion.setText("POR FAVOR, SELECCIONE UNA FECHA Y UN COLOR. INTÉNTELO DE NUEVO");
            }
        });
        Scene escena=new Scene(v,300,250);
        arg0.setTitle("DATE & COLOR");
        arg0.setScene(escena);
        arg0.show();

    }

    private String getColorName(Color color) {
        int red = (int) (color.getRed() * 255);
        int green = (int) (color.getGreen() * 255);
        int blue = (int) (color.getBlue() * 255);
    
        
        return String.format("RGB(%d, %d, %d)", red, green, blue);
    }

}
