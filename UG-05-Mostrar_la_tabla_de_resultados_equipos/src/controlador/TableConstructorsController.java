package controlador;

import java.util.List;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Font;
import modelo.ConstructorPoints;
import modelo.ConstructorResult;
import modelo.Season;
import repositorio.ConstructorPointsRepositorio;
import repositorio.SeasonRepositorio;

public class TableConstructorsController {
    private ConstructorPointsRepositorio cpr=new ConstructorPointsRepositorio();
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
        
        TableColumn columnNombre=new TableColumn<>("NOMBRE EQUIPO");
        TableColumn columnVictorias=new TableColumn<>("VICTORIAS");
        TableColumn columnPuntos=new TableColumn<>("PUNTAJE TOTAL");
        TableColumn columnRango=new TableColumn<>("RANGO");
    }    
}
