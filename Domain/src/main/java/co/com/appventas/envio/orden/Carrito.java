package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.sofka.domain.generic.Entity;

public class Carrito extends Entity<CarritoId> {
    public Carrito(CarritoId carritoId) {
        super(carritoId);
    }

}
