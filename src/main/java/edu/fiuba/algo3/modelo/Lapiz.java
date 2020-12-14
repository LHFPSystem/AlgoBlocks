package edu.fiuba.algo3.modelo;

public class Lapiz {

    EstadoLapiz estadoLapiz;



    public Lapiz(LapizLevantado lapizLevantado){
        this.estadoLapiz = lapizLevantado;
    }

    public EstadoLapiz getEstadoLapiz(){
        return this.estadoLapiz;
    }

    public void cambiarEstado(EstadoLapiz unEstado){
        this.estadoLapiz = unEstado;
    }

}
