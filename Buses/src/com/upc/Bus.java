package com.upc;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int numeroBus;
    private String descripcion;
    private List<Asiento> asientos;

    public Bus(int numeroBus, String descripcion) {
        this.numeroBus = numeroBus;
        this.descripcion = descripcion;
        asientos = new ArrayList<>();
    }

    public void cargarAsientos(){
        for(int i=1; i<=40;i++){
            asientos.add(new Asiento(i,"Unico",true, this));
        }
    }

    public Asiento obtenerAsientoLibre(){    //automatico no necesariamente es aleatorio
        for(Asiento asiento:asientos){
            if(asiento.isEstado()){
                return asiento;
            }
        }
        return null;
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(int numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numeroBus=" + numeroBus +
                ", descripcion='" + descripcion + '\'' +
          //      ", asientos=" + asientos +
                '}';
    }
}
