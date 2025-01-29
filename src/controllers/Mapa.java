package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        LinkedHashMap();
        treemap();
    }
    public void hashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("tres", 3);
        map.put("Manzana",5);
        System.out.println(map);
        System.out.println("Hay Manzana: " + map.containsKey("Manzana"));
        System.out.println("Hay uno: " + map.containsKey("uno"));
        System.out.println("Valor de Manzana: " + map.get("Manzana"));
        //eliminar 
        map.remove("Manzana");
        System.out.println(map);
        System.out.println("--------------------------------------");
    }
    public void LinkedHashMap(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("Manzana ", 5);
        System.out.println(map);
        System.out.println("Hay manzana: " + map.containsKey("Manzana"));
        System.out.println("Hay uno: " + map.containsKey("uno"));
        System.out.println("Valor de Manzana: " + map.get("Manzana"));
        //eliminar
        map.remove("Manzana");
        System.out.println(map);
        System.out.println("----------------");

    }
    public void treemap(){
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("Manzana", 5);
        // Añadir un elemento con clave repetida
        System.out.println(map);
        System.out.println("Hay manzana: " + map.containsKey("Manzana"));
        System.out.println("Hay uno: " + map.containsKey("uno"));
        System.out.println("Valor de Manzana: " + map.get("Manzana"));
        //eliminar
        map.remove("Manzana");
        System.out.println(map);
        }
}
