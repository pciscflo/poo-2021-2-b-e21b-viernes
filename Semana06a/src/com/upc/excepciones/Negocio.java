package com.upc.excepciones;

public class Negocio{
    public void buscarArchivo(String path) throws Exception{
        DAO dao = new DAO();
        dao.leerArchivo(path);
    }
}
