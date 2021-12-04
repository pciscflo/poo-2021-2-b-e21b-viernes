package com.upc.caso;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String codigo;
    private List<Asiento> arregloAsientos;
    private Pelicula pelicula;

    public Sala(String codigo, Pelicula pelicula) {
        this.codigo = codigo;
        this.pelicula = pelicula;
        this.arregloAsientos = new ArrayList<>();
    }
    public void registrarAsiento(int fila, String letra, String categoria){
        Asiento asiento = new Asiento(fila, letra, categoria);
        this.arregloAsientos.add(asiento);
    }

    public double obtenerMontoToalVentaDeSala(){
        double suma = 0;
        for(Asiento p:this.arregloAsientos){
            suma+=p.obtenerPrecio();
        }
        return suma;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Asiento> getArregloAsientos() {
        return arregloAsientos;
    }

    public void setArregloAsientos(List<Asiento> arregloAsientos) {
        this.arregloAsientos = arregloAsientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
