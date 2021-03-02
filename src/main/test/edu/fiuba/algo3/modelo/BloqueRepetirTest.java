package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueRepetirTest {
    @Test
    public void test01seRepiteElBloqueUnaUnicaVezConUnSoloBloqueInterno() {
        BloqueRepetir unBloque = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.establecerCantidadRepeticiones(1);
        unBloque.agregarBloque(0, new BloqueMoverDerecha());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 1);
    }

    @Test
    public void test02seRepiteElBloqueDosVecesConUnSoloBloqueInterno() {
        BloqueRepetir unBloque = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.establecerCantidadRepeticiones(2);
        unBloque.agregarBloque(0, new BloqueMoverDerecha());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 2);
    }

    @Test
    public void test03seRepiteElBloqueTresVecesConUnSoloBloqueInterno() {
        BloqueRepetir unBloque = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.establecerCantidadRepeticiones(3);
        unBloque.agregarBloque(0, new BloqueMoverDerecha());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 3);
    }

    @Test
    public void test04seRepiteElBloqueDosVecesConDosBloquesInternos() {
        BloqueRepetir unBloque = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.establecerCantidadRepeticiones(2);
        unBloque.agregarBloque(0, new BloqueMoverDerecha());
        unBloque.agregarBloque(1, new BloqueMoverArriba());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 2);
        assertEquals(unPersonaje.getPosicionY(), 2);
    }

    @Test
    public void test05seRepiteElBloqueTresVecesConDosBloquesInternos() {
        BloqueRepetir unBloque = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.establecerCantidadRepeticiones(2);
        unBloque.agregarBloque(0, new BloqueMoverIzquierda());
        unBloque.agregarBloque(1, new BloqueMoverAbajo());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -2);
        assertEquals(unPersonaje.getPosicionY(), -2);
    }

    @Test
    public void test06CantidadDeRepeticionesMenorAUnoDebeLanzarExcepcion() {
        BloqueRepetir unBloque = new BloqueRepetir();

        try {
            unBloque.establecerCantidadRepeticiones(0);
        } catch (RuntimeException e) {
            assertEquals("Cantidad de repeticiones debe ser >= 1.", e.getMessage());
        }
    }
}
