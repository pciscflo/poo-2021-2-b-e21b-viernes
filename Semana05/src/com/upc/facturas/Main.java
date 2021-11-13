package com.upc.facturas;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("122", "Perno 1pulg ", 2);
        Producto p2 = new Producto("300","Arena", 5);
        Producto p3 = new Producto("212","Lija 3", 2.5);
        //productos creados por fuera, agregación Item Producto
        Item item1 = new Item(10,p1);//agregación respecto a producto
        Item item2 = new Item(20,p2);
        Item item3 = new Item(10,p3);
        //Items preados por fuera
        Factura factura = new Factura("204894-A1","88888888",
                "Lima 12", "10/10/2021");
        factura.registrar(item1);
        factura.registrar(item2);
        factura.registrar(item3);

        System.out.println("Numero de Factura:" + factura.getNumeroFactura());
        System.out.println("RUC:" + factura.getRuc());
        System.out.println("Fecha:" + factura.getFecha());
        System.out.println("----------------------------");
        for(Item p:factura.getArregloItems()){
            System.out.println(p.toString()+ "Monto Parcial:" + p.calcularMontoParcial());
        }
        System.out.println("Subtotal:" + factura.calcularSubtotal());
        System.out.println("IGV:" + factura.calcularIGV());
        System.out.println("Total a Pagar:" + factura.calcularTotalPagar());
    }
}
