package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueMoverArribaTest {

    @Test
    public void test01BloqueMoverArribaHaceQueElPersonajesSubaUnaPosicion(){
        Personaje personaje = new Personaje();
        Bloque bloqueArriba = new BloqueMoverArriba();

        bloqueArriba.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(),1);
    }
}
