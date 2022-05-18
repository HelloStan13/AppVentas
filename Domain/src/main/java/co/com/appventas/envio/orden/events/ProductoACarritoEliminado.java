package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.appventas.envio.orden.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoACarritoEliminado extends DomainEvent {
    private OrdenId ordenId;
    private CarritoId carritoId;
    private ProductoId productoId;

    public ProductoACarritoEliminado(OrdenId ordenId, CarritoId carritoId, ProductoId productoId) {
        super("co.com.appventas.envio.ProductoACarritoEliminado");
        this.ordenId = ordenId;
        this.carritoId = carritoId;
        this.productoId = productoId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
