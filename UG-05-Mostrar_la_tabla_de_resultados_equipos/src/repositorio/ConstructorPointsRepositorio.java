package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.ConstructorPoints;

public class ConstructorPointsRepositorio {
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String user="cristhian";
    String password="cris03022";

    public List<ConstructorPoints> orderTotalPoints(){
        List<ConstructorPoints> listConstructorPoints=new ArrayList<ConstructorPoints>();

        return listConstructorPoints;
    }
}
