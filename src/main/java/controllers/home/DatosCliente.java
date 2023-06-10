
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class DatosCliente implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void cambiarCompraBoletos() throws IOException{
        App.cambioDeVista("CompraBoletos");
    }
    
    public void cambiarIniciarSesion() throws IOException{
        App.cambioDeVista("Sesion");
    }
    
    public void cambiarContinuar() throws IOException{
        App.cambioDeVista("Pagar");
    }
    
}
