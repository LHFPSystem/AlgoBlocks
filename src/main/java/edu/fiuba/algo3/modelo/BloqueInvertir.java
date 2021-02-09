package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class BloqueInvertir implements Bloque {
    ArrayList<Bloque> listaBloques;

    public void ejecutarBloqueInverso(Personaje unPersonaje){

    }

    public BloqueRepetir() {
        this.listaBloques = new ArrayList<Bloque>();
    }

    public void agregarBloque(int posicion,Bloque unBloque) {
        this.listaBloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        Iterator<Bloque> iter = this.listaBloques.iterator();

        while (iter.hasNext()) {
            iter.next().ejecutarBloqueInverso(unPersonaje);
        }
    }
}
