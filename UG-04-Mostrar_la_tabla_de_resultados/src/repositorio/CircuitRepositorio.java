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

    public List<Circuit> libroGeneral() throws SQLException{
        List<Circuit> listCircuits=new ArrayList<Circuit>();

        try {
            Connection cnt=DriverManager.getConnection(url, url, contrasenia);
            
            String sql="SELECT * FROM circuits";
            Statement st=cnt.createStatement();
            ResultSet rs=st.executeQuery(sql);

            while (rs.next()) {
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n"+"=".repeat(70)+"\nFALLO EN LA BASE DE DATOS, INTÉNTELO DE NUEVO O MÁS TARDE!\n"+"=".repeat(70));
        }

        return listCircuits;
    }
}
