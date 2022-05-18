package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

public class DatosPersonales implements ValueObject<DatosPersonales.Props> {
    private final String NombreCompleto;
    private final String Telefono;
    private final String Correo;

    public DatosPersonales(String nombreCompleto, String telefono, String correo) {
        NombreCompleto = nombreCompleto;
        Telefono = telefono;
        Correo = correo;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String NombreCompleto() {
                return NombreCompleto;
            }

            @Override
            public String Telefono() {
                return Telefono;
            }

            @Override
            public String Correo() {
                return Correo;
            }
        };
    }

    public interface Props{
        String NombreCompleto();
        String Telefono();
        String Correo();
    }
}
