package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

    VistaSectorBloques vistaSectorBloques = new VistaSectorBloques();


    public ContenedorPrincipal(Stage stage, Tablero tablero) {

        this.setVistaSectorBloques(stage);

    }


    private void setVistaSectorBloques(Stage stage){

        this.setLeft(this.vistaSectorBloques.getVista());

    }

}
