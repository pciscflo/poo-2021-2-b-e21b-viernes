package com.upc.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Animal> arregloAnimales;

    public Veterinaria() {
        this.arregloAnimales = new ArrayList<>();
    }

    public void registrar(Animal animal){
        this.arregloAnimales.add(animal);
    }

    public List<Animal> getArregloAnimales() {
        return arregloAnimales;
    }

    public void setArregloAnimales(List<Animal> arregloAnimales) {
        this.arregloAnimales = arregloAnimales;
    }
}
