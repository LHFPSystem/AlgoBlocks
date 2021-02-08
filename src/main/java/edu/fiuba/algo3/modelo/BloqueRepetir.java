package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class BloqueRepetir implements Bloque {
    int cantidad_repeticiones;
    ArrayList<Bloque> lista_bloques;

    public BloqueRepetir() {
        this.cantidad_repeticiones = 0;
        this.lista_bloques = new ArrayList<Bloque>();
    }

    public void establecerCantidadRepeticiones(int n) {
        this.cantidad_repeticiones = n;
    }

    public void agregarBloque(int posicion,Bloque unBloque) {
        this.lista_bloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        Iterator<Bloque> iter;

        for (int contador = 0; contador < cantidad_repeticiones; contador++) {
            iter = this.lista_bloques.iterator();

            while (iter.hasNext()) {
                iter.next().ejecutar(unPersonaje);
            }
        }
    }
}
