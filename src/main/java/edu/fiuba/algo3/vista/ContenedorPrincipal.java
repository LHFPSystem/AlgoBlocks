package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.Controlador.BotonBloqueAbajoHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueArribaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueDerechaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueIzquierdaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueLapizArribaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueLapizAbajoHandler;
import edu.fiuba.algo3.Controlador.BotonEjecutarHandler;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;


public class ContenedorPrincipal extends BorderPane {

    VBox vistaSectorAlgoritmo = new VBox();
    VBox vistaSectorDibujo = new VBox();
    Canvas canvas;


    public ContenedorPrincipal(Stage stage, Tablero tablero) {

        this.setVistaSectorBloques(tablero, vistaSectorAlgoritmo);
        this.setVistaSectorAlgoritmo();
        this.setVistaSectorDibujo(tablero);

    }


    private void setVistaSectorBloques(Tablero tablero, VBox vistaSectorAlgoritmo){

        Label nombreVista = new Label("Bloques");

        Button botonBloqueArriba = new Button("Arriba");
        BotonBloqueArribaHandler botonBloqueArribaHandler = new BotonBloqueArribaHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueArriba.setOnAction(botonBloqueArribaHandler);
        Image imagenFlechaArriba = new Image("file:///home/gonza/Escritorio/tp2algo3/AlgoBlocks/src/flechaArriba.jpg");
        ImageView imagenFlechaArribaView = new ImageView(imagenFlechaArriba);
        imagenFlechaArribaView.setFitHeight(55);
        imagenFlechaArribaView.setFitWidth(100);
        botonBloqueArriba.setGraphic(imagenFlechaArribaView);

        Button botonBloqueAbajo = new Button("Abajo");
        BotonBloqueAbajoHandler botonBloqueAbajoHandler = new BotonBloqueAbajoHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueAbajo.setOnAction(botonBloqueAbajoHandler);
        Image imagenFlechaAbajo = new Image("file:///home/gonza/Escritorio/tp2algo3/AlgoBlocks/src/flechaAbajo.jpg");
        ImageView imagenFlechaAbajoView = new ImageView(imagenFlechaAbajo);
        imagenFlechaAbajoView.setFitHeight(55);
        imagenFlechaAbajoView.setFitWidth(100);
        botonBloqueAbajo.setGraphic(imagenFlechaAbajoView);

        Button botonBloqueDerecha = new Button("Derecha");
        BotonBloqueDerechaHandler botonBloqueDerechaHandler = new BotonBloqueDerechaHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueDerecha.setOnAction(botonBloqueDerechaHandler);
        Image imagenFlechaDerecha = new Image("file:///home/gonza/Escritorio/tp2algo3/AlgoBlocks/src/flechaDerecha.jpg");
        ImageView imagenFlechaDerechaView = new ImageView(imagenFlechaDerecha);
        imagenFlechaDerechaView.setFitHeight(55);
        imagenFlechaDerechaView.setFitWidth(80);
        botonBloqueDerecha.setGraphic(imagenFlechaDerechaView);

        Button botonBloqueIzquierda = new Button("Izquierda");
        BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler = new BotonBloqueIzquierdaHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueIzquierda.setOnAction(botonBloqueIzquierdaHandler);
        Image imagenFlechaIzquierda = new Image("file:///home/gonza/Escritorio/tp2algo3/AlgoBlocks/src/flechaIzquierda.jpg");
        ImageView imagenFlechaIzquierdaView = new ImageView(imagenFlechaIzquierda);
        imagenFlechaIzquierdaView.setFitHeight(55);
        imagenFlechaIzquierdaView.setFitWidth(80);
        botonBloqueIzquierda.setGraphic(imagenFlechaIzquierdaView);

        Button botonBloqueLapizArriba = new Button("Lapiz Arriba");
        BotonBloqueLapizArribaHandler botonBloqueLapizArribaHandler = new BotonBloqueLapizArribaHandler(tablero, vistaSectorAlgoritmo) ;
        botonBloqueLapizArriba.setOnAction(botonBloqueLapizArribaHandler);

        Button botonBloqueLapizAbajo = new Button("Lapiz Abajo");
        BotonBloqueLapizAbajoHandler botonBloqueLapizAbajoHandler = new BotonBloqueLapizAbajoHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueLapizAbajo.setOnAction(botonBloqueLapizAbajoHandler);

        VBox sectorBloques = new VBox(new Node[]{nombreVista, botonBloqueArriba, botonBloqueAbajo,
                botonBloqueDerecha, botonBloqueIzquierda, botonBloqueLapizArriba, botonBloqueLapizAbajo});
        sectorBloques.setSpacing(10.0D);
        sectorBloques.setPadding(new Insets(15.0D));
        sectorBloques.setPrefWidth(400);
        sectorBloques.setPrefHeight(400);
        sectorBloques.setStyle("-fx-border-color: brown;");
        this.setLeft(sectorBloques);

    }

    private void setVistaSectorAlgoritmo(){

        vistaSectorAlgoritmo.setPrefWidth(400);
        vistaSectorAlgoritmo.setPrefHeight(400);
        vistaSectorAlgoritmo.setStyle("-fx-border-color: brown;");

        Label nombreVista = new Label("Algoritmo");
        vistaSectorAlgoritmo.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        vistaSectorAlgoritmo.getChildren().add(nombreVista);
        this.setCenter(vistaSectorAlgoritmo);
    }

    private void setVistaSectorDibujo(Tablero tablero){

        this.canvas = new Canvas(600,600);

        Button botonEjecutarAlgoritmo = new Button("Ejecutar Algorimo");
        BotonEjecutarHandler botonEjecutarHandler = new BotonEjecutarHandler(tablero, vistaSectorDibujo, this.canvas);
        botonEjecutarAlgoritmo.setOnAction(botonEjecutarHandler);

        vistaSectorDibujo.setSpacing(10.0D);
        vistaSectorDibujo.setPadding(new Insets(15.0D));
        vistaSectorDibujo.setPrefWidth(800);
        vistaSectorDibujo.setPrefHeight(800);
        vistaSectorDibujo.setStyle("-fx-border-color: brown;");

        Label nombreVista = new Label("Dibujo");
        vistaSectorDibujo.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        vistaSectorDibujo.getChildren().add(nombreVista);
        vistaSectorDibujo.getChildren().add(botonEjecutarAlgoritmo);
        vistaSectorDibujo.getChildren().add(this.canvas);
        this.setRight(vistaSectorDibujo);
    }

}
