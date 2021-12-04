package com.upc.caso;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private List<Sala> arregloSalas;

    public Cine() {
        this.arregloSalas = new ArrayList<>();
    }

    public void registrarSala(String codigo, Pelicula pelicula){
      Sala sala = new Sala(codigo,pelicula);
      this.arregloSalas.add(sala);
    }

    public void asignarAsientoASala(String codigoSala,String codigoAsiento, int fila,
                                    String letra, String categoria ) throws Exception {
        Sala sala = buscarSala(codigoSala);
        if(buscarSala(codigoSala)!=null){
            sala.registrarAsiento(codigoAsiento,fila, letra, categoria);
        }
        else {
            throw new Exception("SALA NO EXISTENTE");
        }
    }

    public Asiento obtenerAsientoSalaMayorMontoVentas4X(){
        double maximo = 0;
        Sala salaTemporal=null;
        for(Sala sala: this.arregloSalas){
            if(sala.obtenerMontoToalVentaDeSala()>maximo){
                maximo = sala.obtenerMontoToalVentaDeSala();
                salaTemporal = sala;
            }
        }
        for (Asiento asiento:salaTemporal.getArregloAsientos()){
            if(asiento.getCategoria()=="4DX"){
                return asiento;
            }
        }
        return null;
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
