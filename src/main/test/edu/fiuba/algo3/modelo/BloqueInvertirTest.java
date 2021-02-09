package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueInvertirTest {
    @Test
    public void test01seInvierteElComportamientoDelBloqueMoverDerecha() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverDerecha());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -1);
    }

    @Test
    public void test02seInvierteElComportamientoDelBloqueMoverIzquierda() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverIzquierda());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 1);
    }

    @Test
    public void test03seInvierteElComportamientoDelBloqueMoverArriba() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverArriba());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), -1);
    }

    @Test
    public void test04seInvierteElComportamientoDelBloqueMoverAbajo() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), 1);
    }

    @Test
    public void test05seInvierteElComportamientoDeDosBloquesDistintos() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.agregarBloque(1, new BloqueMoverIzquierda());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 1);
        assertEquals(unPersonaje.getPosicionY(), 1);
    }

    @Test
    public void test05seInvierteElComportamientoDeDosBloquesIguales() {
        BloqueInvertir unBloque = new BloqueInvertir();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.agregarBloque(1, new BloqueMoverAbajo());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), 2);
    }
}
