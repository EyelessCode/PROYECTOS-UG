package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Circuit;

public class CircuitRepositorio {
    String url="jdbc:mysql://127.0.0.1:3306/formula_01";
    String usuario="cristhian";
    String contrasenia="cris03022";

    public List<Circuit> circuitsGeneral() throws SQLException{
        List<Circuit> listCircuits=new ArrayList<Circuit>();

        try {
            Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);
            
            String sql="SELECT * FROM `circuits`";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int circuitId=rs.getInt("circuitId");
                String circuitRef=rs.getString("circuitRef");
                String name=rs.getString("name");
                String location=rs.getString("location");
                String country=rs.getString("country");

                Circuit c=new Circuit(circuitId, circuitRef, name, location, country);

                listCircuits.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n"+"=".repeat(70)+"\nFALLO EN LA BASE DE DATOS, INTÉNTELO DE NUEVO O MÁS TARDE!\n"+"=".repeat(70));
        }

        return listCircuits;
    }
}
