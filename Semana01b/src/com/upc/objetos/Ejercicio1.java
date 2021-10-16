package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("102345","Carlos",19, 18);
        System.out.println("Nombre:" + alumno1.getNombre());
        System.out.println("Promedio:"+ alumno1.calcularPromedio());
    }
}
