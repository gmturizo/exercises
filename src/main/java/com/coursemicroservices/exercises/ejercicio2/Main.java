package com.coursemicroservices.exercises.ejercicio2;

public class Main {
     public Main(){
    }

    public static void main(String [] args){
        Factura factura = new Factura();

        factura.agregarItem(new Producto("laptop", 999.99, 1));
        factura.agregarItem(new Producto("Mouse", 25.00, 2));

        factura.agregarItem(new Servicio("Soporte Tecnico", 80.0, 3));

        factura.imprimir();
    }


}
