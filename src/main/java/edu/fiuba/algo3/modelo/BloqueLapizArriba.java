package edu.fiuba.algo3.modelo;

public class BloqueLapizArriba implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.levantarLapiz();
        System.out.println("Lapiz Arriba");

    }
}
