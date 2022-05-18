package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.events.CarritoCreado;
import co.com.appventas.envio.orden.values.CarritoId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Carrito extends AggregateEvent<CarritoId> {
    protected Set<Producto> productos;
    public Carrito(CarritoId carritoId) {
        super(carritoId);
        appendChange(new CarritoCreado()).apply();

    }

}
