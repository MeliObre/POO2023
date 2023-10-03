import java.util.Date;

public class Asistencia {
    private Alumno alumno;
    private Diagramacion diagramacion;
    private Date fecha;
    private boolean presente;

    public Asistencia(Alumno alumno, Diagramacion diagramacion, Date fecha, boolean presente) {
        this.alumno = alumno;
        this.diagramacion = diagramacion;
        this.fecha = fecha;
        this.presente = presente;
    }

    public boolean isPresente() {
        return presente;
    }

    public Diagramacion getDiagramacion() {
        return diagramacion;
    }
}
