
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Evento implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public void cambiarEvento() throws IOException{
        App.cambioDeVista("Administrador");
     }
     
     public void cambiarPrecio() throws IOException{
        App.cambioDeVista("PrecioEntradas");
     }
     public void cambiarEncargado() throws IOException{
        App.cambioDeVista("Encargado");
     }
    
}
