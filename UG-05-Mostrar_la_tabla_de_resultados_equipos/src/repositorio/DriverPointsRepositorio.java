package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.DriverPoints;

public class DriverPointsRepositorio {
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String user="cristhian";
    String password="cris03022";

    public List<DriverPoints> totalPointsOrder(){
        List<DriverPoints> listDriverPoints=new ArrayList<DriverPoints>();

        return listDriverPoints;
    }
}
