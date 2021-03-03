package edu.fiuba.algo3.Controlador;


import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonLimpiarAlgoritmoHandler implements EventHandler<ActionEvent> {
    private Tablero tablero;
    private VBox sectorAlgoritmo;

    public BotonLimpiarAlgoritmoHandler(Tablero tablero, VBox sectorAlgoritmo){
        this.tablero = tablero;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        this.tablero.limpiarListaBloques();
        this.sectorAlgoritmo.getChildren().removeAll();
        this.sectorAlgoritmo.getChildren().clear();
        Label nombreVista = new Label("Algoritmo");
        this.sectorAlgoritmo.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        this.sectorAlgoritmo.getChildren().add(nombreVista);

    }
}
