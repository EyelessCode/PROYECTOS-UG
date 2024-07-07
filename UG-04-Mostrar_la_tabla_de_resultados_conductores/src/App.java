import java.util.List;

import modelo.Circuit;
import repositorio.CircuitRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        CircuitRepositorio cr=new CircuitRepositorio();

        List<Circuit> cList=cr.circuitsGeneral();

        System.out.println("=".repeat(30)+"¡BASE DE DATOS ESTABLECIDA!"+"=".repeat(30));
        for (Circuit circuit : cList) {
            System.out.printf("\n--> %d   --> %s\t--> %s\t--> %s\t--> %s\n", circuit.getCircuitId(),circuit.getCircuitRef(),circuit.getName(),circuit.getLocation(),circuit.getCountry());
        }
        System.out.println("=".repeat(90));
        
    }
}
