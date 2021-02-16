package edu.fiuba.algo3.vista;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.input.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaSectorBloques {
    VBox vistaBloques = new VBox();

    private final DataFormat formatoBloque = new DataFormat("formato-bloque");
    private HBox bloqueCopiado;

    VistaSectorBloques() {
        vistaBloques.setPrefWidth(400);
        vistaBloques.setPrefHeight(400);
        vistaBloques.setStyle("-fx-border-color: brown;");

        Label nombreVista = new Label("Bloques");
        vistaBloques.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        vistaBloques.getChildren().add(nombreVista);

        VistaBloqueArriba bloqueArriba = new VistaBloqueArriba();
        agregarCapacidadCopiar(bloqueArriba.getVista());
        vistaBloques.setMargin(bloqueArriba.getVista(), new Insets(10, 10, 10, 10));
        vistaBloques.getChildren().add(bloqueArriba.getVista());
    }

    VBox getVista() {
        return vistaBloques;
    }

    public void agregarCapacidadCopiar(HBox bloque) {
        bloque.setOnDragDetected(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                Dragboard db = bloque.startDragAndDrop(TransferMode.COPY);
                db.setDragView(bloque.snapshot(null, null));
                ClipboardContent cc = new ClipboardContent();
                cc.put(formatoBloque, "bloque");
                db.setContent(cc);
                bloqueCopiado = bloque; //solucionar con una interfaz
                event.consume();
            }
        });

        bloque.setOnDragDone(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                bloqueCopiado = null;
                event.consume();
            }
        });
    }

    public void agregarCapacidadPegado(VBox algoritmo) {
        algoritmo.setOnDragOver(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasContent(formatoBloque) && bloqueCopiado != null) {
                    event.acceptTransferModes(TransferMode.COPY);
                }
                event.consume();
            }
        });

        algoritmo.setOnDragDropped(new EventHandler <DragEvent>() {
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasContent(formatoBloque)) {
                    algoritmo.getChildren().add(bloqueCopiado);
                    event.setDropCompleted(true);
                } 
                event.consume();
            }
        }); 
    }
}