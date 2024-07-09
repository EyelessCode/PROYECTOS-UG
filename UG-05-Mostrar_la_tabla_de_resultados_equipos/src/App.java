import java.util.List;

import modelo.Season;
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
    }
}
