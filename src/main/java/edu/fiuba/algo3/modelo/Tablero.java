package edu.fiuba.algo3.modelo;


import java.util.ArrayList;
import java.util.List;

public class Tablero {
    ArrayList<Bloque> bloques = new ArrayList<>();
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

    public void limpiarListaBloques(){
        this.bloques.clear();
    }

    public int getCantidadBloques() {
        return this.bloques.size();
    }

    public ArrayList<Bloque> getBloques() {
        return this.bloques;
    }
}


