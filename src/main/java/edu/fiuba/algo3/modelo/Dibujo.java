package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Dibujo {
    ArrayList<Tramo> tramos;
    Iterator<Tramo> iter;

    public Dibujo() {
        tramos = new ArrayList<Tramo>();
    }

    public void agregarTramo(Personaje unPersonaje) {
        Tramo unTramo = new Tramo(unPersonaje.getPosicionX(),
                unPersonaje.getPosicionY(), unPersonaje.estaElLapizLevantado());
        this.tramos.add(unTramo);
        iter = this.tramos.iterator();
    }

    public Tramo mostrarTramoYAvanzarAlSiguiente() {
        if (tramos.isEmpty()) {
            throw new RuntimeException("No hay dibujo.");
        }

        if (iter.hasNext()) {
            return iter.next();
        }

        throw new RuntimeException("Se ha recorrido todo el dibujo.");
//        return new Tramo(0, 0, false);
    }
}
