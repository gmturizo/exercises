package com.coursemicroservices.exercises.ejercicio4;

public class LibroElectronico extends RecursoDigital {
    private int numeroPaginas;
    private boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion, String formato, double tamanioMB, int numeroPaginas, boolean tieneDRM) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return super.obtenerResumen() + String.format(" -> LibroElectrónico [Páginas: %d, DRM: %b]", 
                numeroPaginas, tieneDRM);
    }
}
