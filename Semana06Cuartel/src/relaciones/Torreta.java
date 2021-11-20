package relaciones;

public class Torreta {
    private String modelo;
    private String tipoMunicion;

    public Torreta(String modelo, String tipoMunicion) {
        this.modelo = modelo;
        this.tipoMunicion = tipoMunicion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMunicion() {
        return tipoMunicion;
    }

    public void setTipoMunicion(String tipoMunicion) {
        this.tipoMunicion = tipoMunicion;
    }

    @Override
    public String toString() {
        return "Torreta{" +
                "modelo='" + modelo + '\'' +
                ", tipoMunicion='" + tipoMunicion + '\'' +
                '}';
    }
}
