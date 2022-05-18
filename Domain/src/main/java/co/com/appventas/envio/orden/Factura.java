package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.values.Direccion;
import co.com.appventas.envio.orden.values.FacturaId;
import co.com.appventas.envio.orden.values.FechaFactura;
import co.com.appventas.envio.orden.values.NombreCliente;
import co.com.sofka.domain.generic.Entity;

public class Factura extends Entity<FacturaId> {
     protected NombreCliente nombreCliente;
     protected FechaFactura fechaFactura;
     protected Direccion direccion;

     public Factura(FacturaId facturaId, NombreCliente nombreCliente, FechaFactura fechaFactura, Direccion direccion) {
        super(facturaId);
        this.nombreCliente = nombreCliente;
        this.fechaFactura= fechaFactura;
        this.direccion= direccion;

    }

}
