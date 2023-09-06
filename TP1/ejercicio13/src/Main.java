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
        Colaborador colaborador1 = new Colaborador("Meli");
        Colaborador colaborador2 = new Colaborador("Ailen");

        // Agregar varias tareas
        administrador.agregarTarea(new Tarea("Terminar TP de POO", "Alta", LocalDate.now().plusDays(3)));
        administrador.agregarTarea(new Tarea("Terminar Scrip de ZonaEduca", "Media", LocalDate.now().plusDays(5)));
        administrador.agregarTarea(new Tarea("Hacer la interfaz para el paquete (Pasantia)", "Baja", LocalDate.now()));
        administrador.agregarTarea(new Tarea("Acomodar Trello", "Alta", LocalDate.now().plusDays(2)));

        // Marcar algunas tareas como realizadas por colaboradores
        Tarea tpPOO = administrador.buscarTareaPorTitulo("Terminar TP de POO");
        Tarea intPasantia = administrador.buscarTareaPorTitulo("Hacer la interfaz para el paquete (Pasantia)");
        if (tpPOO != null) {
            tpPOO.marcarComoRealizada(colaborador1);
        }
        if (intPasantia != null) {
            intPasantia.marcarComoRealizada(colaborador2);
        }

        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidas();
        System.out.println("Tareas no vencidas ordenadas:");
        tareasNoVencidas.forEach(System.out::println);

        // Obtener y mostrar las tareas realizadas por un colaborador
        List<Tarea> tareasRealizadasPorMeli = administrador.obtenerTareasRealizadasPorColaborador(colaborador1);
        System.out.println("Tareas realizadas por Meli:");
        tareasRealizadasPorMeli.forEach(System.out::println);

        List<Tarea> tareasRealizadasPorAilen = administrador.obtenerTareasRealizadasPorColaborador(colaborador2);
        System.out.println("Tareas realizadas por Ailen:");
        tareasRealizadasPorAilen.forEach(System.out::println);
    }
}