package edu.fiuba.algo3.modelo;

public class BloqueMoverAbajo implements Bloque{

    @Override
    public void EjecutarCompartamiento(Personaje unPersonaje){
        unPersonaje.bajar();
        System.out.println("Personaje Abajo");
    }
}