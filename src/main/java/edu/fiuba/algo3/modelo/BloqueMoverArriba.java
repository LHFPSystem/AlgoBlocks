package edu.fiuba.algo3.modelo;

public class BloqueMoverArriba implements Bloque{

    @Override
    public void EjecutarCompartamiento(Personaje unPersonaje){
        unPersonaje.subir();
        System.out.println("Personaje Arriba");

    }
}
