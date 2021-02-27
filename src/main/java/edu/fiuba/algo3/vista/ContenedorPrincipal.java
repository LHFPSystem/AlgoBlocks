package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

    VistaSectorBloques vistaSectorBloques = new VistaSectorBloques();
    VistaSectorAlgoritmo vistaSectorAlgoritmo = new VistaSectorAlgoritmo();
    VistaSectorDibujo vistaSectorDibujo = new VistaSectorDibujo();


    public ContenedorPrincipal(Stage stage, Tablero tablero) {


        this.setVistaSectorBloques();
        this.setVistaSectorAlgoritmo();
        this.setVistaSectorDibujo();

    }


    private void setVistaSectorBloques(){

        Label nombreVista = new Label("Bloques");

        Button botonBloqueArriba = new Button();
        botonBloqueArriba.setText("Arriba");

        VBox sectorBloques = new VBox(new Node[]{nombreVista, botonBloqueArriba});
        sectorBloques.setSpacing(10.0D);
        sectorBloques.setPadding(new Insets(15.0D));
        //vistaBloques.setPrefWidth(400);
        //vistaBloques.setPrefHeight(400);
        sectorBloques.setStyle("-fx-border-color: brown;");
        this.setLeft(sectorBloques);

        //this.setLeft(this.vistaSectorBloques.getVista());

        // crear boton moverArriba

    }

    private void setVistaSectorAlgoritmo(){

        this.setCenter(this.vistaSectorAlgoritmo.getVista());

        // etiqueta moverArriba
    }

    private void setVistaSectorDibujo(){

        this.setRight(this.vistaSectorDibujo.getVista());
    }

}
