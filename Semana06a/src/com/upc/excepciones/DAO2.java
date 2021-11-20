package com.upc.excepciones;

public class DAO2 {
    public void validaEdad(int edad) throws Exception{
        if (edad<18){
            throw new Exception("no puede ser menor de edad");
        }
    }
}
