public class EmpleadoPasante extends Empleado{
    public EmpleadoPasante(String nombre, String apellido, String telefono, String cuit) {
        super(nombre, apellido, telefono, cuit);
    }

    @Override
    public double calcularSueldo() {
        return 0.0;
    }
}
