package com.upc.objetos;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Alumno> alumnos;

    public Administrador() {
        alumnos = new ArrayList<>();
    }
    public void registrar(Alumno alumno){
        alumnos.add(alumno);
    }
    public int calcularSumaTotalNotas(){
        int suma = 0;
        for(Alumno p:alumnos){
            suma+= (p.getT1() + p.getT2());
        }
        return suma;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
