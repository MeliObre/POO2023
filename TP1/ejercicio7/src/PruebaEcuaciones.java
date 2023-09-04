import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PruebaEcuaciones {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" Ejercicio 7 \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingrese el coeficiente a \n");
        double a = scanner.nextDouble();

        System.out.print(" Ingrese el coeficiente b \n");
        double b = scanner.nextDouble();

        System.out.print(" Ingrese el coeficiente c \n");
        double c = scanner.nextDouble();

        EcuacionSG ecuacion = new EcuacionSG(a,b,c);

        double discirminante =ecuacion.calcularDis();
        if (discirminante>0){
            double raiz1= ecuacion.calcularRaiz1();
            double raiz2= ecuacion.calcularRaiz2();
            System.out.print(" Raiz 1: "+ raiz1+ " \n");
            System.out.print(" Raiz 2: "+raiz2+" \n");
        } else if (discirminante==0){
            double raizUnica = ecuacion.calcularRaiz1();
            System.out.print(" Raiz unica: "+ raizUnica+ "\n");
        }else {
            System.out.print(" No hay raices reales \n");
        }
        System.out.print("Ingrese un valor de x para calcular y: ");
        double x = scanner.nextDouble();
        double y = ecuacion.calcularY(x);
        System.out.println("El valor de y para x = " + x + " es " + y);

        scanner.close();
    }
}