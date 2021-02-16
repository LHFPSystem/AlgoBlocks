package edu.fiuba.algo3.modelo;

public class BloqueLapizArriba implements Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.levantarLapiz();
    }

    public void ejecutarBloqueInverso(Personaje unPersonaje) {
        unPersonaje.bajarLapiz();
    }
}
