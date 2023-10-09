public class Publicacion {
    private String nombre;
    private String editor;
    private String telefonoProveedor;
    private int anioPublicacion;

    public Publicacion(String nombre, String editor, String telefonoProveedor, int anioPublicacion) {
        this.nombre = nombre;
        this.editor = editor;
        this.telefonoProveedor = telefonoProveedor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y setters para los atributos comunes

    public String getNombre() {
        return nombre;
    }

    public String getEditor() {
        return editor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Editor: " + editor + ", Año de Publicación: " + anioPublicacion;
    }

    public void devolverEjemplar() {

    }
    public void prestarEjemplar() {

    }
}
