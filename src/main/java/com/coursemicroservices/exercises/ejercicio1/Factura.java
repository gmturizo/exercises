package com.coursemicroservices.exercises.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Factura {
    private String numeroFactura;
    private String cliente;
    private List<Pagable> items;
    
    
    public Factura(String numeroFactura, String cliente, List<Pagable> items) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Pagable item){
        this.items.add(item);
        System.out.println("item agregado: " + item.descripcion());
    }

    public double calcularGrandTotal(){
        double grandTotal = (double)0.0F;
        
        for (Pagable item : items) {
            grandTotal += item.calcularPago();
        }

        return grandTotal;
    }

    public void imprimirFactura(){
        System.out.println("\n |------------------------------------------------|");
        System.out.println("\n |                     FACTURA                    |");
        System.out.println("\n Numero de la factura: " + this.numeroFactura);
        System.out.println("\n Cliente: " + this.cliente);
        System.out.println("\n Items: " + this.cliente);

        for (Pagable item : items) {
            System.out.println(" - " + item.descripcion() + ": $" + item.calcularPago());
        }
        System.out.println("Total a pagar: $" +calcularGrandTotal());
    }


    public void serializarItems (){
        System.out.println("\n Serializado items de la factura...");

        for (Pagable item : items) {
            if (item instanceof Serializable)
                System.out.println(" " + ((Serializable)item).Serializable());
        }
    }

    public List<Pagable> getItem(){
        return this.items;
    }

    public String getNumeroFactura(){
        return this.numeroFactura;
    }

    public String getCliente(){
        return this.cliente;
    }

}
