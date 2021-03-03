package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class BotonBloqueDerechaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueDerechaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        this.tablero.setBloque(new BloqueMoverDerecha());
        Image imagenFlechaDerecha = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaDerecha.jpg");
        ImageView imagenFlechaDerechaView = new ImageView(imagenFlechaDerecha);
        imagenFlechaDerechaView.setFitWidth(40);
        imagenFlechaDerechaView.setFitHeight(35);
        sectorAlgoritmo.setMargin(imagenFlechaDerechaView, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenFlechaDerechaView);

    }
}