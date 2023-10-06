public class Vehiculo {
    private String patente;
    public double precioBase;
    private int diasAlquilados;

    public Vehiculo(String patente) {
        this.patente = patente;
        this.precioBase = 3000.0;
        this.diasAlquilados = 0;
    }

    public double calcularCostoAlquiler() {
        return precioBase * diasAlquilados;
    }

    public void setDiasAlquilados(int diasAlquiler) {
        this.diasAlquilados = diasAlquiler;
    }
}
