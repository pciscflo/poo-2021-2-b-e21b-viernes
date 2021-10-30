package com.upc.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato("Lucas");
        Perro perro = new Perro("Boby");
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.registrar(pato);
        veterinaria.registrar(perro);
        for(Animal p:veterinaria.getArregloAnimales()){
            p.sonido();//polimorfismo dinámico
        }
    }
}
