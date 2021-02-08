package edu.fiuba.algo3.modelo;

public class Tramo {
    private int posicionX;
    private int posicionY;
    private boolean lapizLevantado;

    public Tramo(int x, int y, boolean estaLapizLevantado) {
        this.posicionX = x;
        this.posicionY = y;
        this.lapizLevantado = estaLapizLevantado;
    }

    public int obtenerPosicionX() {
        return this.posicionX;
    }

    public int obtenerPosicionY() {
        return this.posicionY;
    }

    public boolean estaElLapizLevantado() {
        return lapizLevantado;
    }
}
