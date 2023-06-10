
package controllers.home;

import com.mycompany.proyecto.App;
import com.mycompany.proyecto.Contexto;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelos.DatosEvento;
import modelos.Evento;


public class ListaDeEventos implements Initializable {
    
    @FXML
    public TableColumn<Evento,String> columnaEvento;

    @FXML
    public TableColumn<Evento,String> columnaFecha;

    @FXML
    public TableView<Evento> idTablaEventos;
    
    private DatosEvento prueba = new DatosEvento();
    private modelos.Evento temporal = null;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<modelos.Evento> lista = prueba.listaEventos();
        ObservableList<modelos.Evento> listaObservable = FXCollections.observableArrayList(lista);
        idTablaEventos.setItems(listaObservable);
        columnaEvento.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        
        columnaFecha.setCellFactory((TableColumn<modelos.Evento, String> param) -> new TableCell<modelos.Evento, String>(){
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setText(null);
                } else {
                    // Obtener el objeto Usuario de la fila actual
                    modelos.Evento evento1 = getTableView().getItems().get(getIndex());
                    // Llamar al método de tu modelo con el parámetro deseado
                    String texto = evento1.getFecha("dd/MM/yyy");
                    setText(texto);
                }
            }
        });        
        columnaFecha.setStyle("-fx-alignment: CENTER;");
        
        idTablaEventos.setOnMouseClicked(event -> {
    if (event.getClickCount() == 1) { // Asegurarse de que sea un clic único
        temporal = idTablaEventos.getSelectionModel().getSelectedItem(); 
    }
     });
      
    }    
    public void cambiarListaDeEventos() throws IOException{
        App.cambioDeVista("Cliente");
    }
    public void cambiarDetalleEvento() throws IOException{
        Contexto.setVariable(temporal);
        App.cambioDeVista("DetalleEvento");
    }
   
}
