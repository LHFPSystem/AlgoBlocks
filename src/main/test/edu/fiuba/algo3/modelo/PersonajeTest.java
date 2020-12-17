package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void test01SeCreaPersonajeConLapizLevantado(){

        Personaje personaje = new Personaje();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);


    }

    @Test
    public void test02PersonajeBajaElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizNoLevantado);

    }

    @Test
    public void test03PersonajeBajaYsubeElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        personaje.levantarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);
    }
    @Test
    public void test04PersonajeSeMueveALaDerecha(){
        Personaje personaje = new Personaje();
        Bloque bloqueDerecha = new BloqueMoverDerecha();

        bloqueDerecha.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(),1);
    }

    @Test
    public void test05PersonajeSeMueveALaIzquierda(){
        Personaje personaje = new Personaje();
        Bloque bloqueIzquierda = new BloqueMoverIzquierda();

        bloqueIzquierda.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(),-1);
    }

    @Test
    public void test06PersonajeSeMueveArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueArriba = new BloqueMoverArriba();

        bloqueArriba.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionY(),1);
    }

    @Test
    public void test07PersonajeSeMueveAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueAbajo = new BloqueMoverAbajo();

        bloqueAbajo.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionY(),-1);
    }

    @Test
    public void test08PersonajeBajaElLapizConElBloqueLapizAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueBajarLapiz = new BloqueLapizAbajo();

        bloqueBajarLapiz.EjecutarCompartamiento(personaje);

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizNoLevantado);
    }

    @Test
    public void test09PersonajeSubeElLapizConElBloqueLapizArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueSubirLapiz = new BloqueLapizArriba();

        bloqueSubirLapiz.EjecutarCompartamiento(personaje);

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);
    }

    @Test
    public void test10PersonjaseSeMueveIzquierdaLuegoDerechaVuelveAlOrigen(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverIzquierda.EjecutarCompartamiento(personaje);
        bloqueMoverDerecha.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(), 0);
    }

    @Test
    public void test11PersonjaseSeMueveArribaLuegoAbajoVuelveAlorigen(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();

        bloqueMoverArriba.EjecutarCompartamiento(personaje);
        bloqueMoverAbajo.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionY(), 0);
    }

    @Test
    public void test12PersonjaseSeMueveIzquierdaYArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverArriba.EjecutarCompartamiento(personaje);
        bloqueMoverIzquierda.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test13PersonjaseSeMueveIzquierdaYAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverIzquierda = new BloqueMoverIzquierda();

        bloqueMoverAbajo.EjecutarCompartamiento(personaje);
        bloqueMoverIzquierda.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(), -1);
        assertEquals(personaje.getPosicionY(), -1);
    }

    @Test
    public void test14PersonjaseSeMueveDerechaYArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverArriba = new BloqueMoverArriba();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverArriba.EjecutarCompartamiento(personaje);
        bloqueMoverDerecha.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), 1);
    }

    @Test
    public void test15PersonjaseSeMueveDerechaYAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueMoverAbajo = new BloqueMoverAbajo();
        Bloque bloqueMoverDerecha = new BloqueMoverDerecha();

        bloqueMoverAbajo.EjecutarCompartamiento(personaje);
        bloqueMoverDerecha.EjecutarCompartamiento(personaje);

        assertEquals(personaje.getPosicionX(), 1);
        assertEquals(personaje.getPosicionY(), -1);
    }
}
