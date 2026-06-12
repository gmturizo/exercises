package com.coursemicroservices.exercises.ejercicio3;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GestorFlotaService {
    private final List<Vehiculo> flota = new ArrayList<>();

    public void agregarVehiculo(Vehiculo v) {
        flota.add(v);
    }

    public List<Vehiculo> obtenerFlota() {
        return flota;
    }

    // Búsqueda del elemento óptimo (Menor costo de viaje)
    public Vehiculo buscarVehiculoOptimo(double distanciaKm) {
        if (flota.isEmpty()) return null;

        Vehiculo optimo = flota.get(0);
        double menorCosto = optimo.calcularCostoViaje(distanciaKm);

        for (Vehiculo v : flota) {
            double costoActual = v.calcularCostoViaje(distanciaKm);
            if (costoActual < menorCosto) {
                menorCosto = costoActual;
                optimo = v;
            }
        }
        return optimo;
    }
}