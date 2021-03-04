package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.ContenedorBienvenidos;
import edu.fiuba.algo3.vista.ContenedorPrincipal;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.File;
import java.util.Stack;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

    primaryStage.setTitle("AlgoBlocks");

    Tablero tablero = this.crearTablero();

    ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(primaryStage, tablero);

    Scene escenaJuego = new Scene(contenedorPrincipal, 800.0D, 600.0D);

    ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(primaryStage, escenaJuego);

    Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 1024.0D, 768.0D);
    primaryStage.setScene(escenaBienvenidos);
    primaryStage.show();
    }

    private Tablero crearTablero(){
        Tablero tablero = new Tablero();
        return tablero;
    }

    public static void main(String[] args) {
        launch(args);
    }

}