import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoController empleadoContoller = new EmpleadoController();
        boolean result = empleadoContoller.addEmpleado(new Empleado(1,"pablo","senior" ));
        System.out.println("Ingreso "+ result);
         result = empleadoContoller.addEmpleado(new Empleado(1,"pablo","senior" ));
         System.out.println("Ingreso "+ result);
         System.out.println("\nVerificar");
         empleadoContoller.addEmpleado(new Empleado(1,"pablo","senior" ));
         empleadoContoller.addEmpleado(new Empleado(2,"pab","senir" ));
         empleadoContoller.addEmpleado(new Empleado(3,"pabo","ser" ));
        System.out.println("\nLista de empleados");
        empleadoContoller.displayEmpleados();
        System.out.println("\nSolo por nombres");
        empleadoContoller.displayEmpleadosNombres();
        System.out.println("\nLlaves");
        empleadoContoller.displayLlaves();
        System.out.println("\nValores");
        empleadoContoller.displayValores();
    }

    private static void runMapExamlpe() {
    new Mapa();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        
        // Prueba del método areAnagrams
        System.out.println("\nEjercicio de anagramas:");
        System.out.println("Input: str1 = \"listen\", str2 = \"silent\"");
        System.out.println("Output: " + ejercicios.areAnagrams("listen", "silent"));
        
        System.out.println("Input: str1 = \"hello\", str2 = \"bello\"");
        System.out.println("Output: " + ejercicios.areAnagrams("hello", "bello"));
    
        System.out.println("Input: str1 = \"triangle\", str2 = \"integral\"");
        System.out.println("Output: " + ejercicios.areAnagrams("triangle", "integral"));
    
        // Prueba del método sumatoriaDeDos
        System.out.println("\nEjercicio de sumatoria de dos números:");
    
        int[] resultadoA = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        int[] resultadoB = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
    
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5");
        System.out.println("Output: " + (resultadoA != null ? "[" + resultadoA[0] + ", " + resultadoA[1] + "]" : "null"));
    
        System.out.println("Input: nums = [9,2,3,6], objetivo = 10");
        System.out.println("Output: " + (resultadoB != null ? "[" + resultadoB[0] + ", " + resultadoB[1] + "]" : "null"));
    }
    
    
    
    
}
