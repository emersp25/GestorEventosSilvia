
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Cliente implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void cambiarVista() throws IOException{
        App.cambioDeVista("Menu");
    }
    public void cambiarListaDeEventos() throws IOException{
        App.cambioDeVista("ListaDeEventos");
    }
    public void cambiarCrearUsuario() throws IOException{
        App.cambioDeVista("CrearUsuario");
    }
    public void cambiarIniciarSesion () throws IOException{
        App.cambioDeVista("Sesion");
    }
}
