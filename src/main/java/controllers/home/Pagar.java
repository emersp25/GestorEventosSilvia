
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class Pagar implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void regresarDatosCliente() throws IOException{
        App.cambioDeVista("DatosCliente");
    }
    public void cambiarResumenCompra() throws IOException{
        App.cambioDeVista("ResumenCompra");
    }
}
