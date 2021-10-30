package com.upc.polimorfismo;

public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    public void sonido() {
        System.out.println(super.getNombre()+ ":Guau, guau,...");
    }
}
