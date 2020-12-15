package edu.fiuba.algo3.modelo;

public class Personaje {

    protected int posicionX = 0;
    protected int posicionY = 0;
    protected Lapiz unLapiz;


    //constructor
    public Personaje(){
        this.unLapiz = new Lapiz(new LapizLevantado());
    }


    public Lapiz getLapiz(){
        return this.unLapiz;
    }

    public void bajarLapiz(){
        this.unLapiz.cambiarEstado(new LapizNoLevantado());
    }

    public void levantarLapiz(){
        this.unLapiz.cambiarEstado(new LapizLevantado());
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
