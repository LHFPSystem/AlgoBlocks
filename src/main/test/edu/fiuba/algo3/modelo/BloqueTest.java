package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueTest {

    @Test
    public void test01PersonajeSeMueveALaDerecha(){
        Personaje personaje = new Personaje();
        Bloque bloqueDerecha = new BloqueMoverDerecha();

        bloqueDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(),1);
    }

    @Test
    public void test02PersonajeSeMueveALaIzquierda(){
        Personaje personaje = new Personaje();
        Bloque bloqueIzquierda = new BloqueMoverIzquierda();

        bloqueIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(),-1);
    }

    @Test
    public void test03PersonajeSeMueveArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueArriba = new BloqueMoverArriba();

        bloqueArriba.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(),1);
    }

    @Test
    public void test04PersonajeSeMueveAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueAbajo = new BloqueMoverAbajo();

        bloqueAbajo.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(),-1);
    }

    @Test
    public void test05PersonajeBajaElLapizConElBloqueLapizAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueBajarLapiz = new BloqueLapizAbajo();

        bloqueBajarLapiz.ejecutar(personaje);

        assertEquals(personaje.estaElLapizLevantado(), false);
//        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizNoLevantado);
    }

    @Test
    public void test06PersonajeSubeElLapizConElBloqueLapizArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueSubirLapiz = new BloqueLapizArriba();

        bloqueSubirLapiz.ejecutar(personaje);
        assertEquals(personaje.estaElLapizLevantado(), true);

//        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);
    }

    @Test
    public void test7PersonjaseSeMueveIzquierdaLuegoDerechaVuelveAlOrigen(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverIzquierda.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 0);
    }

    @Test
    public void test8PersonjaseSeMueveArribaLuegoAbajoVuelveAlorigen(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverAbajo.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(), 0);
    }

    @Test
    public void test9PersonjaseSeMueveIzquierdaYArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test10PersonjaseSeMueveIzquierdaYAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverAbajo.ejecutar(personaje);
        bloqueMoverIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), -1);
    }

    @Test
    public void test11PersonjaseSeMueveDerechaYArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverArriba.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test12PersonjaseSeMueveDerechaYAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverAbajo.ejecutar(personaje);
        bloqueMoverDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), -1);
    }
}
