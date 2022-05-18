package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class Contacto extends Entity<ContactoId> {

    private Whatsapp whatsapp;
    private PQR pqr;

    public Contacto(ContactoId entityId, Whatsapp whatsapp, PQR pqr) {
        super(entityId);
        this.whatsapp = whatsapp;
        this.pqr = pqr;
    }
    public Whatsapp Whatsapp() {
        return whatsapp;
    }

    public PQR Pqr() {
        return pqr;
    }

    public void ComunicarViaWhatsapp(Whatsapp whatsapp) {
        this.whatsapp = Objects.requireNonNull(whatsapp);
    }

    public void EnviarPRQ(PQR Pqr) {
        this.pqr = Objects.requireNonNull(pqr);
    }


}
