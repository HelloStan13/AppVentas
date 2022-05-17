package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.values.Bono;
import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Cliente  extends AggregateEvent<ClienteId> {
    protected DatosPersonalesCliente datosPersonales;
    protected Bono bono;
    protected Set<Devolucion> devolucion;
    protected Set<Contacto> contacto;

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

}
