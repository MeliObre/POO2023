// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
Objetos involucrados:

Pila: Representa la estructura de datos en sí. Tiene métodos para apilar, desapilar, verificar
 si está vacía, obtener el tamaño y acceder al elemento en la parte superior.

Nodo: Unidad básica utilizada para almacenar los elementos en la pila.
Cada nodo contiene el elemento y una referencia al siguiente nodo.

Responsabilidades de cada objeto:

Pila:
- Apilar elementos en la parte superior.
- Desapilar elementos de la parte superior.
- Verificar si la pila está vacía.
- Obtener el tamaño actual de la pila.
- Acceder al elemento en la parte superior sin eliminarlo.

Nodo:
- Almacenar el elemento actual.
- Mantener una referencia al siguiente nodo.
*/

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 3: ");

        Pila nuevaPila = new Pila();

        nuevaPila.Apilar(6);
        nuevaPila.Apilar(3);
        nuevaPila.Apilar(5);

        System.out.print("Elemento de la cima: "+ nuevaPila.inicio()+ "\n");
        Object datoADesapilar = nuevaPila.Desapilar();
        System.out.print("Elemento desapilado: "+ datoADesapilar+" \n");
        System.out.print("Tamaño de la pila: "+ nuevaPila.tamaño()+"\n");
        System.out.print("La pila esta vacia "+nuevaPila.esVacia()+"\n");


    }
}