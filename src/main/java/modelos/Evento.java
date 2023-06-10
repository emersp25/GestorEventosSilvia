
package modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pablo
 */
public class Evento {
  private int idEvento;
  private String nombre;
  private String sinopsis;
  private String foto;
  private String encargado;
  private  LocalDateTime horaInicio;
  private  LocalDateTime horaFin;
  private LocalDateTime fecha;

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }
    
    public String getHoraInicio (String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); 
        return horaInicio.format(formatter);
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }
    
    public String getHoraFin (String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); 
        return horaFin.format(formatter);
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    
    public String getFecha (String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); 
        return fecha.format(formatter);
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
   
   
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
   
    
}
