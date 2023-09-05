import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 13 \n");
        AdTarea administrador = new AdTarea();
        Colaborador colaborador1 = new Colaborador("Juan");
        Colaborador colaborador2 = new Colaborador("Maria");

        // Agregar varias tareas
        administrador.agregarTarea(new Tarea("Comprar víveres", "Alta", LocalDate.now().plusDays(3)));
        administrador.agregarTarea(new Tarea("Pagar facturas", "Media", LocalDate.now().plusDays(5)));
        administrador.agregarTarea(new Tarea("Hacer ejercicio", "Baja", LocalDate.now()));
        administrador.agregarTarea(new Tarea("Estudiar Java", "Alta", LocalDate.now().plusDays(2)));

        // Marcar algunas tareas como realizadas por colaboradores
        Tarea tareaCompras = administrador.buscarTareaPorTitulo("Comprar víveres");
        Tarea tareaEjercicio = administrador.buscarTareaPorTitulo("Hacer ejercicio");
        if (tareaCompras != null) {
            tareaCompras.marcarComoRealizada(colaborador1);
        }
        if (tareaEjercicio != null) {
            tareaEjercicio.marcarComoRealizada(colaborador2);
        }

        // Obtener y mostrar las tareas no vencidas ordenadas
        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidas();
        System.out.println("Tareas no vencidas ordenadas:");
        tareasNoVencidas.forEach(System.out::println);

        // Obtener y mostrar las tareas realizadas por un colaborador
        List<Tarea> tareasRealizadasPorJuan = administrador.obtenerTareasRealizadasPorColaborador(colaborador1);
        System.out.println("Tareas realizadas por Juan:");
        tareasRealizadasPorJuan.forEach(System.out::println);
    }
}