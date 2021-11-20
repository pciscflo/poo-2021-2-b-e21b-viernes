package polimorfismo;

public class Televidente extends Participante{
    private String numeroTelefonico;
    private int cantidadLlamadas;

    public Televidente(String nombre, String apellido, String dni, int edad, int cantidadMensajes,
                       String numeroTelefonico, int cantidadLlamadas) {
        super(nombre, apellido, dni, edad, cantidadMensajes);
        this.numeroTelefonico = numeroTelefonico;
        this.cantidadLlamadas = cantidadLlamadas;
    }


    public int calcularPuntaje() {
        return (this.getCantidadMensajes()*4 + this.cantidadLlamadas*3);
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getCantidadLlamadas() {
        return cantidadLlamadas;
    }

    public void setCantidadLlamadas(int cantidadLlamadas) {
        this.cantidadLlamadas = cantidadLlamadas;
    }

    @Override
    public String toString() {
        return "Televidente{" +
                "numeroTelefonico='" + numeroTelefonico + '\'' +
                ", cantidadLlamadas=" + cantidadLlamadas +
                "} " + super.toString();
    }
}
