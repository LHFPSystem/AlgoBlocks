package edu.fiuba.algo3.modelo;

public class BloqueMoverIzquierda implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.moverIzquierda();
    }

    public void ejecutarBloqueInverso(Personaje unPersonaje) {
        unPersonaje.moverDerecha();
    }
}
