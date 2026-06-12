package com.coursemicroservices.exercises.ejercicio4;

public class RecursoDigital extends RecursoBibliografico {
    private String formato;
    private double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion, String formato, double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public String getFormato() { return formato; }
    public double getTamanioMB() { return tamanioMB; }

    @Override
    public String obtenerResumen() {
        return String.format("Título: %s | Autor: %s (%d) [Digital - Formato: %s, Tamaño: %.2f MB]", 
                getTitulo(), getAutor(), getAnioPublicacion(), formato, tamanioMB);
    }
}