package com.coursemicroservices.exercises.ejercicio3;

public abstract class VehiculoElectrico extends Vehiculo {
    private double capacidadBateriaKwh;
    private double nivelCargaPorcentaje;

    public VehiculoElectrico(String marca, String modelo, int anio, double capacidadBateriaKwh, double nivelCargaPorcentaje) {
        super(marca, modelo, anio);
        this.capacidadBateriaKwh = capacidadBateriaKwh;
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
    }

    public double getCapacidadBateriaKwh() { return capacidadBateriaKwh; }
    public double getNivelCargaPorcentaje() { return nivelCargaPorcentaje; }
}
