package com.upc.caso;

public class Asiento {
    private String codigo;
    private int fila;
    private String letra;
    private String categoria;

    public Asiento(String codigo, int fila, String letra, String categoria) {
        this.codigo = codigo;
        this.fila = fila;
        this.letra = letra;
        this.categoria = categoria;
    }

    public double obtenerPrecio(){
        double precio;
       if(categoria.equals("Regular")){
           precio = 20;
       } else if (categoria.equals("4DX")){
           precio = 45;
       } else
       {
           precio=0;
       }
       return precio;
    }
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "Codigo=" + codigo+
                "fila=" + fila +
                ", letra='" + letra + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
