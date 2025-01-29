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
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
