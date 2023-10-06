import java.util.ArrayList;
import java.util.List;

public class SistemaAlquiler {
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Alquiler> alquileres;

    public SistemaAlquiler() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Presupuesto emitirPresupuesto(Vehiculo vehiculo, int diasAlquiler, Cliente cliente) {
        return new Presupuesto(vehiculo, diasAlquiler, cliente);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void generarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
        Cliente cliente = alquiler.presupuesto.getCliente();
        cliente.registrarAlquiler(alquiler);
    }

    public double calcularMontoTotalAlquileresCliente(Cliente cliente) {
        return cliente.calcularMontoTotalAlquileres();
    }

    public double calcularMontoTotalAlquileres() {
        double montoTotal = 0.0;
        for (Alquiler alquiler : alquileres) {
            montoTotal += alquiler.calcularSaldoPagar();
        }
        return montoTotal;
    }
}
