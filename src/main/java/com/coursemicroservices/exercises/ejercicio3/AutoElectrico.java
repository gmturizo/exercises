package com.coursemicroservices.exercises.ejercicio3;

public class AutoElectrico extends VehiculoElectrico {
    private double consumoKwhPorKm;

    public AutoElectrico(String marca, String modelo, int anio, double capacidadBateriaKwh, double nivelCargaPorcentaje, double consumoKwhPorKm) {
        super(marca, modelo, anio, capacidadBateriaKwh, nivelCargaPorcentaje);
        this.consumoKwhPorKm = consumoKwhPorKm;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costoKwh = 0.25; 
        return distanciaKm * consumoKwhPorKm * costoKwh;
    }
}
