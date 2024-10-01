package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReproductorEstadisticas {
    private int contadorReproducciones = 0;

    public void incrementarContador(){
        contadorReproducciones += 1;
    }

    @Override
    public String toString(){
        return "Cantidad de canciones reproducidas: " + contadorReproducciones;
    }
}
