package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class BotonBloqueIzquierdaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueIzquierdaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        System.out.println("Izquierda");
        Label labelIzquierda = new Label("Izquierda");
        sectorAlgoritmo.setMargin(labelIzquierda, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelIzquierda);
        this.tablero.setBloque(new BloqueMoverIzquierda());
    }
}