package edu.fiuba.algo3.modelo;

public class BloqueLapizAbajo implements Bloque{

    @Override
    public void EjecutarCompartamiento(Personaje unPersonaje){
        unPersonaje.bajarLapiz();
        System.out.println("Lapiz Abajo");

    }
}