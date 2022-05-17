package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.Aislamiento;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Pedido extends AggregateEvent<PedidoId> {
    protected Estado estadoId;
    protected Repartidor repartidorId;
    protected Aislamiento aislamiento;


    public Pedido(PedidoId entityId) {
        super(entityId);
    }
}
