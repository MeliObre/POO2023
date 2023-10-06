import java.util.Scanner;

//  La implementacion planteada, me parece correcta y que cumple con lo que pide el ejercicio
/* Clases:
Cuenta: Implementación correcta de operaciones como gastos, depósitos, inversiones y recuperación de inversiones.
        Verificación de saldos y límites antes de realizar operaciones.
        Cálculo de interés y control de fechas para inversiones.
CuentaCorriente: Gestión de compras, pagos parciales y cálculos relacionados con el saldo deudor.
                    Verificación de límite de crédito disponible para compras.
Usuario: Diseño adecuado para gestionar una cuenta normal y una cuenta de crédito asociadas a un usuario.
Falta implementar algunas operaciones y lógica en ambas
clases, como la gestión completa de inversiones y depósitos.
*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 4 \n");
        // Crear una cuenta normal con un saldo inicial y un límite de giro en descubierto
        Cuenta cuentaNormal = new Cuenta(1000.0, 500.0);

        // Crear una cuenta de crédito con un límite de crédito
        CuentaCredito cuentaCredito = new CuentaCredito(2000.0);

        // Crear un usuario con la cuenta normal y la cuenta de crédito
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
            System.out.println("6. Realizar compra a crédito");
            System.out.println("7. Realizar pago parcial");
            System.out.println("8. Salir");
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
                    usuario.realizarInversion(montoInversion);
                    break;
                case 5:
                    usuario.recuperarInversion();
                    break;
                case 6:
                    System.out.println("Ingrese el monto de la compra a crédito:");
                    double montoCompra = scanner.nextDouble();
                    usuario.realizarCompra(montoCompra);
                    break;
                case 7:
                    System.out.println("Ingrese el monto del pago parcial:");
                    double montoPago = scanner.nextDouble();
                    System.out.println("Ingrese el índice de la compra:");
                    int indiceCompra = scanner.nextInt();
                    usuario.realizarPago(montoPago, indiceCompra);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}