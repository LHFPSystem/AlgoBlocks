package edu.fiuba.algo3.vista;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaBloqueArriba {
    HBox dibujoBloque = new HBox();

    VistaBloqueArriba() {
        dibujoBloque.setStyle("-fx-border-color: brown;");

        Label nombre = new Label("Arriba");
        dibujoBloque.setMargin(nombre, new Insets(10, 10, 10,10));
        dibujoBloque.getChildren().add(nombre);
    }

    VistaBloqueArriba copiar() { //interfa
        return new VistaBloqueArriba();
    }

    HBox getVista() {
        return dibujoBloque;
    }
}