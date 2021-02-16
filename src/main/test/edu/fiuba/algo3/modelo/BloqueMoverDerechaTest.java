package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueMoverDerechaTest {
    @Test
    public void test01BloqueMoverDerechaMueveAlPersonajeUnaPosicionALaDerecha(){
        Personaje personaje = new Personaje();
        Bloque bloqueDerecha = new BloqueMoverDerecha();

        bloqueDerecha.ejecutar(personaje);

        assertEquals(personaje.getPosicionX(),1);
    }
}
