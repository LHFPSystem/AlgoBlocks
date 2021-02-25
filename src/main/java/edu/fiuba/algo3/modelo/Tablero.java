package edu.fiuba.algo3.modelo;


import java.util.ArrayList;
import java.util.List;

public class Tablero {
    List<Bloque> bloques = new ArrayList<>();
    Personaje unPersonaje;

    public Tablero(){

        this.unPersonaje = new Personaje();

    }

    public void setBloque(Bloque unBloque){
        bloques.add(unBloque);
    }

    void ejecutarAlgoritmo(){

        for (Bloque bloque : bloques) {
            bloque.ejecutar(unPersonaje);
        }
    }
}
