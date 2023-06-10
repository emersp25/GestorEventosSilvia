
package modelos;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Emerson
 */
public class DatosEvento {
    
    public ArrayList<Evento> listaEventos(){
        ArrayList<Evento> eventos = new ArrayList<>();
        try (Statement bd = ConexionBD.getConection().createStatement()){
             String Querty = "select * from evento";
             ResultSet resultados = bd.executeQuery(Querty);
             while (resultados.next()) {
                Evento other = new Evento();
                other.setIdEvento(resultados.getInt("id_evento"));
                other.setNombre(resultados.getString("nombre_evento"));
                other.setEncargado(resultados.getString("encargado"));
                other.setFoto(resultados.getString("fotografia"));
                other.setSinopsis(resultados.getString("sinopsis"));
                other.setHoraInicio(resultados.getTimestamp("hora_inicio").toLocalDateTime());
                other.setHoraFin(resultados.getTimestamp("hora_fin").toLocalDateTime());
                other.setFecha(resultados.getTimestamp("fecha").toLocalDateTime());
                
                eventos.add(other);
            }
        } catch (Exception e) {
        }
        
        return eventos;
        
    };
}
