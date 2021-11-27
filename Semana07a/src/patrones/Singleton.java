package patrones;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton dameInstancia(){
        return singleton;
    }

    public String obtenerMensaje(){
        return "Holas!!!";
    }

}
