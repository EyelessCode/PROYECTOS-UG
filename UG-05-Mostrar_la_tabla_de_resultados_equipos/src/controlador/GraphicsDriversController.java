package controlador;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import repositorio.DriverPointsRepositorio;

public class GraphicsDriversController {
    private DriverPointsRepositorio dpr=new DriverPointsRepositorio();

    public void ventanaEmergente(){
        Font fuente=new Font("Gill Sans Ultra Bold", 36);
        Label etiqueGrafico=new Label("GRÁFICO DE BARRAS DE CONDUCTORES");
        etiqueGrafico.setFont(fuente);

        CategoryAxis x=new CategoryAxis();
        x.setLabel("NOMBRES/APELLIDOS");

        NumberAxis y=new NumberAxis();
        y.setLabel("PUNTAJE TOTAL");

    }
}
