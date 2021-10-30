package com.upc.herencia;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProfesorTP profesorTP = new ProfesorTP("2012455","0785622","Pepe",
                100,20);
        System.out.println("Sueldo Final:" + profesorTP.calcularSueldo());
        ProfesorTC profesorTC = new ProfesorTC("20201344","88888888","Carlos",
                1200,0.12);
        System.out.println("Sueldo Fijo:" + profesorTC.calcularSueldo());
    }
}
