package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.events.ClienteCreado;
import co.com.appventas.envio.cliente.values.Bono;
import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Cliente  extends AggregateEvent<ClienteId> {
    protected DatosPersonalesCliente datosPersonales;
    protected Bono bono;


    public Cliente(ClienteId entityId) {
        super(entityId);
    }

    public Cliente(ClienteId entityId, DatosPersonalesCliente datosPersonales, Bono bono) {
        super(entityId);
        appendChange(new ClienteCreado(datosPersonales, bono)).apply();
    }
}
