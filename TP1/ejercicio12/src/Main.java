import java.time.LocalDate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 12 \n");
        AdTareas administrador = new AdTareas();

        // Agregar varias tareas
        administrador.agregarTarea(new Tarea("Comprar víveres", "Alta", LocalDate.now().plusDays(3)));
        administrador.agregarTarea(new Tarea("Pagar facturas", "Media", LocalDate.now().plusDays(5)));
        administrador.agregarTarea(new Tarea("Hacer ejercicio", "Baja", LocalDate.now()));
        administrador.agregarTarea(new Tarea("Estudiar Java", "Alta", LocalDate.now().plusDays(2)));

        // Marcar algunas tareas como realizadas
        Tarea tareaCompras = administrador.buscarTareaPorTitulo("Comprar víveres");
        Tarea tareaEjercicio = administrador.buscarTareaPorTitulo("Hacer ejercicio");
        if (tareaCompras != null) {
            tareaCompras.marcarComoRealizada();
        }
        if (tareaEjercicio != null) {
            tareaEjercicio.marcarComoRealizada();
        }

        // Obtener y mostrar las tareas no vencidas ordenadas por prioridad y fecha de vencimiento
        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidas();
        System.out.println("Tareas no vencidas ordenadas:");
        tareasNoVencidas.forEach(System.out::println);
    }
}