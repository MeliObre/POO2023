public class CajaDeAhorro extends Cuenta {
    public CajaDeAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean gastar(double monto) {
        if (getSaldo() >= monto) {
            super.gastar(monto); // El saldo es suficiente para el gasto
            return true;
        }
        return false;
    }
}
