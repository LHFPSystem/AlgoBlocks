package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.Tramo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import edu.fiuba.algo3.modelo.Dibujo;

public class BotonEjecutarHandler implements EventHandler<ActionEvent> {
    private Tablero tablero;
    private VBox sector;
    private Dibujo dibujo;
    private Canvas canvas;

    public BotonEjecutarHandler(Tablero tablero, VBox sector, Canvas canvas){
        this.tablero = tablero;
        this.sector = sector;
        this.canvas = canvas;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.ejecutarAlgoritmo();
        dibujo = this.tablero.getDibujo();
    }
}
