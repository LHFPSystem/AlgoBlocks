package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.Controlador.BotonBloqueAbajoHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueArribaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueDerechaHandler;
import edu.fiuba.algo3.Controlador.BotonBloqueIzquierdaHandler;
import edu.fiuba.algo3.Controlador.BotonEjecutarHandler;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class ContenedorPrincipal extends BorderPane {

    VBox vistaSectorAlgoritmo = new VBox();
    VBox vistaSectorDibujo = new VBox();


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

        Button botonBloqueAbajo = new Button("Abajo");
        BotonBloqueAbajoHandler botonBloqueAbajoHandler = new BotonBloqueAbajoHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueAbajo.setOnAction(botonBloqueAbajoHandler);

        Button botonBloqueDerecha = new Button("Derecha");
        BotonBloqueDerechaHandler botonBloqueDerechaHandler = new BotonBloqueDerechaHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueDerecha.setOnAction(botonBloqueDerechaHandler);

        Button botonBloqueIzquierda = new Button("Izquierda");
        BotonBloqueIzquierdaHandler botonBloqueIzquierdaHandler = new BotonBloqueIzquierdaHandler(tablero, vistaSectorAlgoritmo);
        botonBloqueIzquierda.setOnAction(botonBloqueIzquierdaHandler);


        VBox sectorBloques = new VBox(new Node[]{nombreVista, botonBloqueArriba, botonBloqueAbajo, botonBloqueDerecha, botonBloqueIzquierda});
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

        Button botonEjecutarAlgoritmo = new Button("Ejecutar Algorimo");
        BotonEjecutarHandler botonEjecutarHandler = new BotonEjecutarHandler(tablero, vistaSectorDibujo);
        botonEjecutarAlgoritmo.setOnAction(botonEjecutarHandler);


        vistaSectorDibujo.setSpacing(10.0D);
        vistaSectorDibujo.setPadding(new Insets(15.0D));
        vistaSectorDibujo.setPrefWidth(400);
        vistaSectorDibujo.setPrefHeight(400);
        vistaSectorDibujo.setStyle("-fx-border-color: brown;");

        Label nombreVista = new Label("Dibujo");
        vistaSectorDibujo.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        vistaSectorDibujo.getChildren().add(nombreVista);
        vistaSectorDibujo.getChildren().add(botonEjecutarAlgoritmo);
        this.setRight(vistaSectorDibujo);
    }

}
