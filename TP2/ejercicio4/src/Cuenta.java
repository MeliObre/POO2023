import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double INTERES_POR_INVERSION = 0.4;
    private static final int PLAZO_DIAS_INVERSION = 30;
    private LocalDate fechaInversion;

    public Cuenta(double saldo, double limiteGiroDescubierto) {
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.giroDescubierto = 0;
        this.saldoInvertido = 0;
        this.fechaInversion = null;
    }

    public boolean gastar(double monto) {
        boolean res = false;

        if ((this.saldo + (this.limiteGiroDescubierto - this.giroDescubierto)) >= monto) {
            if (this.saldo < monto) {
                // Giro en descubierto
                this.giroDescubierto += monto - this.saldo;
                this.saldo = 0;
            } else {
                // El saldo me alza para el gasto
                this.saldo -= monto;
            }
            res = true;
        }

        return res;
    }

    public void depositar(double monto) {
        // Intenta cubrir primero el giro en descubierto si hay deuda.
        if (this.giroDescubierto > 0) {
            if (monto >= this.giroDescubierto) {
                this.saldo += this.giroDescubierto;
                monto -= this.giroDescubierto;
                this.giroDescubierto = 0;
            } else {
                this.saldo += monto;
                this.giroDescubierto -= monto;
                return;
            }
        }

        // Si queda dinero disponible, aumenta el saldo.
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public boolean invertir(double monto) {
        if (monto > 0 && this.saldo >= monto && this.fechaInversion == null) {
            this.saldoInvertido = monto;
            this.fechaInversion = LocalDate.now();
            return true;
        }
        return false;
    }

    public boolean recuperarInversion() {
        if (this.saldoInvertido > 0) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaLimite = this.fechaInversion.plusDays(PLAZO_DIAS_INVERSION);
            if (fechaActual.isAfter(fechaLimite)) {
                double interes = this.saldoInvertido * INTERES_POR_INVERSION;
                this.saldo += this.saldoInvertido + interes;
                this.saldoInvertido = 0;
                this.fechaInversion = null;
                return true;
            }
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getGiroDescubierto() {
        return this.giroDescubierto;
    }

    public double getLimiteGiroDescubierto() {
        return this.limiteGiroDescubierto;
    }

    public double getMontoInvertido() {
        return this.saldoInvertido;
    }

    public double getInteresAGanar() {
        if (this.fechaInversion != null) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaLimite = this.fechaInversion.plusDays(PLAZO_DIAS_INVERSION);
            if (fechaActual.isAfter(fechaLimite)) {
                return this.saldoInvertido * INTERES_POR_INVERSION;
            }
        }
        return 0.0d;
    }
}
