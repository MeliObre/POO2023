// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Pruebas de funcionamiento (Ejercicio 1): \n");

        Lista nuevalista = new Lista();

        nuevalista.agregar(4);
        nuevalista.agregar(5);
        nuevalista.agregar(8);

        System.out.print("vacia : "+nuevalista.esVacia()+ "\n")  ;
        System.out.print("largo de la lista: "+nuevalista.longitud()+" \n");
        nuevalista.insertar(1,3);
        System.out.print("Primer elemento: "+nuevalista.recuperar(1)+"\n");
        System.out.print("Largo:"+ nuevalista.longitud()+"\n");
        nuevalista.eliminar(5);
        System.out.print("largo2: "+nuevalista.longitud()+" \n");

        System.out.print("Elementos de la lista: \n");
        for (int i = 0; i <nuevalista.longitud(); i++) {
            System.out.print(nuevalista.recuperar(i) + " ");
        }
    }
}