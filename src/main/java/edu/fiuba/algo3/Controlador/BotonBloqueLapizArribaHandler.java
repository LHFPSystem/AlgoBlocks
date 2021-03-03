package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        this.tablero.setBloque(new BloqueLapizArriba());
        Image imagenLapizArriba = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/personajeConLapizArriba.jpg");
        ImageView imagenLapizArribaView = new ImageView(imagenLapizArriba);
        imagenLapizArribaView.setFitWidth(60);
        imagenLapizArribaView.setFitHeight(55);
        sectorAlgoritmo.setMargin(imagenLapizArribaView, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenLapizArribaView);
    }
}
