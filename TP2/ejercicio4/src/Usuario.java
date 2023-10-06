public class Usuario {
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;

    public Usuario(Cuenta cuenta, CuentaCredito cuentaCredito) {
        this.cuenta = cuenta;
        this.cuentaCredito = cuentaCredito;
    }

    public Usuario(Cuenta cuenta) {
        this(cuenta, null);
    }


    public void mostrarEstado() {
        System.out.println("-----------------------");
        System.out.println("Saldo: " + this.cuenta.getSaldo());
        System.out.println("Giro en descubierto: " + this.cuenta.getLimiteGiroDescubierto() + "(" + this.cuenta.getGiroDescubierto() + ")");
        System.out.println("Inversiones: " + this.cuenta.getMontoInvertido() + "(" + this.cuenta.getInteresAGanar() + ")");
        System.out.println("--- Cuenta crédito ----");
        System.out.println("Disponible para compras: " + this.cuentaCredito.getMontoDisponibleParaCompras());
        System.out.println("Saldo deudor: " + this.cuentaCredito.getSaldoDeudor());
    }


    public boolean realizarGasto(double monto) {
        if (monto > this.cuenta.getSaldo()) {
            System.out.println("No se puede realizar el gasto, se va a girar en descubierto.");
            return false;
        } else {
            return this.cuenta.gastar(monto);
        }
    }


    public boolean realizarGastoYGirar(double monto) {
        return this.cuenta.gastar(monto);
    }


    public void realizarDeposito(double monto) {
        this.cuenta.depositar(monto);
    }


    public boolean realizarInversion(double monto) {
        return this.cuenta.invertir(monto);
    }


    public boolean recuperarInversion() {
        return this.cuenta.recuperarInversion();
    }


    public boolean realizarCompra(double monto) {
        return this.cuentaCredito.comprar(monto);
    }


    public boolean realizarPago(double monto, int indiceCompra) {
        return this.cuentaCredito.pagar(monto, indiceCompra);
    }
}
