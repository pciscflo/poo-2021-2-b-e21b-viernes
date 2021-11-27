package factoria.navieras;

import java.util.List;
import java.util.Scanner;

public class EjercicioGrupalMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        JefeEnvios jefe = JefeEnvios.obtenerInstancia();

        Envio envioMar1 = Factoria.dameObjeto("MA","77777", "45.50", "5", "UPC Villa");
        jefe.registrarEnvio(envioMar1);

        Envio envioUltra1 = Factoria.dameObjeto("UM","88888", "358", "2", "345", "Lopez de Paz");
        jefe.registrarEnvio(envioUltra1);

        Envio envioMar2 = Factoria.dameObjeto("MA","99999", "77.70", "42", "Ferreiros S.A.");
        jefe.registrarEnvio(envioMar2);

        Envio envioMar3 = Factoria.dameObjeto("MA","99999", "100.50", "2", "Plaz VEA  Peru");
        jefe.registrarEnvio(envioMar3);

        List<Envio> envios1 = jefe.obtenerEnviosPorTipo(Maritimo.class);//hay otras formas de resolver
        System.out.println("************ Maritimos *************");
        for(Envio e:envios1){
            System.out.println(e.obtenerFila());
        }
        System.out.println("************ Ultramarinos **********");
        List<Envio> envios2 = jefe.obtenerEnviosPorTipo(Ultramaritimos.class);
        for(Envio e:envios2){
            System.out.println(e.obtenerFila());
        }
        System.out.println("Costo total de Envíos: " + jefe.obtenerCostoTotalEnvios());
        System.out.println("-------------------------------");
        System.out.println("Ingrese Codigo de Envio:");
        codigo = sc.nextInt();
        System.out.println("Costo del envio es:" + jefe.obtenerCalculoDeUnEnvio(codigo));


    }

}
