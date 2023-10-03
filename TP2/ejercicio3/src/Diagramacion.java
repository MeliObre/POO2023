import java.util.ArrayList;
import java.util.List;

public class Diagramacion {
    private String diaHorario;
    private String nivel;
    private Disciplina disciplina;
    private Profesor profesor;
    private List<Alumno> alumnosInscritos = new ArrayList<>();

    public Diagramacion(String diaHorario, String nivel, Disciplina disciplina, Profesor profesor) {
        this.diaHorario = diaHorario;
        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
    }

    public void registrarAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
