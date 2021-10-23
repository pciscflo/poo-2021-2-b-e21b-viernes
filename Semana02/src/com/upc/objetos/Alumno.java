package com.upc.objetos;

public class Alumno {
    private String codigo;
    private String nombre;
    private int t1;
    private int t2;

    public Alumno(String codigo, String nombre, int t1, int t2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.t1 = t1;
        this.t2 = t2;
    }

    public String obtenerResultado(){
        String resultado;
        if(t1>85 && t2>85){
            resultado = "Aprobado";
        } else if (t1>85 || t2>85){
            resultado = "Observado";
        } else if (t1 <=85 && t2<=85){
            resultado = "Reprobado";
        } else{
            resultado="Indeterminado";
        }
        return resultado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", t1=" + t1 +
                ", t2=" + t2 + ", resultado=" + obtenerResultado() +
                '}';
    }
}
