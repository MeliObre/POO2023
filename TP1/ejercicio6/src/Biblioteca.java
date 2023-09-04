import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro> Libros;
    public Biblioteca(){
        Libros=new ArrayList<>();
    }
    public  void agregarLibro(Libro libro) {
        Libros.add(libro);
    }
    public void mostrarLibros(){
        for (Libro libro:Libros){
            System.out.print(libro);
        }
    }
    public int cantidadPrestados(){
        int totalPrestados=0;
        for (Libro libro:Libros){
            totalPrestados+=libro.getEjemPrestados();
        }
        return totalPrestados;
    }
}
