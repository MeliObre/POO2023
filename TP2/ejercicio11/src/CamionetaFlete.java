public class CamionetaFlete extends Vehiculo{
    private double pesoAutorizadoTotal;

    public CamionetaFlete(String patente, double pesoAutorizadoTotal) {
        super(patente);
        this.pesoAutorizadoTotal = pesoAutorizadoTotal;
    }

    @Override
    public double calcularCostoAlquiler() {
        return super.calcularCostoAlquiler() + (600.0 * pesoAutorizadoTotal);
    }
}
