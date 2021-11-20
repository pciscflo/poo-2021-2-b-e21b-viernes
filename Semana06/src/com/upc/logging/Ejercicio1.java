package com.upc.logging;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Ejercicio1 {
    private static Logger logger = Logger.getLogger(Ejercicio1.class.getName());

    public static void main(String[] args) {
        FileHandler fh=null;
        try {
            fh = new FileHandler("D:/Tempo/miPropioLog.log", true);//Checked Exception
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            //ya se puede grabar mensajes..
            logger.info("Primer mensaje");
        }catch(Exception e){
            logger.info("Error:" + e);
        }finally { //si o si se ejecuta, sirve para cerrar recursos abiertos
            logger.info("Finally....");
            if (fh!=null) {
                fh.close();
            }
        }
        logger.info("Fin del programa");
    }
}
