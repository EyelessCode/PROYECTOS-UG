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
    String url="jdbc:postgresql://localhost:5432/ug_formula01";
    String usuario="cristhian";
    String contrasenia="cris03022";

    public List<Circuit> circuitsGeneral() throws SQLException{
        List<Circuit> listCircuits=new ArrayList<Circuit>();

        try {
            Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);
            
            String sql="SELECT * FROM circuits limit 10;";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int circuitId=rs.getInt("circuit_id");
                String circuitRef=rs.getString("circuit_ref");
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
    
    public List<Circuit> circuitsByCountry(String paramCountry){
        List<Circuit> listCircuits=new ArrayList<Circuit>();
        
        try {
            Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);
            
            String sql="SELECT * FROM circuits WHERE country='"+paramCountry+"'";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                int circuitid = rs.getInt("circuit_id");
				String circuitref = rs.getString("circuit_ref");
				String name = rs.getString("name");
				String location = rs.getString("location");
				String country = rs.getString("country");

                Circuit c=new Circuit(circuitid, circuitref, name, location, country);

                listCircuits.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n"+"=".repeat(70)+"\nFALLO EN LA BASE DE DATOS, INTÉNTELO DE NUEVO O MÁS TARDE!\n"+"=".repeat(70));
        }

        return listCircuits;
    }
}
