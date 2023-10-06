import java.util.Scanner;

/* Para mejorar la cohesión, encapsulamiento y contrato de las clases,
 propongo realizar las siguientes modificaciones:

*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 5\n");
        Cuenta cuentaNormal = new Cuenta(1000.0, 500.0);
        CuentaCredito cuentaCredito = new CuentaCredito(2000.0);
        Usuario usuario = new Usuario(cuentaNormal, cuentaCredito);

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar estado de la cuenta");
            System.out.println("2. Realizar gasto");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar inversión");
            System.out.println("5. Recuperar inversión");
            System.out.println("6. Habilitar/Desabilitar precancelación automática");
            System.out.println("7. Realizar compra a crédito");
            System.out.println("8. Realizar pago parcial");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    usuario.mostrarEstado();
                    break;
                case 2:
                    System.out.println("Ingrese el monto del gasto:");
                    double montoGasto = scanner.nextDouble();
                    usuario.realizarGasto(montoGasto);
                    break;
                case 3:
                    System.out.println("Ingrese el monto del depósito:");
                    double montoDeposito = scanner.nextDouble();
                    usuario.realizarDeposito(montoDeposito);
                    break;
                case 4:
                    System.out.println("Ingrese el monto de la inversión:");
                    double montoInversion = scanner.nextDouble();
                    System.out.println("¿Habilitar precancelación automática? (true/false):");
                    boolean precancelar = scanner.nextBoolean();
                    usuario.realizarInversion(montoInversion, precancelar);
                    break;
                case 5:
                    usuario.recuperarInversion();
                    break;
                case 6:
                    System.out.println("¿Habilitar/Desabilitar precancelación automática? (true/false):");
                    boolean habilitarPrecancelacion = scanner.nextBoolean();
                    usuario.habilitarPrecancelacionAutomatica(habilitarPrecancelacion);
                    break;
                case 7:
                    System.out.println("Ingrese el monto de la compra a crédito:");
                    double montoCompra = scanner.nextDouble();
                    usuario.realizarCompra(montoCompra);
                    break;
                case 8:
                    System.out.println("Ingrese el monto del pago parcial:");
                    double montoPago = scanner.nextDouble();
                    System.out.println("Ingrese el índice de la compra:");
                    int indiceCompra = scanner.nextInt();
                    usuario.realizarPago(montoPago, indiceCompra);
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }
}