import java.time.LocalDate;
import  java.time.format.DateTimeFormatter;
public class Fecha {
    private static final DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public static LocalDate obtenerFecha(String fechaString, String formato) {
        // Validar y formatear la entrada de fecha si no contiene guiones o separadores
        if (!fechaString.contains("-") && !fechaString.contains("/")) {
            if (fechaString.length() == 8) {
                // Se asume que la fecha ingresada sin guiones es "ddMMyyyy"
                fechaString = fechaString.substring(0, 2) + "-" + fechaString.substring(2, 4) + "-" + fechaString.substring(4);
            } else {
                throw new IllegalArgumentException("Formato de fecha no válido");
            }
        }

        DateTimeFormatter formatoFecha;
        if (formato.equals("dd-MM-yyyy")) {
            formatoFecha = formato1;
        } else if (formato.equals("MM-dd-yyyy")) {
            formatoFecha = formato2;
        } else {
            throw new IllegalArgumentException("Formato de fecha no válido");
        }

        return LocalDate.parse(fechaString, formatoFecha);
    }

    public static boolean fechaEstaEntre(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin);
    }

    public static boolean fechaEsMayorQue(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    public static boolean fechaEsMenorQue(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isBefore(fecha2);
    }
}
