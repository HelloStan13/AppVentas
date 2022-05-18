package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.events.ClienteCreado;
import co.com.appventas.envio.cliente.events.ContactoCreado;
import co.com.appventas.envio.cliente.events.DevolucionCreada;
import co.com.appventas.envio.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

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
    //comportamiento
    public void AgregarContacto(ContactoId contactoId, Whatsapp whatsapp, PQR pqr){
        Objects.requireNonNull(contactoId);
        Objects.requireNonNull(whatsapp);
        Objects.requireNonNull(pqr);
        appendChange(new ContactoCreado(contactoId, whatsapp, pqr)).apply();
    }
    public void AgregarDevolucion(Fecha fecha, Motivo motivo){
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(motivo);
        appendChange(new DevolucionCreada(fecha, motivo)).apply();

    }


}
