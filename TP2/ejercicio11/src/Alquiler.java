public class Alquiler {
    Presupuesto presupuesto;
    private double saldoPagar;

    public Alquiler(Presupuesto presupuesto, double saldoPagar) {
        this.presupuesto = presupuesto;
        this.saldoPagar = saldoPagar;
    }

    public double calcularSaldoPagar() {
        return saldoPagar;
    }
}
