package relaciones;

import java.util.List;

public class Controlador {
    private Vista vista;
    private Cuartel cuartel;

    public Controlador(Vista vista, Cuartel cuartel) {
        this.vista = vista;
        this.cuartel = cuartel;
    }

    public void registrarAtacante(String... argumentos){
        //crear un objeto tipo X y luego registrarlo en el arreglo que maneja el modelo
        try {
            Atacante atacante = Factoria.dameInstancia(argumentos);
            cuartel.registrar(atacante);
        }catch(Exception e){
            vista.mostrarMensaje(e.getMessage());
        }
    }

    public void imprimirListadAtacantes() {
        List<Atacante> atacantes = cuartel.getArregloAtancantes();
        vista.imprimirListado(atacantes);
    }

    public void mostrarCapacidadAtaque() {
       double cap = cuartel.obtenerCapacidadAtaque();
       vista.mostrarCapacidad(cap);
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }


}
