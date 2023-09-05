import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tarea {
    private String titulo;
    private String prioridad;
    private LocalDate fechaVencimiento;
    private boolean realizada;

    public Tarea(String titulo, String prioridad, LocalDate fechaVencimiento) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.realizada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void marcarComoRealizada() {
        realizada = true;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " - Prioridad: " + prioridad + " - Fecha de Vencimiento: " + fechaVencimiento + " - Realizada: " + realizada;
    }
}
