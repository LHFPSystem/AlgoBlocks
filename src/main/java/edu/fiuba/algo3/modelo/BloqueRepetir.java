package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class BloqueRepetir implements Bloque {
    int cantidadRepeticiones;
    ArrayList<Bloque> listaBloques;

    public BloqueRepetir() {
        this.cantidadRepeticiones = 0;
        this.listaBloques = new ArrayList<Bloque>();
    }

    public void establecerCantidadRepeticiones(int n) {
        this.cantidadRepeticiones = n;
    }

    public void agregarBloque(int posicion,Bloque unBloque) {
        this.listaBloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        Iterator<Bloque> iter;

        for (int contador = 0; contador < cantidadRepeticiones; contador++) {
            iter = this.listaBloques.iterator();

            while (iter.hasNext()) {
                iter.next().ejecutar(unPersonaje);
            }
        }
    }
}
