package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueAlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonAlgoritmoPersonalizadoHandler implements EventHandler<ActionEvent> {
    private BloqueAlgoritmoPersonalizado algoritmoPersonalizado;
    private Tablero tablero;
    private VBox sector;
    private String nombre;

    public BotonAlgoritmoPersonalizadoHandler(Tablero tablero, VBox sectorBloque, String nombre, BloqueAlgoritmoPersonalizado bloque){
        this.tablero = tablero;
        this.sector = sectorBloque;
        this.nombre = nombre;
        this.algoritmoPersonalizado = bloque;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.setBloque(algoritmoPersonalizado);
        Label nombreVista = new Label(nombre);
        sector.setMargin(nombreVista, new Insets(10, 10, 10, 10));
        sector.getChildren().add(nombreVista);
    }
}