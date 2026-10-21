package pe.utp.despachos;

public class Despacho {
    private final String codigo;
    private final String cliente;
    private final String destino;
    private String estado = "PENDIENTE";

    public Despacho(String codigo, String cliente, String destino) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.destino = destino;
    }

    public String getCodigo() { return codigo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return codigo + " | " + cliente + " | " + destino + " | " + estado;
    }
}
