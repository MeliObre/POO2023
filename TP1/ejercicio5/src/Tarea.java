import java.time.LocalDate;
import java.util.ArrayList;
public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean estado;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, String prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false; // Inicialmente, la tarea está incompleta.
        this.fechaLimite = fechaLimite;
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void terminarTarea() {
        this.estado = true;
    }

    public boolean estaVencida() {
        LocalDate fechaActual = LocalDate.now();
        return !estado && fechaLimite.isBefore(fechaActual);
    }

    public boolean estaCompleta() {
        return estado;
    }

    public String mostrarTarea() {
        String mensaje = "";
        if (estaCompleta()) {
            mensaje += "(Vencida) ";
        }
        mensaje += descripcion + " - Prioridad: " + prioridad;
        return mensaje;
    }
}
