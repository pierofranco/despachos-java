package pe.utp.despachos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DespachoTest {

    @Test
    void estadoInicialEsPendiente() {
        Despacho despacho = new Despacho(
            "DSP-001", "Distribuidora Andina SAC", "Ate, Lima"
        );

        assertEquals("PENDIENTE", despacho.getEstado());
    }

    @Test
    void permiteEstadoEnRuta() {
        Despacho despacho = new Despacho(
            "DSP-002", "Empresa ABC", "Lima"
        );

        despacho.setEstado("EN_RUTA");

        assertEquals("EN_RUTA", despacho.getEstado());
    }

    @Test
    void permiteEstadoEntregado() {
        Despacho despacho = new Despacho(
            "DSP-003", "Empresa XYZ", "Callao"
        );

        despacho.setEstado("ENTREGADO");

        assertEquals("ENTREGADO", despacho.getEstado());
    }

    @Test
    void rechazaEstadoInvalido() {
        Despacho despacho = new Despacho(
            "DSP-004", "Empresa ABC", "Lima"
        );

        assertThrows(
            IllegalArgumentException.class,
            () -> despacho.setEstado("CANCELADO")
        );
    }
}