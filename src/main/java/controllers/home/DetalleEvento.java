
package controllers.home;

import com.mycompany.proyecto.App;
import com.mycompany.proyecto.Contexto;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import modelos.Evento;

public class DetalleEvento implements Initializable {
    
    @FXML
    public Label idFecha;

    @FXML
    public Label idFin;

    @FXML
    public Label idInicio;

    @FXML
    public Label idNombre;

    @FXML
    public Label idSinopsis;
    
    @FXML
    public ComboBox<Integer> idcombox;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        Evento evento = Contexto.getVariable();
        idNombre.setText(evento.getNombre());
        idSinopsis.setText(evento.getSinopsis());
        idInicio.setText(evento.getHoraInicio("HH:ss"));
        idFin.setText(evento.getHoraFin("HH:ss"));
        idFecha.setText(evento.getFecha("dd/MM/yyyy"));
        
        for (int i = 0; i <= 10; i++) {
            idcombox.getItems().add(i);
        }        
        idcombox.setValue(0);
        
    }    
    
    public void cambiarListaEvento() throws IOException{
        App.cambioDeVista("ListaDeEventos");
    } 
    
    public void cambiarCompraBoleto() throws IOException{
        App.cambioDeVista("CompraBoletos");
    }  
    
    
}
