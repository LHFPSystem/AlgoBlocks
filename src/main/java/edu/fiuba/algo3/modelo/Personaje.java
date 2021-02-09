package edu.fiuba.algo3.modelo;

public class Personaje {

    private int posicionX = 0;
    private int posicionY = 0;
    private boolean lapizLenvantado = true;

    public void bajarLapiz(){
        this.lapizLenvantado = false;
    }

    public void levantarLapiz(){
        this.lapizLenvantado = true;
    }

    public boolean estaElLapizLevantado(){
        return lapizLenvantado;
    }

    public void moverDerecha(){
        posicionX++;
    }

    public void moverIzquierda(){
        posicionX--;
    }

    public void subir(){
        posicionY++;
    }

    public void bajar(){
        posicionY--;
    }

    public int getPosicionX(){
        return posicionX;
    }

    public int getPosicionY(){
        return posicionY;
    }

}
