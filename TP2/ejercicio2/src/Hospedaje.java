public class Hospedaje {
    private String nombre;
    private String ubicacion;
    private String servicios;
    private int precio;

    public Hospedaje(String nombre, String ubicacion, String servicios) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.servicios = servicios;
    }
    public double getPrecio() {
        return precio;
    }
}
