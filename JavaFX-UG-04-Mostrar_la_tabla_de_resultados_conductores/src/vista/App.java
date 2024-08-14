package vista;
import java.util.List;

import controlador.InterfazController;
import javafx.application.Application;
import javafx.stage.Stage;
import modelo.Circuit;
// import modelo.Driver;
import modelo.DriverResult;
import modelo.Season;
import repositorio.CircuitRepositorio;
import repositorio.DriverResultRepositorio;
import repositorio.SeasonRepositorio;

public class App extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        //! INSTANCIA DEL CONTROLADOR DE LA INTERFAZ
        InterfazController ic=new InterfazController();
        ic.start(arg0);
    }

    public static void main(String[] args) throws Exception {
        //! CIRCUIT REPOSITORIO
        CircuitRepositorio cr=new CircuitRepositorio();
        
        List<Circuit> cList=cr.circuitsGeneral();

        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'CIRCUITS' ESTABLECIDA!"+"=".repeat(30));
        for (Circuit circuit : cList) {
            System.out.printf("\n--> %d   --> %s\t--> %s\t--> %s\t--> %s\n", circuit.getCircuitId(),circuit.getCircuitRef(),circuit.getName(),circuit.getLocation(),circuit.getCountry());
        }
        System.out.println("=".repeat(90));
        
        //! CIRCUIT BY COUNTRY REPOSITORIO
        List<Circuit> cByCountryList=cr.circuitsByCountry("Spain");
        
        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'CIRCUITS' POR PAÍS ESTABLECIDA!"+"=".repeat(30));
        for (Circuit circuit : cByCountryList) {
            System.out.printf("\n--> %s\t--> %s\t--> %s\n",circuit.getCountry(),circuit.getName(),circuit.getLocation());
        }
        System.out.println("=".repeat(90));
        
        //! DRIVER_RESULT REPOSITORIO
        DriverResultRepositorio dr = new DriverResultRepositorio();
        List<DriverResult> drList = dr.resultadoByYearList(1999);
        
        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'DRIVER_RESULTS' POR AÑO ESTABLECIDA!"+"=".repeat(30));
        for (DriverResult rs : drList) {
            System.out.printf("\n--> %s\t--> %d\t--> %d\t --> %d\n",rs.getDriverName(), rs.getWins(), rs.getTotalPoints(), rs.getRank());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");
        
        //! SEASON REPOSITORIO
        SeasonRepositorio sr=new SeasonRepositorio();
        List<Season> sList=sr.seasonLimit();

        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'SEASON' ESTABLECIDA!"+"=".repeat(30));
        for (Season season : sList) {
            System.out.printf("\n--> %d\t--> %s", season.getYear(),season.getUrl());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");
        
        //? SEASON ORDENAR POR AÑO DE MENOR A MAYOR 
        List<Season> sListOrderByYear=sr.seasonOrderByYearLimit();
        
        System.out.println("=".repeat(10)+"¡BASE DE DATOS 'SEASON' ORDENADO POR AÑO DE MAYOR A MENOR ESTABLECIDA!"+"=".repeat(10));
        for (Season season : sListOrderByYear) {
            System.out.printf("\n--> %d\t--> %s", season.getYear(),season.getUrl());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");

        //! LLAMADO A LA INTERFAZ
        launch(args);
    }

}
