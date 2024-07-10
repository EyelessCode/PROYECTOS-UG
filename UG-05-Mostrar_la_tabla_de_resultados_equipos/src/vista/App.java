package vista;
import java.util.List;

import modelo.ConstructorResult;
import modelo.DriverResult;
import modelo.Season;
import repositorio.ConstructorResultRepositorio;
import repositorio.DriverResultRepositorio;
import repositorio.SeasonRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        //! SEASON REPOSITORIO
        SeasonRepositorio sr=new SeasonRepositorio();
        List<Season> sList=sr.seasonAll();

        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'SEASON' ESTABLECIDA!"+"=".repeat(30));
        for (Season season : sList) {
            System.out.printf("\n--> %d\t--> %s", season.getYear(),season.getUrl());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");
        
        //? SEASON ORDENAR POR AÑO DE MENOR A MAYOR 
        List<Season> sListOrderByYear=sr.seasonOrderByYear();
        
        System.out.println("=".repeat(10)+"¡BASE DE DATOS 'SEASON' ORDENADO POR AÑO DE MAYOR A MENOR ESTABLECIDA!"+"=".repeat(10));
        for (Season season : sListOrderByYear) {
            System.out.printf("\n--> %d\t--> %s", season.getYear(),season.getUrl());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");

        //! DRIVER_RESULT REPOSITORIO
        DriverResultRepositorio dr = new DriverResultRepositorio();
        List<DriverResult> drList = dr.resultByYear(1985);
        
        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'DRIVER_RESULTS' POR AÑO ESTABLECIDA!"+"=".repeat(30));
        for (DriverResult rs : drList) {
            System.out.printf("\n--> %s\t--> %d\t--> %d\t --> %d\n",rs.getDriverName(), rs.getWins(), rs.getTotalPoints(), rs.getRank());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");

        //! CONSTRUCTOR_RESULT REPOSITORIO
        ConstructorResultRepositorio crr=new ConstructorResultRepositorio();
        List<ConstructorResult> crList = crr.ResultByYear(1985);
        
        System.out.println("=".repeat(30)+"¡BASE DE DATOS 'CONSTRUCTOR_RESULT' POR AÑO ESTABLECIDA!"+"=".repeat(30));
        for (ConstructorResult cr : crList) {
            System.out.printf("\n--> %s\t--> %d\t--> %d\t --> %d\n",cr.getName(), cr.getWins(), cr.getTotalPoints(), cr.getRank());
        }
        System.out.println("\n"+"=".repeat(90)+"\n");
    }

}
