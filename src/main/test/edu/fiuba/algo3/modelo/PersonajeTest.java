package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Mock test para los bloques usando un personaje mock.
// Separar PersonajeTest y BloqueTest Para testear las funcionalidad por separado.
// Analizar test sobre el Lapiz (EstadoLapiz). Problema con el instanceof. Violación de encapsulamiento.

public class PersonajeTest {

    @Test
    public void test01SeCreaPersonajeConLapizLevantado(){
        Personaje personaje = new Personaje();

        assertEquals(personaje.estaElLapizLevantado(),true);
    }

    @Test
    public void test02PersonajeBajaElLapiz(){
        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertEquals(personaje.estaElLapizLevantado(),false);
    }

    @Test
    public void test03PersonajeBajaYsubeElLapiz(){
        Personaje personaje = new Personaje();

        personaje.bajarLapiz();
        personaje.levantarLapiz();

        assertEquals(personaje.estaElLapizLevantado(),true);
    }

    @Test
    public void test04PersonajeSeMueveUnaPosicionAlaDerecha(){
        Personaje personaje = new Personaje();

//        Dibujo dibujo = new Dibujo();

        personaje.moverDerecha();

        assertEquals(personaje.getPosicionX(),1);
    }

    @Test
    public void test05PersonajeSeMueveUnaPosicionAlaIzquierda(){
        Personaje personaje = new Personaje();

//        Dibujo dibujo = new Dibujo();

        personaje.moverIzquierda();

        assertEquals(personaje.getPosicionX(),-1);
    }

    @Test
    public void test06PersonajeSubeUnaPosicion(){
        Personaje personaje = new Personaje();

//        Dibujo dibujo = new Dibujo();

        personaje.subir();

        assertEquals(personaje.getPosicionY(),1);
    }

    @Test
    public void test07PersonajeBajaUnaPosicion(){
        Personaje personaje = new Personaje();

//        Dibujo dibujo = new Dibujo();

        personaje.bajar();

        assertEquals(personaje.getPosicionY(),-1);
    }
}
