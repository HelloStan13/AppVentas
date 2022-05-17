package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.sofka.domain.generic.Entity;

public class Estado extends Entity<EstadoId> {
    public Estado(EstadoId entityId) {
        super(entityId);
    }
}
