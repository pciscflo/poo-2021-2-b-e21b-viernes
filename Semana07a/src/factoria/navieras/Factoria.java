package factoria.navieras;

public class Factoria {
    public static Envio dameObjeto(String... argumentos){
        Envio envio=null;
        switch (argumentos[0]){//0 es el tipo
            case "MA":
                envio = new Maritimo(Integer.parseInt(argumentos[1]), Double.parseDouble(argumentos[2]),
                        Integer.parseInt(argumentos[3]), argumentos[4]);
            break;
            case "UM":
                envio = new Ultramaritimos(Integer.parseInt(argumentos[1]),Double.parseDouble(argumentos[2]),
                        Integer.parseInt(argumentos[3]), Integer.parseInt(argumentos[4]), argumentos[5]);
                break;
        }
        return envio;
    }

}
