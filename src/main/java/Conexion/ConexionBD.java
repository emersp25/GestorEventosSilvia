
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private static String url = "jdbc:postgresql://postgresumg.postgres.database.azure.com:5432/proyecto_final";
    private static String user = "adminpostgres" ;
    private static String password = "Santi00**";
    
    
    public static Connection getConection(){
       try{
           Connection connection = DriverManager.getConnection(url, user, password);            
           return connection;
       }
       catch (SQLException e) {
           System.out.println(e.toString());
           return null;
       }
    }
    
}
