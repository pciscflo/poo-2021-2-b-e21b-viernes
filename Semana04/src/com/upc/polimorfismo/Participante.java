package com.upc.polimorfismo;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int cantidadMensajes;

    public Participante(String nombre, String apellido, String dni, int edad, int cantidadMensajes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cantidadMensajes = cantidadMensajes;
    }

    public abstract int calcularPuntaje();

    public boolean validadEdad(){
         if(this.edad>=18){
            return true;
        }else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadMensajes() {
        return cantidadMensajes;
    }

    public void setCantidadMensajes(int cantidadMensajes) {
        this.cantidadMensajes = cantidadMensajes;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", cantidadMensajes=" + cantidadMensajes +
                '}';
    }
}
