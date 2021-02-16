package edu.fiuba.algo3.vista;

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

public class Tablero {
    HBox tablero = new HBox();

    public Tablero() {
        VistaSectorDibujo sectorDibujo = new VistaSectorDibujo();
        Separator separadorDibujoAuxiliar = new Separator(Orientation.HORIZONTAL);        
        VistaAuxiliar sectorAuxiliar = new VistaAuxiliar();

        VBox columnaAuxiliar = new VBox();
        columnaAuxiliar.getChildren().add(sectorDibujo.getVista());
        columnaAuxiliar.getChildren().add(separadorDibujoAuxiliar);
        columnaAuxiliar.getChildren().add(sectorAuxiliar.getVista());

        tablero.getChildren().add(columnaAuxiliar);

        Separator separadorDibujoBloques = new Separator(Orientation.VERTICAL);
        tablero.getChildren().add(separadorDibujoBloques);

        VistaSectorBloques sectorBloques = new VistaSectorBloques();
        tablero.getChildren().add(sectorBloques.getVista());

        Separator separadorBloquesAlgoritmo = new Separator(Orientation.VERTICAL);
        tablero.getChildren().add(separadorBloquesAlgoritmo);

        VistaSectorAlgoritmo sectorAlgoritmo = new VistaSectorAlgoritmo();
        sectorBloques.agregarCapacidadPegado(sectorAlgoritmo.getVista());
        tablero.getChildren().add(sectorAlgoritmo.getVista());
    }

    public HBox getTablero() {
        return tablero;
    }
}