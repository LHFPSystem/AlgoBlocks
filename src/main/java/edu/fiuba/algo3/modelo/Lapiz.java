package edu.fiuba.algo3.modelo;

public class Lapiz {

    LapizLevantado estadoLapiz;



    public Lapiz(LapizLevantado lapizLevantado){
        this.estadoLapiz = lapizLevantado;
    }

    public LapizLevantado getEstadoLapiz(){
        return this.estadoLapiz;
    }

}
