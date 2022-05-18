package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.events.FacturaCreada;
import co.com.appventas.envio.orden.events.OrdenCreada;
import co.com.sofka.domain.generic.EventChange;

public class OrdenChange extends EventChange {
    public OrdenChange(Orden orden) {
        apply((OrdenCreada event)->{
            orden.precio = event.getPrecio();
        });
               

    }
}
