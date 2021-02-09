package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DibujoTest {
//    @Test
//    public void test01seAgregaUnTramoAlDibujoConElLapizLevantado() {
//        Dibujo unDibujo = new Dibujo();
//
//        unDibujo.agregarTramo(new Tramo(1,0,true));
//
//        Tramo unTramo = unDibujo.mostrarTramo();
//
//        assertEquals(unTramo.obtenerPosicionX(), 1);
//        assertEquals(unTramo.obtenerPosicionY(), 0);
//        assertEquals(unTramo.estaElLapizLevantado(), true);
//    }
//
//    @Test
//    public void test02seAgregaUnTramoAlDibujoConElLapizBajo() {
//        Dibujo unDibujo = new Dibujo();
//
//        unDibujo.agregarTramo(new Tramo(0,-1,false));
//
//        Tramo unTramo = unDibujo.mostrarTramo();
//
//        assertEquals(unTramo.obtenerPosicionX(), 0);
//        assertEquals(unTramo.obtenerPosicionY(), -1);
//        assertEquals(unTramo.estaElLapizLevantado(), false);
//    }

    @Test
    public void test03seAgregaUnTramoAlMoverElPersonajeALaDerecha() {
        Dibujo unDibujo = new Dibujo();
        Bloque unBloque = new BloqueMoverDerecha();
        Personaje unPersonaje = new Personaje();

        unBloque.ejecutar(unPersonaje);
        unDibujo.agregarTramo(unPersonaje);
        Tramo unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();

        assertEquals(unTramo.obtenerPosicionX(), 1);
    }

    @Test
    public void test03seAgregaUnTramoAlMoverElPersonajeHaciaAbajo() {
        Dibujo unDibujo = new Dibujo();
        Bloque unBloque = new BloqueMoverAbajo();
        Personaje unPersonaje = new Personaje();

        unBloque.ejecutar(unPersonaje);
        unDibujo.agregarTramo(unPersonaje);
        Tramo unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();

        assertEquals(unTramo.obtenerPosicionY(), -1);
    }
}
