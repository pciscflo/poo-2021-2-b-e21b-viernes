package com.upc.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DAO {
    public void leerArchivo(String path) throws  Exception{ //propagar el mensaje afuera
        Scanner sc = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            sc = new Scanner(fis);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            //grabar el error original en el log
            // y propagar una nueva Excepción con nuevo mensaje
            throw new Exception("No se puede leer el archivo, inténtelo de nuevo");
        } finally {
            if(fis!=null){
                fis.close();
            }
            if(sc!=null){
                sc.close();
            }
        }

    }
}
