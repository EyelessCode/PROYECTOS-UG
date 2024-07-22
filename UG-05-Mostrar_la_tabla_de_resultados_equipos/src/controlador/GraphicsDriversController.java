package controlador;

import java.sql.SQLException;
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
import modelo.DriverPoints;
import repositorio.DriverPointsRepositorio;

public class GraphicsDriversController {
    private BarChart<String,Number>barras;
    private DriverPointsRepositorio dpr=new DriverPointsRepositorio();

    public void ventanaEmergente(){
        Font fuente=new Font("Gill Sans Ultra Bold", 36);
        Label etiquetaGrafico=new Label("GRÁFICO DE BARRAS DE CONDUCTORES");
        etiquetaGrafico.setFont(fuente);

        CategoryAxis x=new CategoryAxis();
        x.setLabel("NOMBRES/APELLIDOS");

        NumberAxis y=new NumberAxis();
        y.setLabel("PUNTAJE TOTAL");

        barras=new BarChart<String,Number>(x, y);
        barras.setTitle("TABLA DE POCICIONES HORIZONTAL");

        try {
            actualizacionBarras();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        VBox v=new VBox(etiquetaGrafico,barras);
        v.setAlignment(Pos.CENTER);

        Scene escena=new Scene(v);

        Stage escenario=new Stage();

        escenario.setTitle("GRÁFICO DE BARRAS ༼ つ ◕_◕ ༽つ");
        escenario.setScene(escena);
        escenario.show();
    }

    private void actualizacionBarras()throws SQLException{
        barras.getData().clear();
        List<DriverPoints> dpList=dpr.totalPointsOrder();
        XYChart.Series<String,Number>serie=new XYChart.Series<>();
        for (DriverPoints driverPoints : dpList) {
            serie.getData().add(new XYChart.Data<>(driverPoints.getDriverName(),driverPoints.getTotalPoints()));
        }
        serie.setName("CONDUCTORES");
        barras.getData().add(serie);
    }
}
