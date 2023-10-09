public class Diario extends Publicacion{
    private String fechaPublicacion;

    public Diario(String nombre, String editor, String telefonoProveedor, int anioPublicacion, String fechaPublicacion) {
        super(nombre, editor, telefonoProveedor, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getter y setter para el atributo específico de diario

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de Publicación: " + fechaPublicacion;
    }

}
