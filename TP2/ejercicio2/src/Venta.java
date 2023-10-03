import java.util.Date;
public class Venta {
    private Cliente cliente;
    private MediodeTransporte paqueteTuristico;
    private Date fechaVenta;

    public Venta(Cliente cliente, MediodeTransporte paqueteTurismo, Date fechaVenta) {
        this.cliente = cliente;
        this.paqueteTuristico=paqueteTurismo;
        this.fechaVenta = fechaVenta;
    }
    public MediodeTransporte getPaqueteTuristico(){
        return paqueteTuristico;
    }
}
