package relaciones;

public class Factoria {
     public static Atacante dameInstancia(String... argumentos){
         switch (argumentos[0]){
             case "SOL":
                         return new Soldado(argumentos[1], Integer.parseInt(argumentos[2]));
             case "TAN":
                         return new Tanque(argumentos[1],argumentos[2],argumentos[3]);
             default:
                         return null;
         }

     }
}
