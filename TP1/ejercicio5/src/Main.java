import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 5\n");
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Alta", fechaManana);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Baja", fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", "Media", fechaAyer);

        tarea2.terminarTarea();

        // Mostrar información de las tareas
        System.out.println("Información de las tareas:");
        System.out.println("Tarea 1: " + tarea1.mostrarTarea() + " - Vencida: " + tarea1.estaVencida());
        System.out.println("Tarea 2: " + tarea2.mostrarTarea() + " - Vencida: " + tarea2.estaVencida());
        System.out.println("Tarea 3: " + tarea3.mostrarTarea() + " - Vencida: " + tarea3.estaVencida());
    }

}