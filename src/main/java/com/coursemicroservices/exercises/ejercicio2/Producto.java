package com.coursemicroservices.exercises.ejercicio2;

public class Producto implements Pagable{
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public double aplicarDescuento(double pct) {
        return calcularTotal() * (1 - pct);
    }
    
}
