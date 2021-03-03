package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueLapizAbajo;
import edu.fiuba.algo3.modelo.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        this.tablero.setBloque(new BloqueLapizAbajo());
        Image imagenLapizAbajo = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/personajeConLapizAbajo.jpg");
        ImageView imagenLapizAbajoView = new ImageView(imagenLapizAbajo);
        imagenLapizAbajoView.setFitWidth(60);
        imagenLapizAbajoView.setFitHeight(55);
        sectorAlgoritmo.setMargin(imagenLapizAbajoView, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenLapizAbajoView);
    }
}
