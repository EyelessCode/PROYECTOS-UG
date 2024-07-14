package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.DriverResult;

public class DriverResultRepositorio {
	String url="jdbc:postgresql://localhost:5432/ug_formula01";
	String usuario="cristhian";
	String contrasenia="cris03022";

	public List<DriverResult> resultByYear(int year) throws SQLException{
		List<DriverResult> driverResultslList=new ArrayList<DriverResult>();

		try{
			Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);

			String sql = "SELECT\n"+
			"			r.year,\n"+
			"			d.forename,\n"+
			"			d.surname,\n"+
			"			COUNT(CASE WHEN res.position = 1 THEN 1 END) AS wins,\n"+
			"			SUM(res.points) AS total_points,\n"+
			"			RANK() OVER (PARTITION BY r.year ORDER BY SUM(res.points) DESC) AS season_rank \n"+
			"		FROM\n"+
			"			results res\n"+
			"		JOIN\n"+
			"			races r ON res.race_id = r.race_id\n"+
			"		JOIN\n"+
			"			drivers d ON res.driver_id = d.driver_id\n"+
			"		WHERE r.year = ?\n"+
			"		GROUP BY\n"+
			"			r.year, d.driver_id, d.forename, d.surname\n"+
			"		ORDER BY\n"+
			"			r.year, season_rank;";

				PreparedStatement ps = cnt.prepareStatement(sql);
				ps.setInt(1, year);
	
				ResultSet rs = ps.executeQuery();

			while (rs.next()) {
					String forename = rs.getString("forename");
					String surname = rs.getString("surname");
					int wins = rs.getInt("wins");
					int total_points = rs.getInt("total_points");
					int season_rank = rs.getInt("season_rank");
					
					DriverResult dr = new DriverResult(forename + " " + surname, wins, total_points, season_rank);
                    driverResultslList.add(dr);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("\n"+"=".repeat(30)+"¡ERROR EN LA BASE DE DATOS!"+"=".repeat(30)+"\n");
		}

		return driverResultslList;
	}

}
