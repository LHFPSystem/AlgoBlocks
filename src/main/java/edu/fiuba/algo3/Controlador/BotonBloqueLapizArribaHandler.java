package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonBloqueLapizArribaHandler implements EventHandler<ActionEvent> {
    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueLapizArribaHandler(Tablero tablero, VBox sector){
        this.tablero = tablero;
        this.sectorAlgoritmo = sector;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Lapiz Arriba");
        this.tablero.setBloque(new BloqueLapizArriba());
        Label labelLapizArriba = new Label("Lapiz Arriba");
        sectorAlgoritmo.setMargin(labelLapizArriba, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(labelLapizArriba);
    }
}
