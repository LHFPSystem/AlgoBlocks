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

        Tramo tramoInical = new Tramo(0,0,true);
        Tramo tramoFinal = dibujo.mostrarTramoYAvanzarAlSiguiente();
        tramoInical = this.ajustarCoordenadas(tramoInical);
        tramoFinal = this.ajustarCoordenadas(tramoFinal);

        while(tramoFinal != null){
            if (tramoFinal.estaElLapizLevantado() == false) {
                canvas.getGraphicsContext2D().strokeLine(tramoInical.obtenerPosicionX(), tramoInical.obtenerPosicionY(),
                        tramoFinal.obtenerPosicionX(), tramoFinal.obtenerPosicionY());
            }
            tramoInical = tramoFinal;
            tramoFinal = dibujo.mostrarTramoYAvanzarAlSiguiente();
            if(tramoFinal != null){
                tramoFinal = this.ajustarCoordenadas(tramoFinal);
            }

        }

    }

    private Tramo ajustarCoordenadas(Tramo tramo){

        return new Tramo((tramo.obtenerPosicionX()*50)+100,-(tramo.obtenerPosicionY()*50)+100,tramo.estaElLapizLevantado());
    }

}
