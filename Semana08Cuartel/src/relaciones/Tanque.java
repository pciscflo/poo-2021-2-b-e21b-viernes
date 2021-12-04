package relaciones;

public class Tanque extends Atacante{
    private String modelo;
    private Torreta torreta;

    public Tanque(String modeloTanque, String modeloTorreta, String tipoMunicion ) {
        this.modelo = modeloTanque;
        this.torreta = new Torreta(modeloTorreta,tipoMunicion);
    }
    public Tanque(String modelo) {
        this.modelo = modelo;
    }
    public void asignarTorreta(String modeloTorreta, String tipoMunicion){
        this.torreta = new Torreta(modeloTorreta, tipoMunicion);
    }

    public String atacar(){
        return "Pow!";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Torreta getTorreta() {
        return torreta;
    }

    public void setTorreta(Torreta torreta) {
        this.torreta = torreta;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "modelo='" + modelo + '\'' +
                ", torreta=" + torreta +
                '}';
    }
}
