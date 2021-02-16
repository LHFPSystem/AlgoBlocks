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

public class VistaAuxiliar {
    VBox vistaAuxiliar = new VBox();

    VistaAuxiliar() {
        vistaAuxiliar.setPrefWidth(400);
        vistaAuxiliar.setPrefHeight(400);
        vistaAuxiliar.setStyle("-fx-border-color: brown;");

        Label nombreVista = new Label("Dibujo");
        vistaAuxiliar.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        vistaAuxiliar.getChildren().add(nombreVista);
    }

    VBox getVista() {
        return vistaAuxiliar;
    }
}