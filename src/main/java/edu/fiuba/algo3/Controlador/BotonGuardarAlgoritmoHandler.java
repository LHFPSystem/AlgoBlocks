package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.BloqueAlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGuardarAlgoritmoHandler implements EventHandler<ActionEvent> {
    private BloqueAlgoritmoPersonalizado algoritmoPersonalizado = new BloqueAlgoritmoPersonalizado();
    private Tablero tablero;

    public BotonGuardarAlgoritmoHandler(Tablero tablero){
        this.tablero = tablero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
