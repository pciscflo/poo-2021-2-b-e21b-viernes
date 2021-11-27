package patrones;

public class Ejercicio2 {
    public static void main(String[] args) {
        //acoplados
        Cuadrado cuadrado1 = new Cuadrado();
        System.out.println(cuadrado1.pintar());
        System.out.println(cuadrado1.borrar());
        //descoplados
        Figura cuadrado2 = Factoria.dameFigura("CU");
        System.out.println(cuadrado2.pintar());
        // System.out.println(cuadrado2.borrar()); // no es posible

    }
}
