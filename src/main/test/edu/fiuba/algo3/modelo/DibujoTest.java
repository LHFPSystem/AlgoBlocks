package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DibujoTest {
    @Test
    public void test01seAgregaUnTramoAlMoverElPersonajeALaDerecha() {
        Dibujo unDibujo = new Dibujo();
        Bloque unBloque = new BloqueMoverDerecha();
        Personaje unPersonaje = new Personaje(unDibujo);

        unBloque.ejecutar(unPersonaje);
        unDibujo.agregarTramo(unPersonaje);
        Tramo unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();

        assertEquals(unTramo.obtenerPosicionX(), 1);
    }

    @Test
    public void test02seAgregaUnTramoAlMoverElPersonajeHaciaAbajo() {
        Dibujo unDibujo = new Dibujo();
        Bloque unBloque = new BloqueMoverAbajo();
        Personaje unPersonaje = new Personaje(unDibujo);

        unBloque.ejecutar(unPersonaje);
        unDibujo.agregarTramo(unPersonaje);
        Tramo unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();

        assertEquals(unTramo.obtenerPosicionY(), -1);
    }

    @Test
    public void test03SectorDibujoVacioDebeLanzarError() {
        Dibujo unDibujo = new Dibujo();
        try {
            unDibujo.mostrarTramoYAvanzarAlSiguiente();
        } catch(RuntimeException e) {
            assertEquals("No hay dibujo.", e.getMessage());
        }
    }

    @Test
    public void test04SeTerminanLosTramosADibujarDebeLanzarExcepcion() {
        Dibujo unDibujo = new Dibujo();
        Bloque unBloque = new BloqueMoverAbajo();
        Personaje unPersonaje = new Personaje(unDibujo);

        unBloque.ejecutar(unPersonaje);
        unDibujo.agregarTramo(unPersonaje);
        Tramo unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();
        assertEquals(unTramo.obtenerPosicionY(), -1);

        try {
            unTramo = unDibujo.mostrarTramoYAvanzarAlSiguiente();
        } catch(RuntimeException e) {
            assertEquals("Se ha recorrido todo el dibujo.", e.getMessage());
        }
    }

}
