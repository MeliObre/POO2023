import java.util.*;

public class Academia {
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Diagramacion> diagramaciones = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Asistencia> asistencias = new ArrayList<>();

    public void agregarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarDiagramacion(Diagramacion diagramacion) {
        diagramaciones.add(diagramacion);
    }

    public void inscribirAlumno(Alumno alumno, Diagramacion diagramacion) {
        Credencial credencial = new Credencial(alumno);
        alumno.agregarCredencial(credencial);
        diagramacion.registrarAlumno(alumno);
    }

    public void registrarAsistencia(Alumno alumno, Diagramacion diagramacion, Date fecha, boolean presente) {
        Asistencia asistencia = new Asistencia(alumno, diagramacion, fecha, presente);
        asistencias.add(asistencia);
    }

    public void generarInformeDePagos() {
        Map<Profesor, Double> pagosProfesores = new HashMap<>();

        for (Asistencia asistencia : asistencias) {
            if (asistencia.isPresente()) {
                Profesor profesor = asistencia.getDiagramacion().getProfesor();
                double pago = pagosProfesores.getOrDefault(profesor, 0.0);
                pagosProfesores.put(profesor, pago + 10.0); // Cada día de asistencia paga $10 al profesor.
            }
        }

        for (Map.Entry<Profesor, Double> entry : pagosProfesores.entrySet()) {
            System.out.println("Profesor: " + entry.getKey().getNombre() + ", Pago: $" + entry.getValue());
        }
    }

    public Disciplina obtenerDisciplinaMasRentable() {
        Map<Disciplina, Double> ingresosPorDisciplina = new HashMap<>();

        for (Asistencia asistencia : asistencias) {
            if (asistencia.isPresente()) {
                Disciplina disciplina = asistencia.getDiagramacion().getDisciplina();
                double ingreso = ingresosPorDisciplina.getOrDefault(disciplina, 0.0);
                ingresosPorDisciplina.put(disciplina, ingreso + 10.0); // Cada día de asistencia genera $10 de ingreso.
            }
        }

        // Encontrar la disciplina con más ingresos
        Disciplina disciplinaMasRentable = null;
        double maxIngreso = 0.0;

        for (Map.Entry<Disciplina, Double> entry : ingresosPorDisciplina.entrySet()) {
            if (entry.getValue() > maxIngreso) {
                disciplinaMasRentable = entry.getKey();
                maxIngreso = entry.getValue();
            }
        }

        return disciplinaMasRentable;
    }
}
