package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueTest {
    @Test
    public void test01PersonjaseSeMueveIzquierdaLuegoDerechaVuelveAlOrigen(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverIzquierda.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 0);
    }

    @Test
    public void test02PersonjaseSeMueveArribaLuegoAbajoVuelveAlorigen(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverAbajo.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(), 0);
    }

    @Test
    public void test03PersonjaseSeMueveIzquierdaYArriba(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test04PersonjaseSeMueveIzquierdaYAbajo(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverAbajo.ejecutar(personaje);
        bloqueMoverIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), -1);
    }

    @Test
    public void test05PersonjaseSeMueveDerechaYArriba(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test06PersonjaseSeMueveDerechaYAbajo(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverAbajo.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), -1);
    }
}
