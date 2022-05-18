package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.DatosPersonales;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosPersonalesActualizados extends DomainEvent {
    private DatosPersonales datosPersonales;

    public DatosPersonalesActualizados(DatosPersonales datosPersonales) {
        super("co.com.appventas.envio.DatosPersonalesActualizados");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
