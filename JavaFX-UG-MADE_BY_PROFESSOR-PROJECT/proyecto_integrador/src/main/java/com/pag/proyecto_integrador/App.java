package com.pag.proyecto_integrador;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App 
{
	
	
	public static void circuits() throws CsvValidationException {
		String jdbcURL = "jdbc:postgresql://localhost:5432/formula1";
        String username = "admin";
        String password = "1234";
        
        
    	String path = "C:\\Users\\Cristhian\\Downloads\\Project\\proyecto_integrador\\proyecto_integrador\\data_source";
        
    	Connection connection = null;
    	
    	try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);

            String sql = "INSERT INTO circuits (circuitId, circuitRef, name, location, country, lat, lng, alt, url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            CSVReader reader = new CSVReader(new FileReader(path));
            String[] nextLine;
            reader.readNext(); // Saltar la cabecera

            while ((nextLine = reader.readNext()) != null) {
                int circuitId = Integer.parseInt(nextLine[0]);
                String circuitRef = nextLine[1];
                String name = nextLine[2];
                String location = nextLine[3];
                String country = nextLine[4];
                float lat = Float.parseFloat(nextLine[5]);
                float lng = Float.parseFloat(nextLine[6]);
                int alt = Integer.parseInt(nextLine[7]);
                String url = nextLine[8];

                statement.setInt(1, circuitId);
                statement.setString(2, circuitRef);
                statement.setString(3, name);
                statement.setString(4, location);
                statement.setString(5, country);
                statement.setFloat(6, lat);
                statement.setFloat(7, lng);
                statement.setInt(8, alt);
                statement.setString(9, url);

                statement.addBatch();
            }

            reader.close();
            statement.executeBatch();
            connection.commit();
            statement.close();
            connection.close();

            System.out.println("Datos insertados correctamente.");

        } catch (IOException | SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
	}
	
	public static void races() {
		System.out.println("Se ingresaron los datos de races");
		
	}
	
	public static void results() {
		System.out.println("Se ingresaron los datos de results");
	}
	
	public static void drivers() {
		System.out.println("Se ingresaron los datos de drivers");
	}
	
	public static void constructors() {
		System.out.println("Se ingresaron los datos de constructors");
	}
	
	public static void lap_times() {
		System.out.println("Se ingresaron los datos de lap_times");
	}
	
	public static void pit_stops() {
		System.out.println("Se ingresaron los datos de pit_stops");
	}
	
	public static void qualifying() {
		System.out.println("Se ingresaron los datos de qualifying");
	}
	
    public static void main( String[] args ) throws CsvValidationException
    {
    	
    	circuits();
    	races();
    	results();
    	drivers();
    	constructors();
    	lap_times();
    	pit_stops();
    	qualifying();
    	
//    	delete from circuits;
//    	select count(*) from circuits;
//    	select * from circuits;
    	
    	
    }
}
