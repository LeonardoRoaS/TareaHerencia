public class Habitacion {
    private int numero;
    private String estado, tipo;

    public Habitacion(int numero,String estado, String tipo) {
        this.numero = numero;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Número: "+ this.numero + ", estado: " + this.estado + ", tipo: " + this.tipo;
    }
}
