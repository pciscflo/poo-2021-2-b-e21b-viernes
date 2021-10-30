package com.upc.herencia;

public class ProfesorTP extends Profesor{

    private double tarifaHora;
    private int horas;

    public ProfesorTP(String codigo, String dni, String nombre, double tarifaHora, int horas) {
        super(codigo, dni, nombre);
        this.tarifaHora = tarifaHora;
        this.horas = horas;
    }

    public double calcularSueldo() {
        return (this.tarifaHora*this.horas);
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
