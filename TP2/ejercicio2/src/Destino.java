import java.util.List;
public class Destino {
    private String nombre;
    private String descripcion;
    private List<Excursion> excursiones;
    private MediodeTransporte medioDeTransporte;
    private Hospedaje hospedaje;

    public Destino(String nombre, String descripcion, MediodeTransporte medioDeTransporte, Hospedaje hospedaje) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medioDeTransporte = medioDeTransporte;
        this.hospedaje = hospedaje;
    }

    public String getNombre(){
        return nombre;
    }

}
