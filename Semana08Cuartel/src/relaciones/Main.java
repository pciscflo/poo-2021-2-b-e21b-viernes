package relaciones;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Cuartel cuartel = new Cuartel("ARM100","Husares");
        Controlador controlador = new Controlador(vista,cuartel);
        controlador.registrarAtacante("TAN","Ruso1","Tubo34","Explot1");//TDD
        controlador.registrarAtacante("TAN","Americano","Flash1","Balines");
        controlador.registrarAtacante("SOL","Pepe", "17");
        controlador.registrarAtacante("SOL","Juan", "19");
        controlador.registrarAtacante("SOL","Jorge", "5");
        controlador.imprimirListadAtacantes();
        controlador.mostrarCapacidadAtaque();


    }
}
