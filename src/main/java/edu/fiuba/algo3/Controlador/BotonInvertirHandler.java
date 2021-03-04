package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class BotonInvertirHandler implements EventHandler<ActionEvent> {

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
    private int posicion;
    private BloqueInvertir invertir;
    private VBox sector;
    private Tablero tablero;
    private VBox sectorAlgoritmo;
    public BotonInvertirHandler(Button botonBloqueAbajo, Button botonBloqueArriba,
                                Button botonBloqueDerecha, Button botonBloqueIzquierda,
                                Button botonLapizAbajo, Button botonLapizArriba,
                                BotonBloqueAbajoHandler botonBloqueAbajoHandler,
                                BotonBloqueArribaHandler botonBloqueArribaHandler,
                                BotonBloqueDerechaHandler botonBloqueDerechaHandler,
                                BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler,
                                BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler,
                                BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler,
                                VBox sector, Tablero tablero, VBox sectorAlgoritmo){

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
        this.sector = sector;
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;

    }
    @Override
    public void handle(ActionEvent actionEvent) {

        this.invertir = new BloqueInvertir();
        this.posicion = 0;

        Label labelInvertir = new Label("--- Invertir ---");
        sectorAlgoritmo.setMargin(labelInvertir, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelInvertir);

        this.botonBloqueAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueMoverAbajo());
                posicion++;
                Image imagenFlechaArriba = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaArriba.jpg");
                ImageView imagenFlechaArribaView = new ImageView(imagenFlechaArriba);
                imagenFlechaArribaView.setFitWidth(40);
                imagenFlechaArribaView.setFitHeight(35);
                sectorAlgoritmo.setMargin(imagenFlechaArribaView, new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenFlechaArribaView);
            }
        });
        this.botonBloqueArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueMoverArriba());
                posicion++;
                Image imagenFlechaAbajo = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaAbajo.jpg");
                ImageView imagenFlechaAbajoView = new ImageView(imagenFlechaAbajo);
                imagenFlechaAbajoView.setFitWidth(40);
                imagenFlechaAbajoView.setFitHeight(35);
                sectorAlgoritmo.setMargin(imagenFlechaAbajoView, new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenFlechaAbajoView);
            }
        });
        this.botonBloqueDerecha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueMoverDerecha());
                posicion++;
                Image imagenFlechaIzquierda = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaIzquierda.jpg");
                ImageView imagenFlechaIzquierdaView = new ImageView(imagenFlechaIzquierda);
                imagenFlechaIzquierdaView.setFitWidth(40);
                imagenFlechaIzquierdaView.setFitHeight(35);
                sectorAlgoritmo.setMargin(imagenFlechaIzquierdaView , new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenFlechaIzquierdaView );
            }
        });
        this.botonBloqueIzquierda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueMoverIzquierda());
                posicion++;
                Image imagenFlechaDerecha = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaDerecha.jpg");
                ImageView imagenFlechaDerechaView = new ImageView(imagenFlechaDerecha);
                imagenFlechaDerechaView.setFitWidth(40);
                imagenFlechaDerechaView.setFitHeight(35);
                sectorAlgoritmo.setMargin(imagenFlechaDerechaView, new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenFlechaDerechaView);
            }
        });
        this.botonLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueLapizAbajo());
                posicion++;
                Image imagenLapizArriba = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/personajeConLapizArriba.jpg");
                ImageView imagenLapizArribaView = new ImageView(imagenLapizArriba);
                imagenLapizArribaView.setFitWidth(60);
                imagenLapizArribaView.setFitHeight(55);
                sectorAlgoritmo.setMargin(imagenLapizArribaView, new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenLapizArribaView);
            }
        });
        this.botonLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                invertir.agregarBloque(posicion, new BloqueLapizArriba());
                posicion++;
                Image imagenLapizAbajo = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/personajeConLapizAbajo.jpg");
                ImageView imagenLapizAbajoView = new ImageView(imagenLapizAbajo);
                imagenLapizAbajoView.setFitWidth(60);
                imagenLapizAbajoView.setFitHeight(55);
                sectorAlgoritmo.setMargin(imagenLapizAbajoView, new Insets(10, 10, 10, 10));
                sectorAlgoritmo.getChildren().add(imagenLapizAbajoView);
            }
        });
        Button botonInvertir = new Button("Finalizar Invertir");

        BotonFinalizarSeleccionDeBloquesHandler botonFinalizarInvertirHandler = new BotonFinalizarSeleccionDeBloquesHandler(botonBloqueAbajo,
                botonBloqueArriba,botonBloqueDerecha,botonBloqueIzquierda,botonLapizAbajo,botonLapizArriba,
                botonBloqueAbajoHandler,botonBloqueArribaHandler,botonBloqueDerechaHandler,botonBloqueIzquierdaHandler,
                botonBloqueLapizArribaHandler,botonBloqueLapizAbajoHandler, invertir, tablero, sector, botonInvertir, sectorAlgoritmo);
        botonInvertir.setOnAction(botonFinalizarInvertirHandler);

        sector.getChildren().add(botonInvertir);

    }
}