package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoController { 
    private Map<Integer, Empleado> empleados;

    public EmpleadoController() {
        empleados = new HashMap<>();
        // Inicializar con algunos empleados
        empleados.put(1, new Empleado(1, "Pablo", "Senior"));
        empleados.put(2, new Empleado(2, "Ana", "Secretaria"));
        empleados.put(3, new Empleado(3, "Pedro", "Encargado"));
        empleados.put(4, new Empleado(4, "Maria", "Gerente"));
    }

    public boolean addEmpleado(Empleado empleado) {
        if (!empleados.containsKey(empleado.getId())) {
            empleados.put(empleado.getId(), empleado);
            return true; 
        }
        return false; 
    }
    

    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }

    public void displayEmpleados() { 
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }
    public void displayEmpleadosNombres(){
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getName());
        }
    }
    public void displayLlaves(){
        //Sin usar entryset
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }
    public void displayValores(){
        //Sin usar entryset
        for (Empleado value : empleados.values()) {
            System.out.println(value);
        }
    }
}
