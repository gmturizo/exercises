package com.coursemicroservices.exercises.ejercicio2;

public interface Pagable {
    double calcularTotal();
    double aplicarDescuento(double pct);
    
    default String resumen(){
        return "Total: $" + calcularTotal();
    }
    
}
