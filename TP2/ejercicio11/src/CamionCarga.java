public class CamionCarga extends Vehiculo{
    public CamionCarga(String patente) {
        super(patente);
    }

    @Override
    public double calcularCostoAlquiler() {
        if (getDiasAlquilados() > 30) {
            return 75000.0 * getDiasAlquilados();
        }
        return 100000.0 * getDiasAlquilados();
    }

    private double getDiasAlquilados() {
        return getDiasAlquilados();
    }
}
