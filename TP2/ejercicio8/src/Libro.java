public class Libro extends Publicacion{
    private String isbn;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro(String nombre, String editor, String telefonoProveedor, int anioPublicacion, String isbn, int ejemplares) {
        super(nombre, editor, telefonoProveedor, anioPublicacion);
        this.isbn = isbn;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    // Getters y setters para atributos específicos de libros

    public String getIsbn() {
        return isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void prestarEjemplar() {
        if (ejemplaresPrestados < ejemplares) {
            ejemplaresPrestados++;
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    public void devolverEjemplar() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + isbn + ", Ejemplares Prestados: " + ejemplaresPrestados;
    }
}
