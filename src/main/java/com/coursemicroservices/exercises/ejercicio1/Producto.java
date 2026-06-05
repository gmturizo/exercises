package com.coursemicroservices.exercises.ejercicio1;

public class Producto implements Pagable, Serializable{

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return this.precio * (double)this.cantidad;
        
    }

    public double aplicarDescuento(double porcentaje){
        double total = calcularTotal();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Producto: %s | Precio: $%.2f | Cantidad: %d", this.nombre, this.precio, this.cantidad);
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String toString(){
        return this.descripcion();
    }

    @Override
    public String Serializable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Serializable'");
    }

    @Override
    public double calcularPago() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPago'");
    }
}
