import java.awt.*;
import java.util.ArrayList;

public class CuentaCredito extends Cuenta{
    private double limite;

    public CuentaCredito(double limite) {
        super(0); // El saldo inicial siempre es cero para la cuenta de crédito
        this.limite = limite;
    }

    public boolean comprar(double monto) {
        if (monto > 0 && (getSaldo() + limite) >= monto) {
            super.gastar(monto); // Se permite gastar más allá del saldo actual
            return true;
        }
        return false;
    }

    public boolean pagar(double monto) {
        super.depositar(monto); // Simplemente deposita el dinero en la cuenta de crédito
        return true;
    }

    public double getSaldoDeudor() {
        return -getSaldo(); // El saldo deudor es igual al negativo del saldo
    }

    public double getMontoDisponibleParaCompras() {
        return limite + getSaldo(); // El monto disponible para compras incluye el límite y el saldo actual
    }
}
