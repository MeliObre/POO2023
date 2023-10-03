import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ModuloInformes {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<>();
    private List<Expendidor> expendidores = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();
    private List<Combustible> combustibles = new ArrayList<>();

    // Métodos para agregar clientes, empleados, expendidores, ventas y combustibles

    public List<Cliente> obtenerTop10Clientes() {
        return clientes.stream()
                .sorted((c1, c2) -> Double.compare(totalCompras(c2), totalCompras(c1)))
                .limit(10)
                .collect(Collectors.toList());
    }

    public Map<Combustible, Double> informeVentasPorCombustible() {
        Map<Combustible, Double> informe = new HashMap<>();
        for (Venta venta : ventas) {
            Combustible combustible = venta.getCombustible();
            double totalVenta = venta.getImporte();
            informe.put(combustible, informe.getOrDefault(combustible, 0.0) + totalVenta);
        }
        return informe;
    }

    public List<Expendidor> obtenerSurtidoresOrdenadosPorMontoVentas() {
        return expendidores.stream()
                .sorted((e1, e2) -> Double.compare(e2.getMontoVentas(), e1.getMontoVentas()))
                .collect(Collectors.toList());
    }

    public List<Expendidor> obtenerSurtidoresOrdenadosPorLitrosExpendidos() {
        return expendidores.stream()
                .sorted((e1, e2) -> Double.compare(e2.getLitrosExpendidos(), e1.getLitrosExpendidos()))
                .collect(Collectors.toList());
    }

    public List<Empleado> obtenerEmpleadosOrdenadosPorMontoVentas() {
        return empleados.stream()
                .sorted((empleado1, empleado2) -> Double.compare(empleado2.getMontoVentas(), empleado1.getMontoVentas()))
                .collect(Collectors.toList());
    }

    public double totalCompras(Cliente cliente) {
        return ventas.stream()
                .filter(venta -> venta.getCliente() == cliente)
                .mapToDouble(Venta::getImporte)
                .sum();
    }
}
