package controlador;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import repositorio.ConstructorPointsRepositorio;

public class TableConstructorsController {
    private ConstructorPointsRepositorio cpr=new ConstructorPointsRepositorio();

    public void ventanaEmergente(){
        Font fuente=new Font("Gill Sans Ultra Bold", 18);
        Label etiquetaTabla=new Label("LISTA DE TABLA DE EQUIPOS");
        etiquetaTabla.setFont(fuente);

        Font fuente1=new Font("Poor Richard", 12);
        Label tituloYear=new Label("AÑO: ");
        tituloYear.setFont(fuente1);
    }    
}
