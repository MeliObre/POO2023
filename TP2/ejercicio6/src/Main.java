import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 6");
        ModuloInformes moduloInformes = new ModuloInformes();

        // Agregar clientes, empleados, expendidores, ventas y combustibles
        // Aquí debes agregar datos de prueba para realizar pruebas

        // Generar informes
        List<Cliente> top10Clientes = moduloInformes.obtenerTop10Clientes();
        Map<Combustible, Double> informeVentasPorCombustible = moduloInformes.informeVentasPorCombustible();
        List<Expendidor> surtidoresPorMontoVentas = moduloInformes.obtenerSurtidoresOrdenadosPorMontoVentas();
        List<Expendidor> surtidoresPorLitrosExpendidos = moduloInformes.obtenerSurtidoresOrdenadosPorLitrosExpendidos();
        List<Empleado> empleadosPorMontoVentas = moduloInformes.obtenerEmpleadosOrdenadosPorMontoVentas();

        // Imprimir informes
        System.out.println("Top 10 de clientes según monto total de compras:");
        for (Cliente cliente : top10Clientes) {
            System.out.println(cliente.getNombre() + ": $" + moduloInformes.totalCompras(cliente));
        }

        System.out.println("\nInforme de ventas por tipo de combustible:");
        for (Map.Entry<Combustible, Double> entry : informeVentasPorCombustible.entrySet()) {
            Combustible combustible = entry.getKey();
            double totalVentas = entry.getValue();
            System.out.println(combustible.getNombre() + ": $" + totalVentas);
        }

        System.out.println("\nListado de surtidores ordenados por monto total de ventas:");
        for (Expendidor expendidor : surtidoresPorMontoVentas) {
            System.out.println("Surtidor " + expendidor.getCodigo() + ": $" + expendidor.getMontoVentas());
        }

        System.out.println("\nListado de surtidores ordenados por cantidad de litros expendidos:");
        for (Expendidor expendidor : surtidoresPorLitrosExpendidos) {
            System.out.println("Surtidor " + expendidor.getCodigo() + ": " + expendidor.getLitrosExpendidos() + " litros");
        }

        System.out.println("\nListado de empleados ordenado por monto total de ventas:");
        for (Empleado empleado : empleadosPorMontoVentas) {
            System.out.println(empleado.getNombre() + ": $" + empleado.getMontoVentas());
        }
    }


}