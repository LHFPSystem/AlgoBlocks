package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueMoverIzquierdaTest {
    @Test
    public void test01BloqueMoverIzquierdaMueveAlPersonajeUnaPosicionALaIzquierda(){
        Personaje personaje = new Personaje();
        Bloque bloqueIzquierda = new BloqueMoverIzquierda();

        bloqueIzquierda.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(),-1);
    }
}
