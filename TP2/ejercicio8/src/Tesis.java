public class Tesis extends Publicacion{
    private String autor;
    private String mesPublicacion;

    public Tesis(String nombre, String editor, String telefonoProveedor, int anioPublicacion, String autor, String mesPublicacion) {
        super(nombre, editor, telefonoProveedor, anioPublicacion);
        this.autor = autor;
        this.mesPublicacion = mesPublicacion;
    }

    // Getters y setters para atributos específicos de tesis

    public String getAutor() {
        return autor;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Mes de Publicación: " + mesPublicacion;
    }

}
