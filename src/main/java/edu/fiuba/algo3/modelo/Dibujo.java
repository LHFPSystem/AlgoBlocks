package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Dibujo {
    ArrayList<Tramo> tramos;
    Iterator<Tramo> iter;

    public Dibujo() {
        tramos = new ArrayList<Tramo>();
        iter = this.tramos.iterator();
    }

    public void agregarTramo(Tramo unTramo) {
        this.tramos.add(unTramo);
    }

    public Tramo mostrarTramo() {
        if (iter.hasNext()) {
            return iter.next();
        }
    }
}
