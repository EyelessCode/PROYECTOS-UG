package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelo.DriverResult;

public class DriverResultRepositorio {
	String url="jdbc:mysql://127.0.0.1:3306/formula_01";
	String usuario="cristhian";
	String contrasenia="cris03022";

	public List<DriverResult> resultadoList() throws SQLException{
		Connection cnt=DriverManager.getConnection(url, usuario, contrasenia);
		System.out.println("=".repeat(30)+"¡BASE DE DATOS CONECTADA!"+"=".repeat(30));

		String sql = "SELECT\n"+
						"r.year,\n"+
						"d.forename,\n"+
						"d.surname,\n"+
						"COUNT(CASE WHEN res.position=1 THEN 1 END) AS wins,\n"+
						"SUM(res.points) AS total_points,\n"+
						"RANK() OVER (PARTITION BY r.year ORDER BY SUM(res.points) DESC) AS season_rank\n"+
						"FROM\n"+
							"results res\n"+
								"JOIN\n"+
									"races r ON res.raceId=r.raceId\n"+
								"JOIN\n"+
									"drivers d ON res.driverId=d.driverId\n"+
								"WHERE\n"+
									"r.year= ?\n"+
								"GROUP BY\n"+
									"r.year, d.driverId,d.forename,d.surname\n"+
								"ORDER BY\n"+
									"r.year,season_rank;";

		Statement st=cnt.prepareStatement(sql);
		ResultSet rs=st.executeQuery(sql);
		return null;
	}
}
