import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 5\n");

        LocalDate fechaMañana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        List<Tarea> ListaTareas = new ArrayList<>();

        Tarea tarea1= new Tarea(" Terminar TP de POO", " Alta", fechaAyer );
        Tarea tarea2= new Tarea(" Terminar ppt para pasantia", " Media", fechaAyer);
        Tarea tarea3= new Tarea(" Terminar Sprint ZonaEduca", " Alta", fechaAyer);
        Tarea tarea4= new Tarea(" Ver ultimo episodio (Invasion secreta)", " Baja", fechaAyer);



        tarea2.terminada();

        ListaTareas.add(tarea1);
        ListaTareas.add(tarea2);
        ListaTareas.add(tarea3);
        ListaTareas.add(tarea4);

        for (Tarea tarea:ListaTareas){
            System.out.print(tarea.mostrarTarea());
        }


    }
}