package edu.fiuba.algo3.vista;


import edu.fiuba.algo3.vista.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class ContenedorBienvenidos extends StackPane {
    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena){
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(25.0D));

        Button botonEntrar = new Button();
        botonEntrar.setText("Comenzar Juego");

        Image imagen = new Image("https://i.imgur.com/Xx0CFYB.jpg");
        ImageView mv = new ImageView(imagen);
        mv.fitWidthProperty().bind(stage.widthProperty());
        mv.setPreserveRatio(true);

        this.getChildren().add(mv);
        this.getChildren().add(botonEntrar);
        botonEntrar.setTranslateY(100);
        botonEntrar.setTranslateX(50);

        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena);
        botonEntrar.setOnAction(botonEntrarHandler);

    }
}
