import java.util.List;
public class PaqueteTuristico {
    private Destino destino;
    private MediodeTransporte medioDeTransporte;
    private Hospedaje hospedaje;
    private List<Excursion> excursiones;

    public PaqueteTuristico(Destino destino, MediodeTransporte medioDeTransporte, Hospedaje hospedaje, List<Excursion> excursiones) {
        this.destino = destino;
        this.medioDeTransporte=medioDeTransporte;
        this.hospedaje = hospedaje;
        this.excursiones = excursiones;
    }

    // Método para calcular el precio total del paquete
    public double calcularPrecioTotal() {
        double precioTotal = medioDeTransporte.getPrecio() + hospedaje.getPrecio();
        for (Excursion excursion : excursiones) {
            precioTotal += excursion.getCosto();
        }
        return precioTotal;
    }

    // Getters y setters
}
