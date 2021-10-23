package com.upc.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1, t2;

        System.out.println("Ingrese Nota t1:");
        t1 = sc.nextInt();//leer nota del teclado
        System.out.println("Ingrese Nota t2:");
        t2 = sc.nextInt();//leer nota del teclado

        Alumno alumno1 = new Alumno("20212345A","Pepe",t1, t2);
        Alumno alumno2 = new Alumno("2021304589E", "Jorge",80,80);

        System.out.println("Alumno 1: " + alumno1.obtenerResultado());
        System.out.println("Alumno 2: " + alumno2.obtenerResultado());
        //declarando un arreglo de objetos de la clase Alumno
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        System.out.println("****** Reporte  *********");
        for(Alumno p:alumnos){
           // System.out.println(p.getNombre() + "   " + p.obtenerResultado());
            System.out.println(p.toString());
        }
    }
}
