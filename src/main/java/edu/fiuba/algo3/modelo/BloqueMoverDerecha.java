package edu.fiuba.algo3.modelo;

public class BloqueMoverDerecha implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.moverDerecha();
        System.out.println("Personaje derecha");

    }
}
