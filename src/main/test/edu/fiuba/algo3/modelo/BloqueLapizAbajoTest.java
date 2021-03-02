package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueLapizAbajoTest {
    @Test
    public void test01PersonajeBajaElLapizConElBloqueLapizAbajo(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueBajarLapiz = new BloqueLapizAbajo();

        bloqueBajarLapiz.ejecutar(personaje);

        assertEquals(personaje.estaElLapizLevantado(), false);
    }
}
