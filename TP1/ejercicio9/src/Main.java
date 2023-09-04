import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 9 \n");
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario seleccionar el formato de fecha
        System.out.println("Seleccione el formato de fecha:");
        System.out.println("1 - dd-MM-yyyy");
        System.out.println("2 - MM-dd-yyyy");
        System.out.print("Ingrese el número de la opción elegida: ");
        int opcion = scanner.nextInt();

        String formatoElegido;
        if (opcion == 1) {
            formatoElegido = "dd-MM-yyyy";
        } else if (opcion == 2) {
            formatoElegido = "MM-dd-yyyy";
        } else {
            System.out.println("Opción no válida. Se utilizará el formato por defecto (dd-MM-yyyy).");
            formatoElegido = "dd-MM-yyyy";
        }

        scanner.nextLine(); // Consumir la línea vacía después de nextInt()

        // Solicitar al usuario ingresar una fecha en formato de cadena
        System.out.print("Ingrese una fecha en el formato seleccionado: ");
        String fechaString = scanner.nextLine();
        LocalDate fecha = Fecha.obtenerFecha(fechaString, formatoElegido);

        System.out.println("Fecha obtenida en el formato seleccionado: " + fecha);

        // Solicitar al usuario ingresar las otras dos fechas
        System.out.print("Ingrese la primera fecha en el formato especificado (" + formatoElegido + "): ");
        String fechaString1 = scanner.nextLine();
        LocalDate fecha1 = Fecha.obtenerFecha(fechaString1, formatoElegido);

        System.out.print("Ingrese la segunda fecha en el formato especificado (" + formatoElegido + "): ");
        String fechaString2 = scanner.nextLine();
        LocalDate fecha2 = Fecha.obtenerFecha(fechaString2, formatoElegido);

        // Comparar las fechas
        if (fecha.isEqual(fecha1) || fecha.isEqual(fecha2)) {
            System.out.println("La fecha ingresada es igual a una de las fechas.");
        } else {
            System.out.println("La fecha ingresada no es igual a ninguna de las fechas.");

            // Comparar la fecha ingresada con las otras dos fechas
            if (fecha.isAfter(fecha1) && fecha.isAfter(fecha2)) {
                System.out.println("La fecha ingresada es mayor que las otras dos fechas.");
            } else if (fecha.isBefore(fecha1) && fecha.isBefore(fecha2)) {
                System.out.println("La fecha ingresada es menor que las otras dos fechas.");
            } else {
                System.out.println("La fecha ingresada se encuentra entre las dos fechas.");
            }
        }

        scanner.close();
    }
 }

