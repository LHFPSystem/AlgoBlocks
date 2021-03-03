package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        this.tablero.setBloque(new BloqueMoverAbajo());
        Image imagenFlechaAbajo = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaAbajo.jpg");
        ImageView imagenFlechaAbajoView = new ImageView(imagenFlechaAbajo);
        imagenFlechaAbajoView.setFitWidth(40);
        imagenFlechaAbajoView.setFitHeight(35);
        sectorAlgoritmo.setMargin(imagenFlechaAbajoView, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenFlechaAbajoView);
    }
}
