import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 10");
        LocalDate fechaMañana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        LocalDate fechaRecordatorio = LocalDate.now().plusDays(2); // Fecha de recordatorio en dos días

        List<Tarea> ListaTareas = new ArrayList<>();

        Tarea tarea1 = new Tarea("Terminar TP de POO", "Alta", fechaAyer, fechaRecordatorio);
        Tarea tarea2 = new Tarea("Terminar ppt para pasantia", "Media", fechaAyer, fechaRecordatorio);
        Tarea tarea3 = new Tarea("Terminar Sprint ZonaEduca", "Alta", fechaAyer, fechaRecordatorio);
        Tarea tarea4 = new Tarea("Ver último episodio (Invasion secreta)", "Baja", fechaAyer, fechaRecordatorio);

        tarea2.terminada();

        ListaTareas.add(tarea1);
        ListaTareas.add(tarea2);
        ListaTareas.add(tarea3);
        ListaTareas.add(tarea4);

        for (Tarea tarea : ListaTareas) {
            System.out.println(tarea.mostrarTarea());
        }


    }
}