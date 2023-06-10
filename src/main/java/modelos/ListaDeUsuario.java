package modelos;

public class ListaDeUsuario {
    private int ListaUsuario;
    private int numeroDeCuenta;
    private String roll;
    private boolean estado;

    public int getListaUsuario() {
        return ListaUsuario;
    }

    public void setListaUsuario(int ListaUsuario) {
        this.ListaUsuario = ListaUsuario;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
