package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.TiempoDeEntrega;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCreado extends DomainEvent {
    public EstadoCreado(PedidoId pedidoId, TiempoDeEntrega tiempoDeEntrega, Entregado entregado) {
        super("co.com.appventas.envio.EstadoCreado");
    }
}
