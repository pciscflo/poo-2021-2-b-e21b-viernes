package com.upc.objetos;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("20214568E","Luis", 90, 90);
        Alumno alumno2 = new Alumno("2019385478T","Miguel", 98, 56);
        Alumno alumno3 = new Alumno("201839458R","Raquel",97, 76);
        Administrador administrador = new Administrador();
        administrador.registrar(alumno1);
        administrador.registrar(alumno2);
        administrador.registrar(alumno3);
        System.out.println("Suma Notas:" + administrador.calcularSumaTotalNotas());
        List<Alumno> lista =  administrador.getAlumnos();
        System.out.println("------ Listado -------");
        for(Alumno p:lista){
            System.out.println(p.toString());
        }

    }
}
