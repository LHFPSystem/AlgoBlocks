package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableroTest {
    @Test
    public void test01SeEjecutaUnAlgoritmoDeUnBloque() {
        BloqueAlgoritmoPersonalizado algoritmo = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        algoritmo.agregarBloque(0, new BloqueMoverArriba());
        algoritmo.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionY(), 1);
    }

    @Test
    public void test02SeEjecutaUnAlgoritmoConDosBLoques() {
        BloqueAlgoritmoPersonalizado algoritmo = new BloqueAlgoritmoPersonalizado();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        algoritmo.agregarBloque(0, new BloqueMoverArriba());
        algoritmo.agregarBloque(1, new BloqueMoverIzquierda());
        algoritmo.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -1);
        assertEquals(unPersonaje.getPosicionY(), 1);
    }

    @Test
    public void test03SeEjecutaUnAlgoritmoConBLoquesCompuestos() {
        BloqueAlgoritmoPersonalizado algoritmo = new BloqueAlgoritmoPersonalizado();
        BloqueRepetir unBloqueRepetir = new BloqueRepetir();
        Dibujo dibujo = new Dibujo();
        Personaje unPersonaje = new Personaje(dibujo);

        algoritmo.agregarBloque(0, new BloqueMoverArriba());
        algoritmo.agregarBloque(1, new BloqueMoverIzquierda());
        unBloqueRepetir.establecerCantidadRepeticiones(2);
        unBloqueRepetir.agregarBloque(0, new BloqueMoverArriba());
        unBloqueRepetir.agregarBloque(1, new BloqueMoverIzquierda());
        algoritmo.agregarBloque(2, unBloqueRepetir);
        algoritmo.ejecutar(unPersonaje);

        assertEquals(unPersonaje.getPosicionX(), -3);
        assertEquals(unPersonaje.getPosicionY(), 3);
    }
}
