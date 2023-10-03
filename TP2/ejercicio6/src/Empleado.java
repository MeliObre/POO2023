/* Modificar la clase Empleado para incluir un atributo que rastree si el empleado
está en el "top 10" de ventas del mes anterior.
Crear un método para aplicar un descuento del 10% a un cliente, según las condiciones especificadas.*/
public class Empleado {
    private String apellido;
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private double montoVentas;

    public double getMontoVentas() {
        return montoVentas;
    }

    public String getNombre() {
       return nombre;
    }
    private boolean enTop10VentasMesAnterior;

    public boolean isEnTop10VentasMesAnterior() {
        return enTop10VentasMesAnterior;
    }

    public void setEnTop10VentasMesAnterior(boolean enTop10VentasMesAnterior) {
        this.enTop10VentasMesAnterior = enTop10VentasMesAnterior;
    }

    public void aplicarDescuentoCliente(Cliente cliente) {
        if (enTop10VentasMesAnterior) {
            cliente.setDescuento(0.10); // Descuento del 10% para el cliente seleccionado
        }
    }
}
