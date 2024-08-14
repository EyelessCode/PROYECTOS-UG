package controlador;

import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import modelo.ConstructorResult;
import modelo.Season;
import repositorio.ConstructorResultRepositorio;
import repositorio.SeasonRepositorio;

public class TableConstructorsController {
    private ConstructorResultRepositorio cpr=new ConstructorResultRepositorio();
    private SeasonRepositorio sr=new SeasonRepositorio();

    public void ventanaEmergente(){
        Font fuente=new Font("Gill Sans Ultra Bold", 18);
        Label etiquetaTabla=new Label("LISTA DE TABLA DE EQUIPOS");
        etiquetaTabla.setFont(fuente);

        Font fuente1=new Font("Poor Richard", 12);
        Label tituloYear=new Label("AÑO: ");
        tituloYear.setFont(fuente1);

        ComboBox<Integer> comboBox=new ComboBox<>();

        List<Season> cpList=sr.seasonOrderByYear();
        for (Season season : cpList) {
            comboBox.getItems().add(season.getYear());
        }

        TableView<ConstructorResult> tabla=new TableView<>();
        
        TableColumn<ConstructorResult,String> columnNombre=new TableColumn<>("NOMBRE EQUIPO");
        TableColumn<ConstructorResult,Integer> columnVictorias=new TableColumn<>("VICTORIAS");
        TableColumn<ConstructorResult,Integer> columnPuntos=new TableColumn<>("PUNTAJE TOTAL");
        TableColumn<ConstructorResult,String> columnRango=new TableColumn<>("RANGO");

        columnNombre.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnVictorias.setCellValueFactory(new PropertyValueFactory<>("wins"));
        columnPuntos.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));
        columnRango.setCellValueFactory(new PropertyValueFactory<>("rank"));

        tabla.getColumns().add(columnNombre);
        tabla.getColumns().add(columnVictorias);
        tabla.getColumns().add(columnPuntos);
        tabla.getColumns().add(columnRango);

        comboBox.setOnAction(ev->{
            try {
                int seleccion=comboBox.getValue();
    
                List<ConstructorResult>cr=cpr.ResultByYear(seleccion);
                tabla.getItems().setAll(cr);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        HBox h=new HBox(tituloYear,comboBox);
        h.setAlignment(Pos.CENTER);
        
        VBox v=new VBox(etiquetaTabla,h,tabla);
        v.setAlignment(Pos.CENTER);

        Scene ventana=new Scene(v,600,300);
        Stage escenario=new Stage();
        escenario.setTitle("LISTA DE TABLA (⌐■_■)");
        escenario.setScene(ventana);
        escenario.show();
    }    
}
