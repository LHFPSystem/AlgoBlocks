package edu.fiuba.algo3.modelo;


import java.util.ArrayList;
import java.util.List;

public class Tablero {
    List<Bloque> bloques = new ArrayList<>();
    Personaje unPersonaje;
    Dibujo dibujo = new Dibujo();

    public Tablero(Personaje personaje){
        this.unPersonaje = personaje;
        dibujo.agregarTramo(unPersonaje);
    }

    public void setBloque(Bloque unBloque){
        bloques.add(unBloque);
    }

    public void ejecutarAlgoritmo(){

        for (Bloque bloque : bloques) {
            bloque.ejecutar(unPersonaje);
            this.dibujo.agregarTramo(unPersonaje);
        }
    }

    public Dibujo getDibujo(){
        return this.dibujo;
    }
}
