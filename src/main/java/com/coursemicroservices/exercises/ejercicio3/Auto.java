package com.coursemicroservices.exercises.ejercicio3;

public class Auto extends Vehiculo {
    private double consumoGalonPorKm;

    public Auto(String marca, String modelo, int anio, double consumoGalonPorKm) {
        super(marca, modelo, anio);
        this.consumoGalonPorKm = consumoGalonPorKm;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double precioGalon = 4.5; 
        return distanciaKm * consumoGalonPorKm * precioGalon;
    }
}