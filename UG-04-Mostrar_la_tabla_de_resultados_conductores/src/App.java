import modelo.DriverResult;
import repositorio.DriverResultRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        DriverResultRepositorio driverResultRepository=new DriverResultRepositorio();
		var results = driverResultRepository.getResultByYear(2003);
		
		for(DriverResult rs: results) {
			System.out.println(rs.getDriverName() + "\t" + rs.getWins() + "\t"+ rs.getTotalPoints() + "\t"+ rs.getRank());
		}
        
    }
}
