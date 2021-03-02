package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueLapizAbajo;
import edu.fiuba.algo3.modelo.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonBloqueLapizAbajoHandler implements EventHandler<ActionEvent> {
    Tablero tablero;
    VBox sectorAlgoritmo;

    public BotonBloqueLapizAbajoHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Lapiz Abajo");
        this.tablero.setBloque(new BloqueLapizAbajo());
        Label labelLapizAbajo = new Label("Lapiz Abajo");
        sectorAlgoritmo.setMargin(labelLapizAbajo, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelLapizAbajo);
    }
}
