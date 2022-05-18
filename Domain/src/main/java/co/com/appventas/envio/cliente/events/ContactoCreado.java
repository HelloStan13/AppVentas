package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.PQR;
import co.com.appventas.envio.cliente.values.Whatsapp;
import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ContactoCreado extends DomainEvent {
    public ContactoCreado(ContactoId contactoId, Whatsapp whatsapp, PQR pqr) {
        super("co.com.appventas.envio.ContactoCreado");
    }
}
