public class EmpleadoAsalariado extends Empleado{
    private double salarioFijo;

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String cuit, double salarioFijo) {
        super(nombre, apellido, telefono, cuit);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSueldo() {
        return salarioFijo;
    }

    @Override
    public double calcularBonoCumpleaños() {
        return super.calcularBonoCumpleaños() + 1000.0;
    }
}
