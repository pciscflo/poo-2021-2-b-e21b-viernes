package factoria.navieras;

public class Maritimo extends Envio{
    private String razonSocial;

    public Maritimo() {
    }

    public Maritimo(int codigo, double volumenMetrico, int categoria, String razonSocial) {
        super(codigo, volumenMetrico, categoria);
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double calcularCosto(){
        double vol_metrico = getVolumenMetrico();
        return  (vol_metrico*100 + (vol_metrico*getCategoria())*25 );
    }

    public String obtenerFila(){//la idea es no usar println en las clases modelo sólo en main
        return getCodigo()+ "  "+ getRazonSocial() + "  " + getVolumenMetrico()+
        "  " + getCategoria() + "  " + calcularCosto();
    }
}
