package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.DriverPoints;

public class DriverPointsRepositorio {
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String user="cristhian";
    String password="cris03022";

    public List<DriverPoints> totalPointsOrder() throws SQLException{
        List<DriverPoints> listDriverPoints=new ArrayList<DriverPoints>();

        try {
            Connection cnt=DriverManager.getConnection(url, user, password);
            
            String sql = "SELECT\n" +
            "    d.forename,\n" +
            "    d.surname,\n" +
            "    SUM(res.points) AS total_points\n" +
            "FROM\n" +
            "    results res\n" +
            "JOIN\n" +
            "    races r ON res.race_id = r.race_id\n" +
            "JOIN\n" +
            "    drivers d ON res.driver_id = d.driver_id\n" +
            "GROUP BY\n" +
            "    d.driver_id, d.forename, d.surname\n" +
            "ORDER BY\n" +
            "    total_points DESC LIMIT 10;";

            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                String forename=rs.getString("forename");
                String surname=rs.getString("surname");
                int totalPoints=rs.getInt("total_points");

                DriverPoints dp=new DriverPoints(forename+" "+surname,totalPoints);

                listDriverPoints.add(dp);
            }            
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");
        }
        return listDriverPoints;
    }
}
