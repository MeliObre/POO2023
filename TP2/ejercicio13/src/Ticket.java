public class Ticket {
    private String numero;
    private double precio;
    private Vuelo vuelo;

    public Ticket(String numero, double precio, Vuelo vuelo) {
        this.numero = numero;
        this.precio = precio;
        this.vuelo = vuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNumero() {
        return numero;
    }
}
