package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.ConstructorPoints;

public class ConstructorPointsRepositorio {
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String user="cristhian";
    String password="cris03022";

    public List<ConstructorPoints> orderTotalPoints(){
        List<ConstructorPoints> listConstructorPoints=new ArrayList<ConstructorPoints>();

        try {
            Connection cnt=DriverManager.getConnection(url, user, password);

            String sql = "SELECT\n" +
             "    co.name,\n" +
             "    SUM(res.points) AS total_points\n" +
             "FROM\n" +
             "    results res\n" +
             "JOIN\n" +
             "    races r ON res.race_id = r.race_id\n" +
             "JOIN\n" +
             "    constructors co ON res.constructor_id = co.constructor_id\n" +
             "GROUP BY\n" +
             "    co.constructor_id, co.name\n" +
             "ORDER BY\n" +
             "    total_points DESC;";

            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listConstructorPoints;
    }
}
