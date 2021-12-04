package relaciones;

public class Soldado extends Atacante{

    private String nombre;
    private int grado;

    public Soldado(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public void validarGrado() throws Exception {
        if(this.grado<1 || this.grado>9) throw new Exception("Grado debe ser de 1 a 9");
    }

    public String atacar() {
        return "Piu!";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", grado=" + grado +
                '}';
    }
}
