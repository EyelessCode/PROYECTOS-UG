package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Season;

public class SeasonRepositorio {
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String user="cristhian";
    String password="cris03022";

    public List<Season> seasonLimit(){
        List<Season> seasonList=new ArrayList<Season>();

        try {
            Connection cnt=DriverManager.getConnection(url, user, password);

            String sql="SELECT * FROM seasons\n"+
            "   LIMIT 10;";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int year=rs.getInt("year");
                String url=rs.getString("url");

                Season s=new Season(year, url);

                seasonList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");
        }
        return seasonList;
    }

    public List<Season> seasonOrderByYearLimit(){
        List<Season> seasonList=new ArrayList<Season>();

        try {
            Connection cnt=DriverManager.getConnection(url, user, password);

            String sql="SELECT * FROM seasons\n"
            +"  ORDER BY year DESC\n"
            +"  LIMIT 10;";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int year=rs.getInt("year");
                String url=rs.getString("url");

                Season s=new Season(year, url);

                seasonList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");
        }
        return seasonList;

    }

    public List<Season> seasonOrderByYear(){
        List<Season> seasonList=new ArrayList<Season>();

        try {
            Connection cnt=DriverManager.getConnection(url, user, password);

            String sql="SELECT * FROM seasons\n"
            +"  ORDER BY year DESC";

            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int year=rs.getInt("year");
                String url=rs.getString("url");

                Season s=new Season(year, url);

                seasonList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");
        }
        return seasonList;
    }
    
}
