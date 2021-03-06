package com.upc.facturas;

public class Item {
    private int cantidad;
    private Producto producto;

    public Item(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;//agregación
    }

    public Item(int cantidad, String codigo, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.producto = new Producto(codigo, descripcion, precio);//composición *
    }

    public double calcularMontoParcial(){
        return this.cantidad*this.producto.getPrecioUnitario();//joint
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
