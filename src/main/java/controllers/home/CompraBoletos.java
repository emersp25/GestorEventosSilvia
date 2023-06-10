
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class CompraBoletos implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     public void cambiarDetalleEvento() throws IOException{
        App.cambioDeVista("DetalleEvento");
    }
     
     public void cambiarDatosCliente() throws IOException{
        App.cambioDeVista("DatosCliente");
    }
     
}
