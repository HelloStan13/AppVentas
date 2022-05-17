package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.sofka.domain.generic.Entity;

public class Devolucion extends Entity<DevolucionId> {
    public Devolucion(DevolucionId entityId) {
        super(entityId);
    }
}
