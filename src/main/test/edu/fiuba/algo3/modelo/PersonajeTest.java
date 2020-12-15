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

}
