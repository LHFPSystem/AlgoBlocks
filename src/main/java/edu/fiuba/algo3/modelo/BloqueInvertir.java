package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BloqueInvertir implements Bloque {
    ArrayList<Bloque> lista_bloques;

    public BloqueRepetir() {
        this.lista_bloques = new ArrayList<Bloque>();
    }

    public void agregarBloque(int posicion,Bloque unBloque) {
        this.lista_bloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        Iterator<Bloque> iter = this.lista_bloques.iterator();

        while (iter.hasNext()) {
            iter.next().ejecutarBloqueInverso(unPersonaje);
        }
    }
}
