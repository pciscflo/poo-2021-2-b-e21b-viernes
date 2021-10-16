package com.ripley.introduccion;

public class Auto {
    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
    //private  double descuento;//todo le que se pueda calcular NO es propiedad

    public Auto(String codigo, String marca, String modelo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double calcularDescuento(){ //comportamiento/metodo/operacion/Deben inciarse con un verbo
        double descuento =0;
        if (precio>10000){
            descuento = precio*0.10;
        }
        return descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
