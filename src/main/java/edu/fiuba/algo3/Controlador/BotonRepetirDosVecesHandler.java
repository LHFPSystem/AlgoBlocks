package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonRepetirDosVecesHandler implements EventHandler<ActionEvent> {

    private Button botonBloqueAbajo;
    private Button botonBloqueArriba;
    private Button botonBloqueDerecha;
    private Button botonBloqueIzquierda;
    private Button botonBloqueLapizAbajo;
    private Button botonBloqueLapizArriba;

    public BotonRepetirDosVecesHandler(Button botonBloqueAbajo,
                                       Button botonBloqueArriba,
                                       Button botonBloqueDerecha,
                                       Button botonBloqueIzquierda,
                                       Button botonBloqueLapizAbajo,
                                       Button botonBloqueLapizArriba){

        this.botonBloqueAbajo = botonBloqueAbajo;
        this.botonBloqueArriba = botonBloqueArriba;
        this.botonBloqueDerecha = botonBloqueDerecha;
        this.botonBloqueIzquierda = botonBloqueIzquierda;
        this.botonBloqueLapizAbajo = botonBloqueLapizAbajo;
        this.botonBloqueLapizArriba = botonBloqueLapizArriba;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        this.botonBloqueAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });
        this.botonBloqueArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });
        this.botonBloqueDerecha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });
        this.botonBloqueIzquierda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });
        this.botonBloqueLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });
        this.botonBloqueLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });



    }
}
