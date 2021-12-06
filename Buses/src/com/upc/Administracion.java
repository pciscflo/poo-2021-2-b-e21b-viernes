package com.upc;

import java.util.ArrayList;
import java.util.List;

public class Administracion {
    private List<Bus> buses;

    public Administracion() {
        this.buses = new ArrayList<>();
        for(int i=0; i<5;i++){ //i es el nunmero de buses
            Bus bus = new Bus(i,"BUS");
            bus.cargarAsientos();//cargo los 40 asientos del bus
            buses.add(bus);
        }
    }

    public Asiento reservarAsiento(){
        for (Bus bus:buses){
            Asiento asiento = bus.obtenerAsientoLibre();
            if (asiento!=null){
                asiento.setEstado(false);
                return asiento;
            }
        }
        return null;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
}
