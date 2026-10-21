package pe.utp.despachos;

public class App {
    public static void main(String[] args) {
        System.out.println("Sistema de Despachos v0.1");
        Despacho d = new Despacho("DSP-001", "Distribuidora Andina SAC", "Ate, Lima");
        System.out.println(d);
    }
}
