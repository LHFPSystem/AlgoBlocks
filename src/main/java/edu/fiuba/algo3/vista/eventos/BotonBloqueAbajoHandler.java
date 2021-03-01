package edu.fiuba.algo3.vista.eventos;

import edu.fiuba.algo3.modelo.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class BotonBloqueAbajoHandler implements EventHandler<ActionEvent> {
    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueAbajoHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Abajo");
        this.tablero.setBloque(new BloqueMoverAbajo());
        Label labelAbajo = new Label("Abajo");
        sectorAlgoritmo.setMargin(labelAbajo, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelAbajo);
    }
}
