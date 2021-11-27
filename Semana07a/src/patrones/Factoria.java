package patrones;

public class Factoria {
    public static Figura dameFigura(String tipo){
        switch (tipo){
            case "CI":
                return new Circulo();
            case "CU":
                return  new Cuadrado();
            case "RE":
                return  new Rectangulo();
            default:
                return null;
        }
    }
}
