package relaciones;

import java.util.List;

public class Vista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void imprimirListado(List<Atacante> atacantes) {
        System.out.println("-------------- Listado ----------------");
        for(Atacante p: atacantes){
            System.out.println(p.toString()+ "Atacando:" +  p.atacar());
        }
    }

    public void mostrarCapacidad(double cap) {
        System.out.println("***** Capacidad de Ataque:"+ cap);
    }
}
