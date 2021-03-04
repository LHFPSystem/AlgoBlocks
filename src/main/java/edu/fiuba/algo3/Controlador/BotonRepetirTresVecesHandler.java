package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonRepetirTresVecesHandler implements EventHandler<ActionEvent> {

    private Button botonBloqueAbajo;
    private Button botonBloqueArriba;
    private Button botonBloqueDerecha;
    private Button botonBloqueIzquierda;
    private Button botonBloqueLapizAbajo;
    private Button botonBloqueLapizArriba;
    private int posicion = 0;
    private BloqueRepetir repetir;

    public BotonRepetirTresVecesHandler(Button botonBloqueAbajo, Button botonBloqueArriba, Button botonBloqueDerecha,
                                       Button botonBloqueIzquierda, Button botonBloqueLapizAbajo,
                                        Button botonBloqueLapizArriba, BloqueRepetir repetir){

        this.botonBloqueAbajo = botonBloqueAbajo;
        this.botonBloqueArriba = botonBloqueArriba;
        this.botonBloqueDerecha = botonBloqueDerecha;
        this.botonBloqueIzquierda = botonBloqueIzquierda;
        this.botonBloqueLapizAbajo = botonBloqueLapizAbajo;
        this.botonBloqueLapizArriba = botonBloqueLapizArriba;
        this.repetir = repetir;
        this.repetir.establecerCantidadRepeticiones(3);
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
        this.botonBloqueLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueLapizAbajo());
                posicion++;
            }
        });
        this.botonBloqueLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                repetir.agregarBloque(posicion,new BloqueLapizArriba());
                posicion++;
            }
        });

    }
}
