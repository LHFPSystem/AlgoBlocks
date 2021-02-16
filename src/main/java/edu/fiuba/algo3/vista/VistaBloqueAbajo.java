package edu.fiuba.algo3.vista;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class VistaBloqueAbajo {
    HBox dibujoBloque = new HBox();

    public VistaBloqueAbajo() {
        dibujoBloque.setStyle("-fx-border-color: brown;");

        Label nombre = new Label("Abajo");
        dibujoBloque.setMargin(nombre, new Insets(10, 10, 10,10));
        dibujoBloque.getChildren().add(nombre);
    }

    public VistaBloqueAbajo copiar() { //interfa
        return new VistaBloqueAbajo();
    }

    public HBox getVista() {
        return dibujoBloque;
    }
}
