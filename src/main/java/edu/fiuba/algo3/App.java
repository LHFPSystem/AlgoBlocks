package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.Tablero;
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

    Stage ventana;
    Scene escenaUno,escenaDos;

    @Override
    public void start(Stage primaryStage) {

        ventana = primaryStage;

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



    }

    public static void main(String[] args) {
        launch(args);
    }

}