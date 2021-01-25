package edu.fiuba.algo3.modelo;

public class BloqueMoverAbajo implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.bajar();
        System.out.println("Personaje Abajo");
    }
}