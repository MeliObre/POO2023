public class Presupuesto {
    private Vehiculo vehiculo;
    private int diasAlquiler;
    private Cliente cliente;

    public Presupuesto(Vehiculo vehiculo, int diasAlquiler, Cliente cliente) {
        this.vehiculo = vehiculo;
        this.diasAlquiler = diasAlquiler;
        this.cliente = cliente;
    }

    public double calcularMontoFinal() {
        vehiculo.setDiasAlquilados(diasAlquiler);
        return vehiculo.calcularCostoAlquiler();
    }

    public Alquiler generarAlquiler() {
        double monto = calcularMontoFinal();
        return new Alquiler(this, monto);
    }

    public Cliente getCliente() {
        return cliente;
    }
}
