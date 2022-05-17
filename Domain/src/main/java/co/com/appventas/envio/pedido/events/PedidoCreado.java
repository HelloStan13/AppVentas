package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.Estado;
import co.com.appventas.envio.pedido.Repartidor;
import co.com.appventas.envio.pedido.values.Aislamiento;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoCreado extends DomainEvent {
    private final Estado estadoId;
    private final Repartidor repartidorId;
    private final Aislamiento aislamiento;

    public PedidoCreado(Estado estadoId, Repartidor repartidorId, Aislamiento aislamiento) {
        super("co.com.appventas.envio.PedidoCreado");
        this.estadoId = estadoId;
        this.repartidorId = repartidorId;
        this.aislamiento = aislamiento;
    }

    public Estado getEstadoId() {
        return estadoId;
    }

    public Repartidor getRepartidorId() {
        return repartidorId;
    }

    public Aislamiento getAislamiento() {
        return aislamiento;
    }
}
