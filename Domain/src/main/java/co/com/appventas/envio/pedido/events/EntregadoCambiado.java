package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.sofka.domain.generic.DomainEvent;

public class EntregadoCambiado extends DomainEvent {
    private Entregado entregado;

    public EntregadoCambiado(Entregado entregado) {
        super("co.com.appventas.envio.EntregadoCambiado");
        this.entregado = entregado;
    }

    public Entregado getEntregado() {
        return entregado;
    }
}
