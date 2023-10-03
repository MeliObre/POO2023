// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 10");
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "123456789", "1234567890", 3000.0);
        Empleado empleadoPorComision = new EmpleadoPorComision("Maria", "Gomez", "987654321", "0987654321", 5000.0, 10.0);
        Empleado empleadoPorComisionBase = new EmpleadoPorComisionBase("Carlos", "Lopez", "456789012", "5678901234", 8000.0, 8.0, 2000.0);
        Empleado empleadoPorHora = new EmpleadoPorHora("Laura", "Martinez", "789012345", "6789012345", 45, 15.0);
        Empleado empleadoPasante = new EmpleadoPasante("Pedro", "Garcia", "567890123", "3456789012");

        // Calcular y mostrar sueldos y bonos por cumpleaños
        System.out.println("Sueldo de empleado asalariado: " + empleadoAsalariado.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado asalariado: " + empleadoAsalariado.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por comisión: " + empleadoPorComision.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por comisión: " + empleadoPorComision.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por comisión con salario base: " + empleadoPorComisionBase.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por comisión con salario base: " + empleadoPorComisionBase.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por hora: " + empleadoPorHora.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por hora: " + empleadoPorHora.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado pasante: " + empleadoPasante.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado pasante: " + empleadoPasante.calcularBonoCumpleaños());

    }
}