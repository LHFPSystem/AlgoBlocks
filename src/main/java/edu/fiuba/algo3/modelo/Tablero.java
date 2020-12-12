package edu.fiuba.algo3.modelo;


import java.util.ArrayList;
import java.util.List;

public class Tablero {

    List<Bloque> bloques = new ArrayList<Bloque>();
    Personaje unPersonaje = new Personaje();

    void ejecutarAlgoritmo(){

        for (Bloque bloque : bloques) {

            bloque.EjecutarCompartamiento(unPersonaje);

        }
    }

}
