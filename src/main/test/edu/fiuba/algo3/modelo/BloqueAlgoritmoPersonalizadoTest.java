package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueAlgoritmoPersonalizadoTest {
    @Test
    public void test01SeCreaUnAlgoritmoPersonalizadoConUnSoloBloque() {
        BloqueAlgoritmoPersonalizado unBloque = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), -1);
    }

    @Test
    public void test02SeCreaUnAlgoritmoPersonalizadoConDosBloques() {
        BloqueAlgoritmoPersonalizado unBloque = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.agregarBloque(0, new BloqueMoverIzquierda());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -1);
        assertEquals(unPersonaje.getPosicionY(), -1);
    }

    @Test
    public void test03SeCreaAlgoritmoPersonalizadoDentroDeOtro() {
        BloqueAlgoritmoPersonalizado unBloqueInterior = new BloqueAlgoritmoPersonalizado();
        BloqueAlgoritmoPersonalizado unBloqueExterior = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloqueInterior.agregarBloque(0, new BloqueMoverAbajo());
        unBloqueInterior.agregarBloque(0, new BloqueMoverIzquierda());
        unBloqueExterior.agregarBloque(0, new BloqueMoverDerecha());
        unBloqueExterior.agregarBloque(0, new BloqueMoverArriba());
        unBloqueExterior.agregarBloque(0, unBloqueInterior);
        unBloqueExterior.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), 0);
        assertEquals(unPersonaje.getPosicionY(), 0);
    }

    @Test
    public void test04SeCreaBloqueRepeticionDentroDeAlgoritmoPersonalizado() {
        BloqueRepetir unBloqueInterior = new BloqueRepetir();
        BloqueAlgoritmoPersonalizado unBloqueExterior = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        unBloqueInterior.establecerCantidadRepeticiones(3);

        unBloqueInterior.agregarBloque(0, new BloqueMoverAbajo());
        unBloqueInterior.agregarBloque(0, new BloqueMoverIzquierda());
        unBloqueExterior.agregarBloque(0, new BloqueMoverDerecha());
        unBloqueExterior.agregarBloque(0, new BloqueMoverArriba());
        unBloqueExterior.agregarBloque(0, unBloqueInterior);
        unBloqueExterior.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -2);
        assertEquals(unPersonaje.getPosicionY(), -2);
    }

}
