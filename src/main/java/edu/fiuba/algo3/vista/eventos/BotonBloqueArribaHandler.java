package edu.fiuba.algo3.vista.eventos;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class BotonBloqueArribaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueArribaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        System.out.println("Arriba");
        Label labelArriba = new Label("Arriba");
        sectorAlgoritmo.setMargin(labelArriba, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelArriba);
        this.tablero.setBloque(new BloqueMoverArriba());
    }
}

