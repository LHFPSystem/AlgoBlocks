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
    public void test02PersonajeBajaElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizNoLevantado);

    }

    @Test
    public void test03PersonajeBajaYsubeElLapiz(){

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        personaje.levantarLapiz();

        assertTrue((personaje.getLapiz()).getEstadoLapiz() instanceof LapizLevantado);
    }

    @Test
    public void test04PersonajeSeMueveUnaPosicionAlaDerecha(){
        Personaje personaje = new Personaje();

        personaje.moverDerecha();

        assertEquals(personaje.getPosicionX(),1);
    }

    @Test
    public void test05PersonajeSeMueveUnaPosicionAlaIzquierda(){
        Personaje personaje = new Personaje();

        personaje.moverIzquierda();

        assertEquals(personaje.getPosicionX(),-1);
    }

    @Test
    public void test06PersonajeSubeUnaPosicion(){
        Personaje personaje = new Personaje();

        personaje.subir();

        assertEquals(personaje.getPosicionY(),1);
    }

    @Test
    public void test07PersonajeBajaUnaPosicion(){
        Personaje personaje = new Personaje();

        personaje.bajar();

        assertEquals(personaje.getPosicionY(),-1);
    }
}
