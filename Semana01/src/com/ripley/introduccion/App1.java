package com.ripley.introduccion;

public class App1 {
    public static void main(String[] args) {
        System.out.println("Hola mundo!!");
        Auto auto1 = new Auto("12","Toyota","Yaris",18000);
        System.out.println(auto1.getCodigo());
        System.out.println(auto1.calcularDescuento());
        System.out.println(auto1.getPrecio());

    }
}
