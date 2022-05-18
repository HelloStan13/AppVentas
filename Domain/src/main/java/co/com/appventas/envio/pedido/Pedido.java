package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.events.EstadoCreado;
import co.com.appventas.envio.pedido.events.PedidoCreado;
import co.com.appventas.envio.pedido.values.Aislamiento;
import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.appventas.envio.pedido.values.TiempoDeEntrega;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Pedido extends AggregateEvent<PedidoId> {
    protected Estado estadoId;
    protected Repartidor repartidorId;
    protected Aislamiento aislamiento;

    public Pedido(PedidoId pedidoId, Estado estadoId, Repartidor repartidorId, Aislamiento aislamiento) {
        super(pedidoId);
        appendChange(new PedidoCreado(estadoId,repartidorId,aislamiento)).apply();
    }

    public void agregarEstado(PedidoId pedidoId, TiempoDeEntrega tiempoDeEntrega, Entregado entregado){
        Objects.requireNonNull(pedidoId);
        Objects.requireNonNull(tiempoDeEntrega);
        Objects.requireNonNull(entregado);
        appendChange(new EstadoCreado(pedidoId,tiempoDeEntrega,entregado)).apply();
    }

    public void agregarRepartidor(PedidoId pedidoId, DatosPersonales datosPersonales){
        Objects.requireNonNull(pedidoId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new RepartidorCreado(pedidoId,datosPersonales)).apply();
    }
}
