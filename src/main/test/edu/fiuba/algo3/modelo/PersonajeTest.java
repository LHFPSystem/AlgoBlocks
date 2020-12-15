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
    public void testPersonajeBajaElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizNoLevantado);

    }

    @Test
    public void testPersonajeBajaYsubeElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        personaje.levantarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);
    }


}
