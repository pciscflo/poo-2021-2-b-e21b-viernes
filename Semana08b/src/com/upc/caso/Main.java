package com.upc.caso;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("EL Padrino 2");
        Pelicula pelicula2 = new Pelicula("Batman 3");
        Pelicula pelicula3 = new Pelicula("EL Joker");
        Cine cine1 = new Cine();
        cine1.registrarSala("SALA001", pelicula1);
        cine1.registrarSala("SALA002", pelicula2);
        try {
            cine1.asignarAsientoASala("SALA002", "ASENTO000", 1, "A", "4DX");

            //Solo para saber los datos que se tiene como pruebas
            System.out.println("--LISTADO DE ASIENTOS DE SALA 002 Y CINE1");
            for (Sala p : cine1.getArregloSalas()) {
                if (p.getCodigo().equals("SALA002")) {
                    for (Asiento a : p.getArregloAsientos()) {
                        System.out.println(a);
                    }
                }
            }
            //
            System.out.println("RESPUESTA C");
            System.out.println(cine1.obtenerAsientoSalaMayorMontoVentas4X());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
