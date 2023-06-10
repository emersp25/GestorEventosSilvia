package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class Administrador implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }  
    
        public void cambiarAdministrador() throws IOException{
        App.cambioDeVista("Menu");
    }
         public void cambiarEvento() throws IOException{
        App.cambioDeVista("Evento");
         }
    public void cambiarListaBoletos() throws IOException{
        App.cambioDeVista("ListaDeBoletos");
    }
    public void cambiarListaUsuario() throws IOException{
        App.cambioDeVista("ListaDeUsuario");
    }
    public void cambiarConsultaDeBoleto() throws IOException{
        App.cambioDeVista("ConsultaDeBoleto");
    }
    public void cambiarCarga() throws IOException{
        App.cambioDeVista("CargarEvento");
    }
   public void cambiarListadoEvento() throws IOException{
        App.cambioDeVista("ListadoEventos");
    }
}
