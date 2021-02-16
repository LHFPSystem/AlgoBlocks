package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Tablero tablero = new Tablero();

        stage.setTitle("AlgoBlocks");
        Scene scene = new Scene(tablero.getTablero(), 1000, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}