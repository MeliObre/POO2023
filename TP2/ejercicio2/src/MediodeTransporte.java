public class MediodeTransporte {
    private String nombre;
    private String detalles;
    private double precio; // Agregamos un atributo precio

    public void MedioDeTransporte(String nombre, String detalles, double precio) {
        this.nombre = nombre;
        this.detalles = detalles;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Destino getDestino() {
        return destino;
    }
}
