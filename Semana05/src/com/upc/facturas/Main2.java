package com.upc.facturas;

public class Main2 {
    public static void main(String[] args) {
        //Composición entre Item y producto
        Item item1 = new Item(10,"124","Perno 1pulg",1.5);
        Item item2 = new Item(2,"344","Lija 4",1.5);
        Item item3 = new Item(5, "221","Arena", 3);

        Factura factura = new Factura("2454-A","999999999",
                "Lima 2","12/12/2020");

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
