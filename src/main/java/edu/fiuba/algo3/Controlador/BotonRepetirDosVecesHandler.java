package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonRepetirDosVecesHandler implements EventHandler<ActionEvent> {
    private Button boton;

    public BotonRepetirDosVecesHandler(Button boton){
        this.boton = boton;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        this.boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Repetir Dos veces ");
            }
        });



    }
}
