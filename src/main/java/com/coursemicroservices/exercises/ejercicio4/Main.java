package com.coursemicroservices.exercises.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RecursoBibliografico> biblioteca = new ArrayList<>();

        biblioteca.add(new RecursoDigital("Audiobook Cien Años de Soledad", "Gabriel García Márquez", 2015, "MP3", 150.5));
        biblioteca.add(new LibroElectronico("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "EPUB", 2.4, 860, false));
        biblioteca.add(new LibroElectronico("Ficciones", "Jorge Luis Borges", 1944, "PDF", 1.8, 180, true));
        biblioteca.add(new LibroElectronico("El Aleph", "Jorge Luis Borges", 1949, "EPUB", 1.2, 160, false));

        System.out.println("--- Inventario de la Biblioteca ---");
        for (RecursoBibliografico recurso : biblioteca){
            System.out.println(recurso.obtenerResumen());
        }
        
        LibroElectronico masAntiguo = buscarLibroElectronicoMasAntiguo(biblioteca);

        System.out.println("\n--- Resultado de la Búsqueda ---");
        if (masAntiguo != null) {
            System.out.println("El Libro Electrónico más antiguo es: " + masAntiguo.getTitulo() + " (" + masAntiguo.getAnioPublicacion() + ")");
        } else {
            System.out.println("No se encontraron libros electrónicos en la colección.");
        }
    }

    public static LibroElectronico buscarLibroElectronicoMasAntiguo(List<RecursoBibliografico> lista) {
        LibroElectronico libroMasAntiguo = null;

        for (RecursoBibliografico recurso : lista) {
            if (recurso instanceof LibroElectronico) {
                LibroElectronico libroActual = (LibroElectronico) recurso;
                
                if (libroMasAntiguo == null || libroActual.getAnioPublicacion() < libroMasAntiguo.getAnioPublicacion()) {
                    libroMasAntiguo = libroActual;
                }
            }
        }
        return libroMasAntiguo;
    }
}
