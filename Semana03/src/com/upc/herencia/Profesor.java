package com.upc.herencia;

public abstract class Profesor {
    private String codigo;
    private String dni;
    private String nombre;
    public abstract double calcularSueldo();

    public Profesor(String codigo, String dni, String nombre) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Profesor() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
