package edu.fiuba.algo3.modelo;

public class BloqueLapizAbajo implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.bajarLapiz();
    }

    public void ejecutarBloqueInverso(Personaje unPersonaje) {
        unPersonaje.levantarLapiz();
    }
}