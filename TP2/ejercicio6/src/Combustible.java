import java.util.Date;

/*Modificar la clase Combustible para incluir una fecha o un período de validez para los precios.
Cuando un cliente realiza una compra, verifica la fecha o el período de validez del precio del combustible y aplica el precio correcto.*/
public class Combustible {
    private String nombre;
    private double precioVenta;

    public String getNombre() {
        return nombre;
    }
    private Date fechaValidezPrecio; // Fecha o período de validez del precio
}
