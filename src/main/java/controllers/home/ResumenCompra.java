
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class ResumenCompra implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void regresarPagar() throws IOException{
        App.cambioDeVista("Pagar");
    }
    public void cambiarTicket() throws IOException{
        App.cambioDeVista("Ticket");
    }
}
