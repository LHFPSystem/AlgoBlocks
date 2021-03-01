package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class BotonBloqueDerechaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueDerechaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        System.out.println("Derecha");
        Label labelDerecha = new Label("Derecha");
        sectorAlgoritmo.setMargin(labelDerecha, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelDerecha);
        this.tablero.setBloque(new BloqueMoverDerecha());
    }
}