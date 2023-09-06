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
    private LocalDate fechaRealizacion;
    private Colaborador colaborador;

    public Tarea(String titulo, String prioridad, LocalDate fechaVencimiento) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.realizada = false;
        this.fechaRealizacion = null;
        this.colaborador = null;
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

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void marcarComoRealizada(Colaborador colaborador) {
        realizada = true;
        fechaRealizacion = LocalDate.now();
        this.colaborador = colaborador;
    }

    @Override
    public String toString() {
        return "- Título: " + titulo + "\n"+" - Prioridad: " + prioridad +"\n"+ " - Fecha de Vencimiento: " + fechaVencimiento +"\n"+
                " - Realizada: " + realizada +"\n"+ " - Fecha de Realización: " + fechaRealizacion + "\n"+" - Colaborador: " + colaborador;
    }
}
