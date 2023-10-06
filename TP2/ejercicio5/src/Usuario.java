public class Usuario {
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;
    private boolean precancelacionAutomatica = false; // Nuevo atributo

    public Usuario(Cuenta cuenta, CuentaCredito cuentaCredito) {
        this.cuenta = cuenta;
        this.cuentaCredito = cuentaCredito;
    }

    public Usuario(Cuenta cuenta) {
        this(cuenta, null);
    }
    /* Agregar un método en la clase Usuario para habilitar o deshabilitar la
    precancelación automática. Esto permitirá a los usuarios controlar si desean que las
    inversiones se cancelen automáticamente al realizar gastos mayores al saldo.*/
    public void habilitarPrecancelacionAutomatica(boolean habilitar) {
        this.precancelacionAutomatica = habilitar;
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

    /*Los métodos realizarGasto y realizarGastoYGirar deben considerar si la precancelación automática
    está habilitada antes de realizar un gasto que podría cancelar una inversión.*/

    public boolean realizarGasto(double monto) {
        if (monto > this.cuenta.getSaldo()) {
            if (this.precancelacionAutomatica) {
                this.cuenta.recuperarInversion();
            } else {
                System.out.println("No se puede realizar el gasto, se va a girar en descubierto.");
                return false;
            }
        }
        return this.cuenta.gastar(monto);
    }

    public boolean realizarGastoYGirar(double monto) {
        if (monto > this.cuenta.getSaldo()) {
            if (this.precancelacionAutomatica) {
                this.cuenta.recuperarInversion();
            } else {
                System.out.println("No se puede realizar el gasto, se va a girar en descubierto.");
                return false;
            }
        }
        return this.cuenta.gastar(monto);
    }


    public void realizarDeposito(double monto) {
        this.cuenta.depositar(monto);
    }


    public boolean realizarInversion(double monto, boolean precancelar) {
        return this.cuenta.invertir(monto, precancelar);
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
