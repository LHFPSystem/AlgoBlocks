package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class BotonBloqueIzquierdaHandler implements EventHandler<ActionEvent> {

    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonBloqueIzquierdaHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        this.tablero.setBloque(new BloqueMoverIzquierda());
        Image imagenFlechaIzquierda = new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/flechaIzquierda.jpg");
        ImageView imagenFlechaIzquierdaView = new ImageView(imagenFlechaIzquierda);
        imagenFlechaIzquierdaView.setFitWidth(40);
        imagenFlechaIzquierdaView.setFitHeight(35);
        sectorAlgoritmo.setMargin(imagenFlechaIzquierdaView , new Insets(10, 10, 10, 10));
        sectorAlgoritmo.getChildren().add(imagenFlechaIzquierdaView );

    }
}