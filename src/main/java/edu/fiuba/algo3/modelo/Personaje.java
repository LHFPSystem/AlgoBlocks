package edu.fiuba.algo3.modelo;

public class Personaje {

    protected int posicionX;
    protected int posicionY;
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
}
