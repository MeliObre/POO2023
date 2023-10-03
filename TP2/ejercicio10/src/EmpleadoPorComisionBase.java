public class EmpleadoPorComisionBase extends Empleado{
    private double salarioBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoPorComisionBase(String nombre, String apellido, String telefono, String cuit, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, apellido, telefono, cuit);
        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSueldo() {
        // Calculamos el sueldo sumando el salario base y la comisión de ventas
        double comisionVentas = ventasRealizadas * (porcentajeComision / 100.0);
        return salarioBase + comisionVentas;
    }

    @Override
    public double calcularBonoCumpleaños() {
        return super.calcularBonoCumpleaños() + (ventasRealizadas * 0.005);
    }
}
