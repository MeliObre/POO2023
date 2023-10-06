import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String numeroCliente;
    private List<Alquiler> alquileres;

    public Cliente(String nombre, String numeroCliente) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.alquileres = new ArrayList<>();
    }

    public void registrarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public double calcularMontoTotalAlquileres() {
        double montoTotal = 0.0;
        for (Alquiler alquiler : alquileres) {
            montoTotal += alquiler.calcularSaldoPagar();
        }
        return montoTotal;
    }
}
