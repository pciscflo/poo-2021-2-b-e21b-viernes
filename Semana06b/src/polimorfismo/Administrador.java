package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Participante> arregloParticipantes;

    public Administrador() {
        this.arregloParticipantes = new ArrayList<>();
    }

    public void registrar(Participante participante) throws Exception{
        participante.validadEdad();
        this.arregloParticipantes.add(participante);
    }

    public Participante obtenerGanador(){
        int maximo = 0;
        Participante mayor=null;
        for(Participante p: this.arregloParticipantes){
            if(p.calcularPuntaje()>maximo){
                maximo = p.calcularPuntaje();
                mayor = p;
            }
        }
        return mayor;
    }

    public Participante buscar(String dni){
        for(Participante p: this.arregloParticipantes){
            if(p.getDni().equals(dni)){
                return p;
            }
        }
        return null;//que significaría no lo encontró
    }

    public List<Participante> getArregloParticipantes() {
        return arregloParticipantes;
    }

    public void setArregloParticipantes(List<Participante> arregloParticipantes) {
        this.arregloParticipantes = arregloParticipantes;
    }
}
