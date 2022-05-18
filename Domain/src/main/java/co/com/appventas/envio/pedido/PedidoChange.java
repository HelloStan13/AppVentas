package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.events.EstadoCreado;
import co.com.appventas.envio.pedido.events.PedidoCreado;
import co.com.appventas.envio.pedido.events.RepartidorCreado;
import co.com.sofka.domain.generic.EventChange;

public class PedidoChange extends EventChange {
    public PedidoChange(Pedido pedido) {
        apply((PedidoCreado event) -> {
            pedido.aislamiento = event.getAislamiento();
        });

        apply((EstadoCreado event) -> {
            pedido.estado = new Estado(event.getEstadoId(), event.getTiempoDeEntrega(), event.getEntregado());
        });

        apply((RepartidorCreado event)-> {
            pedido.repartidor = new Repartidor(event.getRepartidorId(), event.getDatosPersonales());
        });
    }
}