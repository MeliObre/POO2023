// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 2! \n");
        Scanner scanner = new Scanner(System.in);

        List<PaqueteTuristico> paquetes = new ArrayList<>();
        // Agregar paquetes a la lista.

        List<Venta> ventas = new ArrayList<>();

        int opcion;
        do {
            System.out.println("¡Bienvenido a SunBeach!");
            System.out.println("1. Ver paquetes disponibles");
            System.out.println("2. Comprar paquete de turismo");
            System.out.println("3. Informe de ventas por destino");
            System.out.println("4. Destino favorito de los clientes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarPaquetes(paquetes);
                    break;
                case 2:
                    comprarPaquete(paquetes, scanner, ventas);
                    break;
                case 3:
                    generarInformeVentasPorDestino(ventas);
                    break;
                case 4:
                    encontrarDestinoFavorito(ventas);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar SunBeach!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarPaquetes(List<PaqueteTuristico> paquetes) {
        System.out.println("Paquetes disponibles:");
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println((i + 1) + ". " + paquetes.get(i).getDestino().getNombre());
        }
    }

    private static void comprarPaquete(List<PaqueteTuristico> paquetes, Scanner scanner, List<Venta> ventas) {
        mostrarPaquetes(paquetes);
        System.out.print("Seleccione un paquete para comprar (ingrese el número): ");
        int seleccion = scanner.nextInt();
        if (seleccion > 0 && seleccion <= paquetes.size()) {
            Cliente cliente = crearCliente(scanner); // Crear el cliente
            PaqueteTuristico paqueteSeleccionado = paquetes.get(seleccion - 1);

            // Aquí deberías implementar la lógica de compra y crear un objeto Venta.
            Venta venta = new Venta(cliente, paqueteSeleccionado, new Date());
            ventas.add(venta);

            System.out.println("¡Compra realizada con éxito!");
        } else {
            System.out.println("Número de paquete no válido.");
        }
    }

    private static Cliente crearCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        String email = scanner.next();

        return new Cliente(nombre, email);
    }

    private static void generarInformeVentasPorDestino(List<Venta> ventas) {
        // Implementar la lógica para generar el informe de ventas por destino.
        Map<Destino, List<Venta>> ventasPorDestino = new HashMap<>();

        // Agrupar ventas por destino
        for (Venta venta : ventas) {
            Destino destino = venta.getPaqueteTuristico().getDestino();
            if (!ventasPorDestino.containsKey(destino)) {
                ventasPorDestino.put(destino, new ArrayList<>());
            }
            ventasPorDestino.get(destino).add(venta);
        }

        // Mostrar el informe
        System.out.println("Informe de ventas por destino:");
        for (Map.Entry<Destino, List<Venta>> entry : ventasPorDestino.entrySet()) {
            Destino destino = entry.getKey();
            List<Venta> ventasDestino = entry.getValue();

            System.out.println("Destino: " + destino.getNombre());
            System.out.println("Ventas realizadas: " + ventasDestino.size());
            System.out.println("-----------------------");
        }
    }

    private static void encontrarDestinoFavorito(List<Venta> ventas) {
        // Implementar la lógica para encontrar el destino favorito de los clientes.
        Map<Destino, Integer> contadorDestinos = new HashMap<>();

        for (Venta venta : ventas) {
            Destino destino = venta.getPaqueteTurismo().getDestino();
            contadorDestinos.put(destino, contadorDestinos.getOrDefault(destino, 0) + 1);
        }

        // Encontrar el destino favorito
        Destino destinoFavorito = Collections.max(contadorDestinos.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("El destino favorito de los clientes es: " + destinoFavorito.getNombre());
    }

    }
}