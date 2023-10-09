import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double INTERES_POR_INVERSION = 0.4;
    private static final int PLAZO_DIAS_INVERSION = 30;
    private LocalDate fechaInversion;
    private LocalDate fechaInversionCancelada; // Nuevo atributo

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
    /*
    Cambio el método invertir para que acepte un parámetro booleano que indique si se
    desea habilitar la precancelación automática. Si la precancelación automática está habilitada
    y se intenta realizar un gasto mayor al saldo, se cancelará la inversión automáticamente.
    */
    public boolean invertir(double monto, boolean precancelar) {
        if (this.fechaInversion != null) {
            return false; // Ya hay una inversión activa
        }

        if (this.saldo >= monto) {
            this.saldoInvertido = monto;
            this.fechaInversion = LocalDate.now();
            return true;
        }

        // Si la precancelación automática está habilitada y se intenta gastar más del saldo
        if (precancelar) {
            this.saldoInvertido = this.saldo;
            this.fechaInversion = LocalDate.now();
            this.fechaInversionCancelada = LocalDate.now(); // Inversión cancelada automáticamente
            return true;
        }

        return false; // No hay suficiente saldo para invertir
    }
    /* Modifico el método recuperarInversion para tener en cuenta la nueva tasa de interés
     del 5% si han pasado al menos 30 días desde la inversión.
     También, si la inversión se cancela antes de la fecha límite, no se devolverá ningún interés.*/
    public boolean recuperarInversion() {
        if (this.fechaInversion != null) {
            LocalDate fechaActual = LocalDate.now();
            if (this.fechaInversion.plusDays(30).isBefore(fechaActual)) {
                // Han pasado al menos 30 días, se aplica la nueva tasa de interés del 5%
                double interes = this.saldoInvertido * 0.05;
                this.saldo += this.saldoInvertido + interes;
            } else if (this.fechaInversionCancelada != null
                    && this.fechaInversionCancelada.isBefore(this.fechaInversion)) {
                // La inversión se canceló antes de la fecha límite, no se devuelve interés
                this.saldo += this.saldoInvertido;
            }
            this.saldoInvertido = 0;
            this.fechaInversion = null;
            this.fechaInversionCancelada = null; // Se reinicia la fecha de cancelación
            return true;
        }
        return false; // No hay inversión que recuperar
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
