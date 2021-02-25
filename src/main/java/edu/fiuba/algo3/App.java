package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.vista.ContenedorBienvenidos;
import edu.fiuba.algo3.vista.ContenedorPrincipal;
import edu.fiuba.algo3.modelo.Tablero;
//import edu.fiuba.algo3.vista.Tablero;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.File;
import java.util.Stack;

/**
 * JavaFX App
 */
public class App extends Application {

    //Stage ventana;
    //Scene escenaUno,escenaDos;

    @Override
    public void start(Stage primaryStage) throws Exception {

    primaryStage.setTitle("AlgoBlocks");

    Tablero tablero = this.crearTablero();

    ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(primaryStage, tablero);

    Scene escenaJuego = new Scene(contenedorPrincipal, 800.0D, 600.0D);

    ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(primaryStage, escenaJuego);

    Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 1024.0D, 768.0D);
    primaryStage.setScene(escenaBienvenidos);
    //primaryStage.setFullScreen(true);
    primaryStage.show();


        /*ventana = primaryStage;

        primaryStage.setTitle("AlgoBlocks");
        Button botonJugar = new Button("Comenzar juego");

        botonJugar.setOnAction(e -> ventana.setScene(escenaDos));

        //Layout 1

        StackPane layoutUno = new StackPane();
        Image image = new Image("https://i.imgur.com/Xx0CFYB.jpg");

        ImageView mv = new ImageView(image);
        mv.fitWidthProperty().bind(primaryStage.widthProperty());
        mv.setPreserveRatio(true);

        layoutUno.getChildren().addAll(mv);
        layoutUno.getChildren().add(botonJugar);
        botonJugar.setTranslateY(100);
        botonJugar.setTranslateX(50);
        System.out.println(botonJugar.getTranslateX());



        escenaUno = new Scene(layoutUno,1024,768);

        //Layout 2

        Tablero tablero = new Tablero();

        primaryStage.setTitle("AlgoBlocks");
        escenaDos = new Scene(tablero.getTablero(), 1000, 600);

        ventana.setScene(escenaUno);
        ventana.setTitle("AlgoBlocks");
        ventana.show();


*/
    }

    private Tablero crearTablero(){
        Personaje unPersonaje = new Personaje();
        Tablero tablero = new Tablero(unPersonaje);

        return tablero;
    }

    public static void main(String[] args) {
        launch(args);
    }

}