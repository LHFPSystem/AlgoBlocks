package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class BotonFinalizarSeleccionDeBloquesHandler implements EventHandler<ActionEvent> {
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
    private Tablero tablero;
    private Bloque bloque;
    private VBox sector;
    private VBox sectorAlgoritmo;
    private Button boton;
    public BotonFinalizarSeleccionDeBloquesHandler(Button botonBloqueAbajo, Button botonBloqueArriba,
                                                   Button botonBloqueDerecha, Button botonBloqueIzquierda,
                                                   Button botonLapizAbajo, Button botonLapizArriba,
                                                   BotonBloqueAbajoHandler botonBloqueAbajoHandler,
                                                   BotonBloqueArribaHandler botonBloqueArribaHandler,
                                                   BotonBloqueDerechaHandler botonBloqueDerechaHandler,
                                                   BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler,
                                                   BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler,
                                                   BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler,
                                                   Bloque bloque , Tablero tablero, VBox sector, Button boton,
                                                   VBox sectorAlgoritmo){

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
        this.tablero = tablero;
        this.bloque = bloque;
        this.sector = sector;
        this.boton = boton;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.botonBloqueAbajo.setOnAction(botonBloqueAbajoHandler);
        this.botonBloqueArriba.setOnAction(botonBloqueArribaHandler);
        this.botonBloqueDerecha.setOnAction(botonBloqueDerechaHandler);
        this.botonBloqueIzquierda.setOnAction(botonBloqueIzquierdaHandler);
        this.botonLapizAbajo.setOnAction(botonBloqueLapizAbajoHandler);
        this.botonLapizArriba.setOnAction(botonBloqueLapizArribaHandler);
        this.tablero.setBloque(this.bloque);
        sector.getChildren().remove(boton);

        Label label = new Label("----------");
        sectorAlgoritmo.setMargin(label, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(label);
    }
}
