package edu.fiuba.algo3.vista;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class VistaBloqueDerecha {

    HBox dibujoBloque = new HBox();

    public VistaBloqueDerecha() {
        dibujoBloque.setStyle("-fx-border-color: brown;");

        Label nombre = new Label("Derecha");
        dibujoBloque.setMargin(nombre, new Insets(10, 10, 10,10));
        dibujoBloque.getChildren().add(nombre);
    }

    public VistaBloqueDerecha copiar() { //interfa
        return new VistaBloqueDerecha();
    }

    public HBox getVista() {
        return dibujoBloque;
    }

}
