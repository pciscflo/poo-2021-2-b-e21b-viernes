package com.upc;

public class Asiento {
    private int numeroAsiento;
    private String detalle;
    private boolean estado; //true=libre, false=ocupado
    private Bus bus;

    public Asiento(int numeroAsiento, String detalle, boolean estado, Bus bus) {
        this.numeroAsiento = numeroAsiento;
        this.detalle = detalle;
        this.estado = estado;
        this.bus = bus;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numeroAsiento=" + numeroAsiento +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                ", bus=" + bus +
                '}';
    }
}
