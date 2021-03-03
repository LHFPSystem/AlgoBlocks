package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.Controlador.BotonBloqueAbajoHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueArribaHandler;

public class BotonListoRepetirDosVecesHandler implements EventHandler<ActionEvent> {
    private Button botonBloqueAbajo;
    private Button botonBloqueArriba;
    private Button botonBloqueDerecha;
    private Button botonBloqueIzquierda;
    private Button botonLapizAbajo;
    private Button botonLapizArriba;
    private BotonBloqueAbajoHandler botonBloqueAbajoHandler;
    private BotonBloqueArribaHandler botonBloqueArribaHandler;
    private BotonBloqueDerechaHandler botonBloqueDerechaHandler;
    private BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler;
    private BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler;
    private BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler;

    public BotonListoRepetirDosVecesHandler(Button botonBloqueAbajo, Button botonBloqueArriba,
                                            Button botonBloqueDerecha, Button botonBloqueIzquierda,
                                            Button botonLapizAbajo, Button botonLapizArriba,
                                            BotonBloqueAbajoHandler botonBloqueAbajoHandler,
                                            BotonBloqueArribaHandler botonBloqueArribaHandler,
                                            BotonBloqueDerechaHandler botonBloqueDerechaHandler,
                                            BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler,
                                            BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler,
                                            BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler){

        this.botonBloqueAbajo = botonBloqueAbajo;
        this.botonBloqueArriba = botonBloqueArriba;
        this.botonBloqueDerecha = botonBloqueDerecha;
        this.botonBloqueIzquierda = botonBloqueIzquierda;
        this.botonLapizAbajo = botonLapizAbajo;
        this.botonLapizArriba = botonLapizArriba;
        this.botonBloqueAbajoHandler = botonBloqueAbajoHandler;
        this.botonBloqueArribaHandler = botonBloqueArribaHandler;
        this.botonBloqueDerechaHandler = botonBloqueDerechaHandler;
        this.botonBloqueIzquierdaHandler = botonBloqueIzquierdaHandler;
        this.botonBloqueLapizArribaHandler = botonBloqueLapizArribaHandler;
        this.botonBloqueLapizAbajoHandler = botonBloqueLapizAbajoHandler;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.botonBloqueAbajo.setOnAction(botonBloqueAbajoHandler);
        this.botonBloqueArriba.setOnAction(botonBloqueArribaHandler);
        this.botonBloqueDerecha.setOnAction(botonBloqueDerechaHandler);
        this.botonBloqueIzquierda.setOnAction(botonBloqueIzquierdaHandler);
        this.botonLapizAbajo.setOnAction(botonBloqueLapizArribaHandler);
        this.botonLapizArriba.setOnAction(botonBloqueLapizAbajoHandler);
    }
}
