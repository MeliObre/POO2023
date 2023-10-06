public class AutoPasajero extends Vehiculo {
    private int cantidadAsientos;
    private boolean esVIP;

    public AutoPasajero(String patente, int cantidadAsientos, boolean esVIP) {
        super(patente);
        this.cantidadAsientos = cantidadAsientos;
        this.esVIP = esVIP;
    }

    @Override
    public double calcularCostoAlquiler() {
        double costoBase = super.calcularCostoAlquiler();
        if (esVIP) {
            return costoBase + 500.0;
        }
        return costoBase + (300.0 * cantidadAsientos);
    }
}
