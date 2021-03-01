package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import edu.fiuba.algo3.modelo.Dibujo;

public class BotonEjecutarHandler implements EventHandler<ActionEvent> {
    private Tablero tablero;
    private VBox sector;
    private Dibujo dibujo;

    public BotonEjecutarHandler(Tablero tablero, VBox sector){
        this.tablero = tablero;
        this.sector = sector;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.ejecutarAlgoritmo();
        dibujo = this.tablero.getDibujo();

    }
}
