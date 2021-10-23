package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(2);
        Circulo circulo3 = new Circulo(5);

        System.out.println("Area del Circulo de radio " + circulo1.getRadio() + " es:" +
                circulo1.calcularArea());
        System.out.println("Area del Circulo de radio " + circulo2.getRadio() + " es:" +
                circulo2.calcularArea());
        System.out.println("Area del Circulo de radio " + circulo3.getRadio() + " es:" +
                circulo3.calcularArea());

    }
}
