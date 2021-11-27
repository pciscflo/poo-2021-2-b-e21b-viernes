package factoria.navieras;

public abstract class Envio {
    private int codigo;
    private double volumenMetrico;
    private int categoria;

    public Envio() {
    }

    public Envio(int codigo, double volumenMetrico, int categoria) {
        this.codigo = codigo;
        this.volumenMetrico = volumenMetrico;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getVolumenMetrico() {
        return volumenMetrico;
    }

    public void setVolumenMetrico(double volumenMetrico) {
        this.volumenMetrico = volumenMetrico;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public abstract double calcularCosto();
    public abstract String obtenerFila();

}
