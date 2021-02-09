package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class BloqueRepetir implements Bloque {
    int cantidadRepeticiones = 0;
    ArrayList<Bloque> listaBloques = new ArrayList<>();

    public void establecerCantidadRepeticiones(int n) {
        this.cantidadRepeticiones = n;
    }

    public void agregarBloque(int posicion, Bloque unBloque) {
        this.listaBloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (int contador = 0; contador < cantidadRepeticiones; contador++) {
            for (Bloque unBloque : listaBloques) {
                unBloque.ejecutar(unPersonaje);
            }
        }
    }

    @Override
    public void ejecutarBloqueInverso(Personaje unPersonaje) {

    }
}
