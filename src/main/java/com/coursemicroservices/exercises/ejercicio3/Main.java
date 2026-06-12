package com.coursemicroservices.exercises.ejercicio3;

public class Main {

    public static void main(String[] args) {
        GestorFlotaService gestor = new GestorFlotaService();

        gestor.agregarVehiculo(new Auto("Toyota", "Corolla", 2022, 0.03));
        gestor.agregarVehiculo(new Moto("Yamaha", "R3", 2023, 0.02));
        gestor.agregarVehiculo(new AutoElectrico("Tesla", "Model 3", 2024, 75.0, 90.0, 0.15));

        double distanciaViaje = 150.0; // Kilómetros
        System.out.println("\n--- COSTOS DE VIAJE PARA " + distanciaViaje + " KM ---");

        for (Vehiculo v : gestor.obtenerFlota()) {
            System.out.printf("%s %s -> Costo: $%.2f%n", 
                v.getMarca(), v.getModelo(), v.calcularCostoViaje(distanciaViaje));
        }

        Vehiculo optimo = gestor.buscarVehiculoOptimo(distanciaViaje);
        System.out.println("\n--- VEHÍCULO ÓPTIMO (MÁS ECONÓMICO) ---");
        if (optimo != null) {
            System.out.printf("El vehículo ideal es: %s %s por un costo total de $%.2f%n", 
                optimo.getMarca(), optimo.getModelo(), optimo.calcularCostoViaje(distanciaViaje));
        } else {
            System.out.println("No hay vehículos en la flota.");
        }
    }
}
