package factoria.navieras;

import java.util.ArrayList;
import java.util.List;

public class JefeEnvios { //DAO Singleton

    private static JefeEnvios jefeEnvios = new JefeEnvios("Unico");

    private List<Envio> envios; // ArrayList<Envio> envios;//no es correcto
    private String nombre;

    public static JefeEnvios obtenerInstancia(){
        return jefeEnvios;
    }

    private JefeEnvios() {
    }

    private JefeEnvios( String nombre) {
        this.nombre = nombre;
        envios =  new ArrayList<>();
    }

    public void registrarEnvio(Envio envio){  //Envio <--- Maritimo o Utramaritimo // Liskov
        if( validarDuplicidad(envio) ) {
            this.envios.add(envio);

        }else {
            System.out.println("Codigo de Envio ya Registrado.");
        }
    }

    public boolean validarDuplicidad(Envio envio){
        for ( Envio e:envios ){
            if(envio.getCodigo() == e.getCodigo()){
                return false;
            }
        }
        return true;
    }

    public List<Envio> obtenerEnviosPorTipo(Class envio){
        double costoTotal = 0;
        List<Envio> temporal =new ArrayList<>();
        for ( Envio e:envios ){
            if(e.getClass()==envio)
            {
                temporal.add(e);
            }
        }
        return temporal;
    }
    public double obtenerCostoTotalEnvios(){
        double total = 0;
        for(Envio p:envios){
            total+=p.calcularCosto();
        }
        return total;
    }
    public double obtenerCalculoDeUnEnvio(int codigoEnvio){
        for (Envio p: this.envios){
            if (p.getCodigo()==codigoEnvio){
                return p.calcularCosto();
            }
        }
        return 0;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
