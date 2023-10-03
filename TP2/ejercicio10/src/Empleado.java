public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;

    public Empleado(String nombre, String apellido, String telefono, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
    }

    public abstract double calcularSueldo();

    public double calcularBonoCumpleaños() {
        return 2000.0;
    }
}
