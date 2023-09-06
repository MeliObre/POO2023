// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 6 \n");

        Libro libro1= new Libro( "Cien años de soledad ", " Gabriel Garcia Marquez ", 500,5);
        Libro libro2= new Libro(" El verano en que me enamore ", " Jenny Han", 195, 3);
        Libro libro3= new Libro(" No hay verano sin ti ", " Jenny Han", 230, 4);
        Libro libro4= new Libro(" Siempre nos quedara el verano  ", " Jenny Han", 200, 1);

        Biblioteca biblioteca=new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        System.out.print(" Informacion de los libros en la biblioteca \n");
        biblioteca.mostrarLibros();

        libro1.prestar();
        libro2.prestar();
        libro4.prestar();// Intentando prestar un libro con un ejemplar;

        libro1.devolver();
        libro1.prestar();
        libro1.prestar();

        System.out.print(" Cantidad de libros prestados: "+ biblioteca.cantidadPrestados()+" \n ");
        System.out.print(" prestados de "+libro1.getTitulo()+" "+ libro1.getEjemPrestados());

    }
}