package org.example;

public class Main {
    public static void main(String[] args) {
        // Single Responsability Principle: Cada clase debe tener una única responsabilidad o razón para cambiar.
        // ReproductorMusica tiene la única responsabilidad de reproducir música.
        // ReproductorEstadisticas tiene la única responsabilidad de llevar el conteo de reproducciones.

        ReproductorMusica reproductorMusica = ReproductorMusica.builder()
                .cancion("A-ha - Take On Me")
                .build();

        ReproductorEstadisticas reproductorEstadisticas = new ReproductorEstadisticas();

        System.out.println(reproductorEstadisticas);
        reproductorMusica.reproducirCancion();
        reproductorEstadisticas.incrementarContador();
        System.out.println(reproductorEstadisticas);
    }
}
