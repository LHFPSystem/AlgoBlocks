package edu.fiuba.algo3.vista;

import javafx.application.Application;
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

public class AlgoBlocks extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Tablero tablero = new Tablero();

        Scene scene = new Scene(tablero.getTablero());
        stage.setTitle("AlgoBlocks");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}