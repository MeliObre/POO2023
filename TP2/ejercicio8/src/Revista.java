public class Revista extends Publicacion{
    private String issn;
    private int numero;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Revista(String nombre, String editor, String telefonoProveedor, int anioPublicacion, String issn, int numero, int ejemplares) {
        super(nombre, editor, telefonoProveedor, anioPublicacion);
        this.issn = issn;
        this.numero = numero;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    // Getters y setters para atributos específicos de revistas

    public String getIssn() {
        return issn;
    }

    public int getNumero() {
        return numero;
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
        return super.toString() + ", ISSN: " + issn + ", Número: " + numero + ", Ejemplares Prestados: " + ejemplaresPrestados;
    }

}
