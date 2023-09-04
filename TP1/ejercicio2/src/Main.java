// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 2: \n ");

        ListaEnlazada lista = new ListaEnlazada();
        lista.Agregar(3);
        lista.Agregar(8);
        lista.Agregar(9);

        System.out.print("El largo de la lista es de "+ lista.Largo());
        System.out.print(" La lista esta vacia?"+ lista.esVacia());

        System.out.print("Elementos de la lista: \n");
        for (int i=0;i< lista.Largo();i++){
            System.out.print(lista.Recuperar(i)+" ");
        }

        lista.Insetar(6,0);
        lista.Eliminar(9);

        System.out.print(" lista actual: \n");
        for (int i=0;i< lista.Largo();i++){
            System.out.print(lista.Recuperar(i)+" ");
        }
    }
}