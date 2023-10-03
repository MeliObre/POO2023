public class EmpleadoPorComision extends Empleado{
    private double ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, String apellido, String telefono, String cuit, double ventasRealizadas, double porcentajeComision) {
        super(nombre, apellido, telefono, cuit);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSueldo() {
        return ventasRealizadas * (porcentajeComision / 100.0);
    }

    @Override
    public double calcularBonoCumpleaños() {
        return super.calcularBonoCumpleaños() + (ventasRealizadas * 0.005);
    }
}
