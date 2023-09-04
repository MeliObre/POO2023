import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 8 \n");
        Scanner escaner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de contraseñas a generar: \n");
        int numContrasenas = escaner.nextInt();

        ArrayList<Password> contrasenas = new ArrayList<>();

        for (int i = 0; i < numContrasenas; i++) {
            System.out.print("Ingrese la longitud para la contraseña " + (i + 1) + ": ");
            int longitud = escaner.nextInt();

            Password contrasena = new Password(longitud);
            contrasenas.add(contrasena);
        }

        for (Password contrasena : contrasenas) {
            String fortaleza = contrasena.esFuerte() ? "Fuerte" : "Débil";
            System.out.println(contrasena.obtenerContraseña() + " - " + fortaleza);
        }

        escaner.close();
    }

}