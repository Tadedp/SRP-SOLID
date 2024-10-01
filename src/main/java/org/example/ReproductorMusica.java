package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ReproductorMusica {
    private String cancion;

    public void reproducirCancion(){
        System.out.println("Reproduciendo: " + cancion);
    }
}
