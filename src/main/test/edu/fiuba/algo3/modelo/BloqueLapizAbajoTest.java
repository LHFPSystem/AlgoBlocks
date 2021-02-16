package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueLapizAbajoTest {
    @Test
    public void test01PersonajeBajaElLapizConElBloqueLapizAbajo(){
        Personaje personaje = new Personaje();
        Bloque bloqueBajarLapiz = new BloqueLapizAbajo();

        bloqueBajarLapiz.ejecutar(personaje);

        assertEquals(personaje.estaElLapizLevantado(), false);
    }
}
