package com.upc;

public class Main {
    public static void main(String[] args) {
        Administracion administracion = new Administracion();
        System.out.println(administracion.reservarAsiento());


        System.out.println("---------- LISTADO DEL BUS 0 ----------------------");

        for(Bus p:administracion.getBuses()){
            if(p.getNumeroBus()==0){
                for(Asiento asiento: p.getAsientos()){
                    System.out.println(asiento);
                }
            }
        }



    }
}
