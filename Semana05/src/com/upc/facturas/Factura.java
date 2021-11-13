package com.upc.facturas;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numeroFactura;
    private String ruc;
    private String direccion;
    private String fecha;
    private List<Item> arregloItems;

    public Factura(String numeroFactura, String ruc, String direccion, String fecha) {
        this.numeroFactura = numeroFactura;
        this.ruc = ruc;
        this.direccion = direccion;
        this.fecha = fecha;
        this.arregloItems = new ArrayList<>();//la composición
    }
    public void registrar(Item item){
        this.arregloItems.add(item);
    }

    

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Item> getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(List<Item> arregloItems) {
        this.arregloItems = arregloItems;
    }
}
