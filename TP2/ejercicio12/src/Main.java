import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuentas de ejemplo
        CuentaNormal cuentaNormal = new CuentaNormal(1000, 500);
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(1500);
        CuentaCredito cuentaCredito = new CuentaCredito(2000);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Realizar una compra");
            System.out.println("2. Realizar un depósito");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            double monto;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto de la compra: ");
                    monto = scanner.nextDouble();

                    if (cuentaNormal.gastar(monto)) {
                        System.out.println("Compra realizada con éxito (Cuenta Normal)");
                    } else {
                        System.out.println("No se pudo realizar la compra (Cuenta Normal)");
                    }

                    if (cajaDeAhorro.gastar(monto)) {
                        System.out.println("Compra realizada con éxito (Caja de Ahorro)");
                    } else {
                        System.out.println("No se pudo realizar la compra (Caja de Ahorro)");
                    }

                    if (cuentaCredito.comprar(monto)) {
                        System.out.println("Compra realizada con éxito (Cuenta de Crédito)");
                    } else {
                        System.out.println("No se pudo realizar la compra (Cuenta de Crédito)");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el monto del depósito: ");
                    monto = scanner.nextDouble();

                    cuentaNormal.depositar(monto);
                    cajaDeAhorro.depositar(monto);
                    cuentaCredito.pagar(monto);

                    System.out.println("Depósito realizado en todas las cuentas.");
                    break;
                case 3:
                    System.out.println("Saldo en Cuenta Normal: " + cuentaNormal.getSaldo());
                    System.out.println("Saldo en Caja de Ahorro: " + cajaDeAhorro.getSaldo());
                    System.out.println("Saldo en Cuenta de Crédito: " + cuentaCredito.getSaldo());
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}