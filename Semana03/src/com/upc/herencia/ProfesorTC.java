package com.upc.herencia;

public class ProfesorTC extends Profesor{
    private double sueldoFijo;
    private double porcAFP;

    public double calcularSueldo(){
        return  (this.sueldoFijo - sueldoFijo*porcAFP);
    }

    public ProfesorTC(String codigo, String dni, String nombre, double sueldoFijo, double porcAFP) {
        super(codigo, dni, nombre);
        this.sueldoFijo = sueldoFijo;
        this.porcAFP = porcAFP;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public double getPorcAFP() {
        return porcAFP;
    }

    public void setPorcAFP(double porcAFP) {
        this.porcAFP = porcAFP;
    }
}
