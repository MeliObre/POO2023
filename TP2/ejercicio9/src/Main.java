// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 9");
        Forma2D circulo = new Circulo(5);
        Forma2D rectangulo = new Rectangulo(4, 6);
        Forma3D esfera = new Esfera(3);

        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Área de la esfera: " + esfera.getArea());
        System.out.println("Volumen de la esfera: " + esfera.getVolumen());
    }
}