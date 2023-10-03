public class Excursion {
    private String nombre;
    private String descripcion;
    private double costo;

    public Excursion(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }
    public double getCosto() {
        return costo;
    }
}
