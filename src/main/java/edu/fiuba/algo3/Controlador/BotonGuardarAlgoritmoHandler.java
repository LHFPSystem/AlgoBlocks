package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueAlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class BotonGuardarAlgoritmoHandler implements EventHandler<ActionEvent> {
    private BloqueAlgoritmoPersonalizado algoritmoPersonalizado = new BloqueAlgoritmoPersonalizado();
    private Tablero tablero;
    private VBox sector;

    public BotonGuardarAlgoritmoHandler(Tablero tablero, VBox sector){
        this.tablero = tablero;
        this.sector = sector;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(this.tablero.getCantidadBloques() == 0){
            throw new RuntimeException("No hay bloques para guardar.");
        }
        algoritmoPersonalizado.agregarListaBloques(tablero.getBloques());

        TextInputDialog texto = new TextInputDialog();
        texto.setTitle("Algoritmo Personalizado");
        texto.setHeaderText("Establecer al Algoritmo");
        texto.setContentText("Ingrese el nombre: ");

        Optional<String> nombreAlgoritmo = texto.showAndWait();

        Button botonAlgoritmoPersonalizado = new Button();
        botonAlgoritmoPersonalizado.setText(nombreAlgoritmo.get());
        sector.getChildren().add(botonAlgoritmoPersonalizado);
        BotonAlgoritmoPersonalizadoHandler botonAlgoritmoPersonalizadoHandler = new BotonAlgoritmoPersonalizadoHandler(tablero,sector);
        botonAlgoritmoPersonalizado.setOnAction(botonAlgoritmoPersonalizadoHandler);

    }
}
