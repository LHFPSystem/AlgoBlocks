package edu.fiuba.algo3.modelo;

public class Personaje {

    private int posicionX = 0;
    private int posicionY = 0;
    private boolean lapizLenvantado = true;
    private Dibujo dibujo;

    public Personaje(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

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
        dibujo.agregarTramo(this);
    }

    public void moverIzquierda(){
        posicionX--;
        dibujo.agregarTramo(this);
    }

    public void subir(){
        posicionY++;
        dibujo.agregarTramo(this);
    }

    public void bajar(){
        posicionY--;
        dibujo.agregarTramo(this);
    }

    public int getPosicionX(){
        return posicionX;
    }

    public int getPosicionY(){
        return posicionY;
    }
}
