package modelos;

public class ListaDeBoletos {
  private int  idListaBoletos;
  private int idAdministrador;
  private int boletosVendidos;
  private int boletosDisponibles;
  private int boletosVendidosPorSeccion;
  private int boletosDisponiblesPorSeccion;

    public int getIdListaBoletos() {
        return idListaBoletos;
    }

    public void setIdListaBoletos(int idListaBoletos) {
        this.idListaBoletos = idListaBoletos;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public void setBoletosVendidos(int boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }

    public int getBoletosVendidosPorSeccion() {
        return boletosVendidosPorSeccion;
    }

    public void setBoletosVendidosPorSeccion(int boletosVendidosPorSeccion) {
        this.boletosVendidosPorSeccion = boletosVendidosPorSeccion;
    }

    public int getBoletosDisponiblesPorSeccion() {
        return boletosDisponiblesPorSeccion;
    }

    public void setBoletosDisponiblesPorSeccion(int boletosDisponiblesPorSeccion) {
        this.boletosDisponiblesPorSeccion = boletosDisponiblesPorSeccion;
    }
  
  
}
