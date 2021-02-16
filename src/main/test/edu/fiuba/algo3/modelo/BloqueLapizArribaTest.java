package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueLapizArribaTest {
    @Test
    public void test01PersonajeSubeElLapizConElBloqueLapizArriba(){
        Personaje personaje = new Personaje();
        Bloque bloqueSubirLapiz = new BloqueLapizArriba();

        bloqueSubirLapiz.ejecutar(personaje);
        assertEquals(personaje.estaElLapizLevantado(), true);
    }
}
