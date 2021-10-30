package com.upc.herencia;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Profesor> profesores;

    public Universidad() {
        this.profesores = new ArrayList<>();
    }
    public double calcularPromedioSueldos(){
        double suma = 0;
        for(Profesor p: profesores){
            suma+=p.calcularSueldo();//polimorfismo
        }
        return (suma/profesores.size());
    }
    public void registrar(Profesor profesor){
        this.profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

}
