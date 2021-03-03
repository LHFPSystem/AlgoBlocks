package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class BotonBloqueArribaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueArribaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        this.tablero.setBloque(new BloqueMoverArriba());
        Image imagenFlechaArriba = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaArriba.jpg");
        ImageView imagenFlechaArribaView = new ImageView(imagenFlechaArriba);
        imagenFlechaArribaView.setFitWidth(40);
        imagenFlechaArribaView.setFitHeight(35);
        sectorAlgoritmo.setMargin(imagenFlechaArribaView, new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenFlechaArribaView);

    }
}

