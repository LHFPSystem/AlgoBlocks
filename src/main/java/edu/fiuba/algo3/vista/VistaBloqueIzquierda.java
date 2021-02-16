package edu.fiuba.algo3.vista;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class VistaBloqueIzquierda {
    HBox dibujoBloque = new HBox();

    public VistaBloqueIzquierda() {
        dibujoBloque.setStyle("-fx-border-color: brown;");

        Label nombre = new Label("Izquierda");
        dibujoBloque.setMargin(nombre, new Insets(10, 10, 10,10));
        dibujoBloque.getChildren().add(nombre);
    }

    public VistaBloqueIzquierda copiar() { //interfa
        return new VistaBloqueIzquierda();
    }

    public HBox getVista() {
        return dibujoBloque;
    }
}
