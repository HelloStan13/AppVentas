package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.RepartidorId;
import co.com.sofka.domain.generic.Entity;

public class Repartidor extends Entity<RepartidorId> {
    public Repartidor(RepartidorId entityId) {
        super(entityId);
    }
}
