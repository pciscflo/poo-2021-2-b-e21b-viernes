package patrones;

public class Ejercicio1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.dameInstancia();
        System.out.println(s1.obtenerMensaje());
        Singleton s2 = Singleton.dameInstancia();
        System.out.println(s2.obtenerMensaje());
        if(s1 == s2){
            System.out.println("Iguales");
        }

    }
}
