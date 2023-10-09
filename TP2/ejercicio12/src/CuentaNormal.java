
public class CuentaNormal extends Cuenta{
    private double limiteGiroDescubierto;
    private double giroDescubierto;

    public CuentaNormal(double saldoInicial, double limiteGiroDescubierto) {
        super(saldoInicial);
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.giroDescubierto = 0;
    }

    @Override
    public boolean gastar(double monto) {
        if ((getSaldo() + (limiteGiroDescubierto - giroDescubierto)) >= monto) {
            if (getSaldo() < monto) {
                // Giro en descubierto
                giroDescubierto += monto - getSaldo();
                super.gastar(getSaldo()); // Gastar todo el saldo
            } else {
                super.gastar(monto); // El saldo es suficiente para el gasto
            }
            return true;
        }
        return false;
    }
}
