package com.upc.polimorfismo;

public class Pato extends Animal{

    public Pato(String nombre) {
        super(nombre);
    }

    public void sonido() {
        System.out.println(this.getNombre() + ": Cuak, cuak,...");
    }
}
