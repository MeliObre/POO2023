import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 3");
        // Crear una instancia de la academia
        Academia academia = new Academia();

        // Agregar disciplinas
        Disciplina tango = new Disciplina("Tango");
        Disciplina salsa = new Disciplina("Salsa");
        academia.agregarDisciplina(tango);
        academia.agregarDisciplina(salsa);

        // Agregar profesores
        Profesor profesorTango = new Profesor("Profesor Tango");
        Profesor profesorSalsa = new Profesor("Profesor Salsa");
        academia.agregarProfesor(profesorTango);
        academia.agregarProfesor(profesorSalsa);

        // Crear diagramaciones (clases)
        Diagramacion diagramacionTango1 = new Diagramacion("Lunes y Viernes", "Inicial", tango, profesorTango);
        Diagramacion diagramacionTango2 = new Diagramacion("Martes y Sábado", "Intermedio", tango, profesorTango);
        Diagramacion diagramacionSalsa = new Diagramacion("Miércoles", "Avanzado", salsa, profesorSalsa);
        academia.agregarDiagramacion(diagramacionTango1);
        academia.agregarDiagramacion(diagramacionTango2);
        academia.agregarDiagramacion(diagramacionSalsa);

        // Crear alumnos
        Alumno alumno1 = new Alumno("Alumno 1", "alumno1@email.com");
        Alumno alumno2 = new Alumno("Alumno 2", "alumno2@email.com");

        // Inscribir alumnos en clases
        academia.inscribirAlumno(alumno1, diagramacionTango1);
        academia.inscribirAlumno(alumno2, diagramacionSalsa);

        // Registrar asistencia
        Date fechaHoy = new Date();
        academia.registrarAsistencia(alumno1, diagramacionTango1, fechaHoy, true);
        academia.registrarAsistencia(alumno2, diagramacionSalsa, fechaHoy, false);

        // Generar informe de pagos
        academia.generarInformeDePagos();

        // Encontrar la disciplina más rentable
        Disciplina disciplinaMasRentable = academia.obtenerDisciplinaMasRentable();
        System.out.println("La disciplina más rentable es: " + disciplinaMasRentable);

        // Puedes agregar más interacciones y pruebas según tus necesidades.
    }
}