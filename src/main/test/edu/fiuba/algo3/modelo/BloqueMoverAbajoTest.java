package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueMoverAbajoTest {

    @Test
    public void test01BloqueMoverAbajoHaceQueElPersonajesBajeUnaPosicion(){
        Personaje personaje = new Personaje();
        Bloque bloqueAbajo = new BloqueMoverAbajo();

        bloqueAbajo.ejecutar(personaje);

        assertEquals(personaje.getPosicionY(),-1);
    }
}
