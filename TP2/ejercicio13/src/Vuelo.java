import java.util.Date;

public class Vuelo {
    private Date fecha;
    private String origen;
    private String destino;

    public Vuelo(Date fecha, String origen, String destino) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
    }

    public void reservarPasaje(Persona pasajero) {
        // Lógica para reservar un pasaje
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
