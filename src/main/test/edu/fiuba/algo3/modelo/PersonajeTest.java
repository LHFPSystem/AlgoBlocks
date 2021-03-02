package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void test01SeCreaPersonajeConLapizLevantado(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        assertTrue(personaje.estaElLapizLevantado());
    }

    @Test
    public void test02PersonajeBajaElLapiz(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.bajarLapiz();

        assertFalse(personaje.estaElLapizLevantado());
    }

    @Test
    public void test03PersonajeBajaYsubeElLapiz(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.bajarLapiz();
        personaje.levantarLapiz();

        assertTrue(personaje.estaElLapizLevantado());
    }

    @Test
    public void test04PersonajeSeMueveUnaPosicionAlaDerecha(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.moverDerecha();

        assertEquals(personaje.getPosicionX(),1);
    }

    @Test
    public void test05PersonajeSeMueveUnaPosicionAlaIzquierda(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.moverIzquierda();

        assertEquals(personaje.getPosicionX(),-1);
    }

    @Test
    public void test06PersonajeSubeUnaPosicion(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.subir();

        assertEquals(personaje.getPosicionY(),1);
    }

    @Test
    public void test07PersonajeBajaUnaPosicion(){
        Dibujo dibujo = new Dibujo();
        Personaje personaje = new Personaje(dibujo);

        personaje.bajar();

        assertEquals(personaje.getPosicionY(),-1);
    }
}
