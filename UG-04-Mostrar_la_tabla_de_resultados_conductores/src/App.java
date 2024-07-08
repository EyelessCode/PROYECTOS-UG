import java.util.List;

import modelo.Circuit;
// import modelo.Driver;
import modelo.DriverResult;
import repositorio.CircuitRepositorio;
import repositorio.DriverResultRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        //? CIRCUIT REPOSITORIO
        CircuitRepositorio cr=new CircuitRepositorio();
        
        List<Circuit> cList=cr.circuitsGeneral();

        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'CIRCUITS' ESTABLECIDA!"+"=".repeat(30));
        for (Circuit circuit : cList) {
            System.out.printf("\n--> %d   --> %s\t--> %s\t--> %s\t--> %s\n", circuit.getCircuitId(),circuit.getCircuitRef(),circuit.getName(),circuit.getLocation(),circuit.getCountry());
        }
        System.out.println("=".repeat(90));
        
        //? DRIVER_RESULT REPOSITORIO
        DriverResultRepositorio dr = new DriverResultRepositorio();
        List<DriverResult> results = dr.resultadoByYearList(2009);
        
        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'DRIVER_RESULTS' ESTABLECIDA!"+"=".repeat(30));
        for (DriverResult rs : results) {
            System.out.printf("\n--> %s \t--> %d \t--> %d \t --> %d \n",rs.getDriverName(), rs.getWins(), rs.getTotalPoints(), rs.getRank());
        }
        System.out.println("=".repeat(90));

    }
}
