package com.mycompany.proyecto;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
private static Scene principal;
    @Override
    public void start(Stage stage) {
     principal = new Scene(cargarVista("Menu"),700,500);
     stage.setScene(principal);
     stage.show();
    }
    
    public static void cambioDeVista(String fxml) throws IOException {
        principal.setRoot(cargarVista(fxml));
    }
    
    public static Parent cargarVista(String nombrevista){
        try{
            URL path = App.class.getResource("/views/home/"+nombrevista+".fxml");
            FXMLLoader cargarfxml = new FXMLLoader(path);
           
            return cargarfxml.load();
            
        } catch(Exception ex){
            System.out.println(ex.toString());
           return null; 
        }
    }
            
            
    public static void main(String[] args) {
        
        try{
            launch();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

}