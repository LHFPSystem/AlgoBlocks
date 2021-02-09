package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class BloqueInvertir implements Bloque {
    ArrayList<Bloque> listaBloques = new ArrayList<>();

    public void agregarBloque(int posicion, Bloque unBloque) {
        this.listaBloques.add(posicion, unBloque);
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (Bloque unBloque : listaBloques) {
            unBloque.ejecutarBloqueInverso(unPersonaje);
        }
    }

    @Override
    public void ejecutarBloqueInverso(Personaje unPersonaje){}
}
