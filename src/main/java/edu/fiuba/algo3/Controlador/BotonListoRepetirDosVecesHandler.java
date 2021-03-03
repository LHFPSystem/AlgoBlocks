package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.Controlador.BotonBloqueAbajoHandler;

public class BotonListoRepetirDosVecesHandler implements EventHandler<ActionEvent> {
    private Button boton;
    private BotonBloqueAbajoHandler botonBloqueAbajoHandler;

    public BotonListoRepetirDosVecesHandler(Button boton, BotonBloqueAbajoHandler botonBloqueAbajoHandler){
        this.boton = boton;
        this.botonBloqueAbajoHandler = botonBloqueAbajoHandler;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.boton.setOnAction(botonBloqueAbajoHandler);
    }
}
