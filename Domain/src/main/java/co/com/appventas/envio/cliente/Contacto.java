package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.sofka.domain.generic.Entity;


public class Contacto extends Entity<ContactoId> {
    public Contacto(ContactoId entityId) {
        super(entityId);
    }
}
