package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class BloqueAlgoritmoPersonalizado implements Bloque {
    private ArrayList<Bloque> listaBloques = new ArrayList<>();

    public void agregarBloque(int posicion, Bloque unBloque) {
        this.listaBloques.add(posicion, unBloque);
    }


    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (Bloque unBloque : listaBloques) {
            unBloque.ejecutar(unPersonaje);
        }
    }

    @Override
    public void ejecutarBloqueInverso(Personaje unPersonaje) {}

    public void agregarListaBloques(ArrayList<Bloque> bloques) {
        this.listaBloques = (ArrayList<Bloque>) bloques.clone();
    }
}
