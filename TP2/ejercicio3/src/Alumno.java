import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String datosContacto;
    private List<Credencial> credenciales = new ArrayList<>();

    public Alumno(String nombre, String datosContacto) {
        this.nombre = nombre;
        this.datosContacto = datosContacto;
    }

    public void agregarCredencial(Credencial credencial) {
        credenciales.add(credencial);
    }
}
