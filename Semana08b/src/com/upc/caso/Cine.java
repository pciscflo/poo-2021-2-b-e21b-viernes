package com.upc.caso;

import java.util.List;

public class Cine {
    private List<Sala> arregloSalas;

    public void registrarSala(String codigo,Pelicula pelicula){
      Sala sala = new Sala(codigo,pelicula);
      this.arregloSalas.add(sala);
    }

    public void asignarAsientoASala(String codigo,int fila, String letra, String categoria ){
        Sala sala = buscarSala(codigo);
        if(buscarSala(codigo)!=null){
            sala.registrarAsiento(fila, letra, categoria);
        }
        else {
            System.out.println("Sala duplicada.");
        }
    }



    public Sala buscarSala(String codigo){
        for(Sala p: this.arregloSalas){
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        return null;
    }

    public List<Sala> getArregloSalas() {
        return arregloSalas;
    }

    public void setArregloSalas(List<Sala> arregloSalas) {
        this.arregloSalas = arregloSalas;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "arregloSalas=" + arregloSalas +
                '}';
    }
}
