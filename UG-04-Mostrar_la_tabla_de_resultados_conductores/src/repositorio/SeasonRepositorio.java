package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import modelo.Season;

public class SeasonRepositorio {
    String url="jdbc:mysql//127.0.0.1:3306/formula1";
    String usuario="cristhian";
    String contrasenia="cris03022";

    public List<Season> anioGeneral(){
        List<Season> listSeasons=new ArrayList<Season>();

        try {
            Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);
        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30));
        }
        return null;
    }
}
