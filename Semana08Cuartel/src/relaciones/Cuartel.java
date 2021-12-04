package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Cuartel { //MODELO
    private String codigo;
    private String nombre;
    private List<Atacante> arregloAtancantes;

    public Cuartel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arregloAtancantes = new ArrayList<>();
    }
    public void registrar(Atacante atacante) throws Exception{
        if(atacante instanceof Soldado){
            ((Soldado) atacante).validarGrado();
            this.getArregloAtancantes().add(atacante);
        }else {
            this.arregloAtancantes.add(atacante);
        }
    }
    public  double obtenerCapacidadAtaque(){
        //obtener el promedio de edades de los soldados
        double suma = 0;
        int contadorSoldados=0;
        for(Atacante p: this.arregloAtancantes){
            if(p instanceof Soldado){
                suma+=((Soldado) p).getGrado();
                contadorSoldados++;
            }
        }
        return suma/contadorSoldados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Atacante> getArregloAtancantes() {
        return arregloAtancantes;
    }

    public void setArregloAtancantes(List<Atacante> arregloAtancantes) {
        this.arregloAtancantes = arregloAtancantes;
    }
}
