package com.upc.excepciones;

public class Main {
    public static void main(String[] args) {
        Negocio negocio = new Negocio();
        try {
            negocio.buscarArchivo("D:/Tempo/carta.txt");
            System.out.println("Se leyó el archivo completo");
        } catch (Exception e) {
            System.out.println("Cliente:" + e.getMessage());
        }


    }
}
