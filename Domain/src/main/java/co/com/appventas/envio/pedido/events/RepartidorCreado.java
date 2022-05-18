package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepartidorCreado extends DomainEvent {
    public RepartidorCreado(PedidoId pedidoId, DatosPersonales datosPersonales) {
        super("co.com.appventas.envio.RepartidorCreado");
    }
}
