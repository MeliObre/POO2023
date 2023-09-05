import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class AdTarea {
    private List<Tarea> listaTareas;

    public AdTarea() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public List<Tarea> obtenerTareasNoVencidas() {
        LocalDate fechaActual = LocalDate.now();
        return listaTareas.stream()
                .filter(tarea -> !tarea.isRealizada() && tarea.getFechaVencimiento().isAfter(fechaActual))
                .sorted(Comparator.comparing(Tarea::getPrioridad)
                        .thenComparing(Tarea::getFechaVencimiento))
                .collect(Collectors.toList());
    }

    public Tarea buscarTareaPorTitulo(String titulo) {
        return listaTareas.stream()
                .filter(tarea -> tarea.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Tarea> obtenerTareasRealizadasPorColaborador(Colaborador colaborador) {
        return listaTareas.stream()
                .filter(tarea -> tarea.isRealizada() && tarea.getColaborador() == colaborador)
                .collect(Collectors.toList());
    }
}
