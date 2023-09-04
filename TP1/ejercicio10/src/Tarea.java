import java.time.LocalDate;
public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean estado;
    private LocalDate fecha;
    private LocalDate fechaRecordatorio; // Nueva fecha de recordatorio

    public Tarea(String descripcion, String prioridad, LocalDate fecha, LocalDate fechaRecordatorio) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false;
        this.fecha = fecha;
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public void modificarDes(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void terminada() {
        this.estado = true;
    }

    public boolean esVacia() {
        return !estado && LocalDate.now().isAfter(fecha);
    }

    public boolean completa() {
        return estado;
    }

    public String mostrarTarea() {
        String mensaje = "";

        // Agregar el prefijo "(por vencer)" si la fecha de recordatorio es mayor o igual a la fecha actual
        if (fechaRecordatorio != null && !estado && LocalDate.now().isAfter(fechaRecordatorio)) {
            mensaje += "(por vencer) ";
        }

        // Si la tarea está próxima a vencer, aumentar la prioridad a la más alta
        if (fechaRecordatorio != null && LocalDate.now().isAfter(fechaRecordatorio)) {
            prioridad = "Alta";
        }

        mensaje += descripcion + " - Prioridad: " + prioridad;

        if (estado) {
            mensaje += " Completa";
        }

        return mensaje;
    }
}
