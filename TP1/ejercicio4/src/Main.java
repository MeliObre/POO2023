// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 4");
        Cola nuevaCola =new Cola();
        nuevaCola.encolar(5);
        nuevaCola.encolar(6);
        nuevaCola.encolar(9);

        System.out.print(" Frente de la cola: "+ nuevaCola.frente());
        System.out.print(" Tamaño de la cola: "+ nuevaCola.tamaño());

        while (!nuevaCola.esVacia()){
            System.out.print(" Desencolado: "+ nuevaCola.desencolar());
        }
        System.out.print(" La cola esta vacia: "+ nuevaCola.esVacia());

    }
}