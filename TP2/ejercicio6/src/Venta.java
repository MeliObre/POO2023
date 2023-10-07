import java.util.Date;
/*Venta de Otros Productos:
Crear nuevas clases para representar otros productos que la estación de servicio podría vender, como Producto o Servicio.
Modificar la clase Venta para manejar la venta de combustibles y otros productos o servicios.
Actualizar los informes y cálculos según los nuevos tipos de ventas.*/
public class Venta {
    private Date fecha;
    private double importe;
    private Cliente cliente;
    private Combustible combustible;
    private Empleado empleado;

    public Cliente getCliente() {

        return cliente;
    }

    public double getImporte() {

        return importe;
    }

    public Combustible getCombustible() {

        return combustible;
    }
}
