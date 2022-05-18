package co.com.appventas.envio.orden;

import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.orden.events.OrdenCreada;
import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.FacturaId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.appventas.envio.orden.values.Precio;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Orden extends AggregateEvent<OrdenId> {
    protected PedidoId pedidoId;
    protected ClienteId clienteId;
    protected CarritoId carritoId;
    protected FacturaId facturaId;
    protected Precio precio;

    public Orden(OrdenId ordenId, Precio precio) {
        super(ordenId);
        appendChange(new OrdenCreada(precio)).apply();
    }


}
