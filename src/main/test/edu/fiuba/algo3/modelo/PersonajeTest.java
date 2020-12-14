package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.fiuba.algo3.modelo.LapizLevantado;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Lapiz;


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


}
