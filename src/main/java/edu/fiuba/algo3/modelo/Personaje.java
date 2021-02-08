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

    public void moverDerecha(Dibujo unDibujo){
        posicionX++;
        unDibujo.agregarTramo(new Tramo(posicionX, posicionY, lapizLenvantado));
    }

    public void moverIzquierda(Dibujo unDibujo){
        posicionX--;
        unDibujo.agregarTramo(new Tramo(posicionX, posicionY, lapizLenvantado));
    }

    public void subir(Dibujo unDibujo){
        posicionY++;
        unDibujo.agregarTramo(new Tramo(posicionX, posicionY, lapizLenvantado));
    }

    public void bajar(Dibujo unDibujo){
        posicionY--;
        unDibujo.agregarTramo(new Tramo(posicionX, posicionY, lapizLenvantado));
    }

    public int getPosicionX(){
        return posicionX;
    }

    public int getPosicionY(){
        return posicionY;
    }

}
