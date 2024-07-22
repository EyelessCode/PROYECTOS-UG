package controlador;

import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import modelo.ConstructorPoints;
import repositorio.ConstructorPointsRepositorio;

public class GraphicsConstructorsController {
    private ConstructorPointsRepositorio cpr=new ConstructorPointsRepositorio();
    private BarChart<String,Number> barras;

    public void ventanaEmergente(){
        CategoryAxis x=new CategoryAxis();
        x.setLabel("NOMBRE DE EQUIPO");

        NumberAxis y=new NumberAxis();
        y.setLabel("PUNTAJE TOTAL");

        barras=new BarChart<String,Number>(x, y);
        barras.setTitle("TABLA DE POSICIONES HORIZONTAL");

        Font fuente=new Font("Gill Sans Ultra Bold", 36);
        Label etiquetaBarras=new Label("GRÁFICO DE BARRAS DE CONDUCTORES");
        etiquetaBarras.setFont(fuente);

        try {
            actualizacionBarras();
        } catch (Exception e) {
            e.printStackTrace();
        }

        VBox v=new VBox(etiquetaBarras,barras);
        v.setAlignment(Pos.CENTER);

        Scene ventana=new Scene(v);

        Stage escenario=new Stage();
        escenario.setTitle("(☞ﾟヮﾟ)☞ GRÁFICO DE BARRAS");
        escenario.setScene(ventana);
        escenario.show();
    }

    private void actualizacionBarras(){
        barras.getData().clear();
        List<ConstructorPoints> cpList=cpr.orderTotalPoints();
        XYChart.Series<String,Number>serie=new XYChart.Series<>();
        for (ConstructorPoints constructorPoints : cpList) {
            serie.getData().add(new XYChart.Data<>(constructorPoints.getName(),constructorPoints.getTotalPoints()));
        }
        serie.setName("EQUIPO");
        barras.getData().add(serie);
    }
}
