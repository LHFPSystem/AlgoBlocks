package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueLapizArribaTest {
    @Test
    public void test01PersonajeSubeElLapizConElBloqueLapizArriba(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);
        Bloque bloqueSubirLapiz = new BloqueLapizArriba();

        bloqueSubirLapiz.ejecutar(personaje);
        assertEquals(personaje.estaElLapizLevantado(), true);
    }
}
