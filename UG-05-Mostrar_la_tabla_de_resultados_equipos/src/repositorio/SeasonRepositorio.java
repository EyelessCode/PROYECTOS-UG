package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.Season;

public class SeasonRepositorio {
    String url="jdbc:mysql://127.0.0.1:3306/formula1";
    String user="cristhian";
    String password="cris03022";

    public List<Season> seasonAll(){
        List<Season> seasonList=new ArrayList<Season>();

        return seasonList;
    }
}
