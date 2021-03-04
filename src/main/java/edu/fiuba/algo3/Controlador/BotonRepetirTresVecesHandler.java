package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class BotonRepetirTresVecesHandler implements EventHandler<ActionEvent> {

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
    private int posicion = 0;
    private BloqueRepetir repetir;
    private VBox sector;
    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonRepetirTresVecesHandler(Button botonBloqueAbajo, Button botonBloqueArriba,
                                        Button botonBloqueDerecha, Button botonBloqueIzquierda,
                                        Button botonLapizAbajo, Button botonLapizArriba,
                                        BotonBloqueAbajoHandler botonBloqueAbajoHandler,
                                        BotonBloqueArribaHandler botonBloqueArribaHandler,
                                        BotonBloqueDerechaHandler botonBloqueDerechaHandler,
                                        BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler,
                                        BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler,
                                        BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler,
                                        BloqueRepetir repetir, VBox sector, Tablero tablero, VBox sectorAlgoritmo){

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
        this.repetir = repetir;
        this.repetir.establecerCantidadRepeticiones(3);
        this.sector = sector;
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        this.botonBloqueAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueMoverAbajo());
                posicion++;
            }

        });
        this.botonBloqueArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueMoverArriba());
                posicion++;
            }
        });
        this.botonBloqueDerecha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueMoverDerecha());
                posicion++;
            }
        });
        this.botonBloqueIzquierda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueMoverIzquierda());
                posicion++;
            }
        });
        this.botonLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueLapizAbajo());
                posicion++;
            }
        });
        this.botonLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueLapizArriba());
                posicion++;
            }
        });
        Button boton = new Button("Finalizar Repetir Tres Veces");

        BotonFinalizarSeleccionDeBloquesHandler botonFinalizarRepetirTresVecesHandler = new BotonFinalizarSeleccionDeBloquesHandler(botonBloqueAbajo,
                botonBloqueArriba,botonBloqueDerecha,botonBloqueIzquierda,botonLapizAbajo,botonLapizArriba,
                botonBloqueAbajoHandler,botonBloqueArribaHandler,botonBloqueDerechaHandler,botonBloqueIzquierdaHandler,
                botonBloqueLapizArribaHandler,botonBloqueLapizAbajoHandler, repetir, tablero, sector, boton);
        boton.setOnAction(botonFinalizarRepetirTresVecesHandler);

        sector.getChildren().add(boton);

    }
}
