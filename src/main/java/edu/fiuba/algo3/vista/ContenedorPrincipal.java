package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.layout.BorderPane;
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

        this.setLeft(this.vistaSectorBloques.getVista());
    }

    private void setVistaSectorAlgoritmo(){

        this.setCenter(this.vistaSectorAlgoritmo.getVista());
    }

    private void setVistaSectorDibujo(){

        this.setRight(this.vistaSectorDibujo.getVista());
    }

}
