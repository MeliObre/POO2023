import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 8 \n");

            // Crear algunas publicaciones
            Libro libro1 = new Libro("Java desde cero", "Editor A", "123-456-7890", 2019, "12345", 5);
            Revista revista1 = new Revista("Magazine", "Editor B", "987-654-3210", 2023, "67890", 3, 10);
            Tesis tesis1 = new Tesis("Ciberseguridad", "Editor C", "555-123-4567", 2021, "Jorge Lopez", "Junio");
            Diario diario1 = new Diario("Daily News", "Editor D", "444-789-1234", 2023, "2023-10-08");

            // Creo una lista de publicaciones
            List<Publicacion> publicaciones = new ArrayList<>();
            publicaciones.add(libro1);
            publicaciones.add(revista1);
            publicaciones.add(tesis1);
            publicaciones.add(diario1);

            // préstamos
            libro1.prestarEjemplar();
            libro1.prestarEjemplar();
            revista1.prestarEjemplar();
            tesis1.prestarEjemplar();
            diario1.prestarEjemplar();


            System.out.println("Información después de los préstamos:");
            for (Publicacion publicacion : publicaciones) {
                System.out.println(publicacion);
            }

            libro1.devolverEjemplar();
            revista1.devolverEjemplar();
            tesis1.devolverEjemplar();

            // Mostrar información actualizada después de devoluciones
            System.out.println("\nInformación después de las devoluciones:");
            for (Publicacion publicacion : publicaciones) {
                System.out.println(publicacion);
            }
        }
}