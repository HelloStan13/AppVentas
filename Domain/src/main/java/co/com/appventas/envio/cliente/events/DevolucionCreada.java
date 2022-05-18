package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.Fecha;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.DomainEvent;

public class DevolucionCreada extends DomainEvent {
    public DevolucionCreada(Fecha fecha, Motivo motivo) {
        super("co.com.appventas.envio.DevolucionCreada");
    }
}
