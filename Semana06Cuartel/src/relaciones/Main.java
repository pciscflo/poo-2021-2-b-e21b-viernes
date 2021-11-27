package relaciones;

public class Main {
    public static void main(String[] args) {
       // Tanque tanque0 = new Tanque("Ruso1","Tubo34","Explot1");
        Atacante tanque1 = Factoria.dameInstancia("TAN","Ruso1","Tubo34","Explot1");
        Atacante tanque2 = Factoria.dameInstancia("TAN","Americano","Flash1","Balines");
        Atacante soldado1 = Factoria.dameInstancia("SOL","Pepe", "17");
        Atacante soldado2 = Factoria.dameInstancia("SOL","Juan", "19");
        Atacante soldado3 = Factoria.dameInstancia("SOL","Jorge", "5");
        Cuartel cuartel = new Cuartel("ARM100","Husares");
        try {
            cuartel.registrar(tanque1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(tanque2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Capacidad de Ataque:"+cuartel.obtenerCapacidadAtaque());
        System.out.println("--------------****----------------");
        for(Atacante p: cuartel.getArregloAtancantes()){
            System.out.println(p.toString()+ "Atacando:" +  p.atacar());
        }
    }
}
