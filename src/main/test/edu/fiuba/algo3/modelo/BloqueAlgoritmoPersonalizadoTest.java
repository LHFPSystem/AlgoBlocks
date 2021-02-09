package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueAlgoritmoPersonalizadoTest {
    @Test
    public void test01SeCreaUnAlgoritmoPersonalizadoConUnSoloBloque() {
        BloqueAlgoritmoPersonalizado unBloque = new BloqueAlgoritmoPersonalizado();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), -1);
    }

    @Test
    public void test02SeCreaUnAlgoritmoPersonalizadoConDosBloques() {
        BloqueAlgoritmoPersonalizado unBloque = new BloqueAlgoritmoPersonalizado();
        Personaje unPersonaje = new Personaje();

        unBloque.agregarBloque(0, new BloqueMoverAbajo());
        unBloque.agregarBloque(0, new BloqueMoverIzquierda());
        unBloque.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -1);
        assertEquals(unPersonaje.getPosicionY(), -1);
    }
}
