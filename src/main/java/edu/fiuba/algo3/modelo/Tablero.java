package edu.fiuba.algo3.modelo;


import java.util.ArrayList;
import java.util.List;

public class Tablero {
    List<Bloque> bloques = new ArrayList<>();
    Dibujo dibujo = new Dibujo();
    Personaje unPersonaje = new Personaje(dibujo);

    public void setBloque(Bloque unBloque){
        bloques.add(unBloque);
    }

    public void ejecutarAlgoritmo(){

        for (Bloque bloque : bloques) {
            bloque.ejecutar(unPersonaje);
        }
    }

    public Dibujo getDibujo(){
        return this.dibujo;
    }
}
