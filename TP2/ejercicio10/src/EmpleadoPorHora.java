public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, int horasTrabajadas, double salarioPorHora) {
        super(nombre, apellido, telefono, cuit);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = horasTrabajadas * salarioPorHora;
        if (horasTrabajadas > 40) {
            sueldo += (sueldo * 0.20); // 20% de bono por trabajar más de 40 horas
        }
        return sueldo;
    }
}
