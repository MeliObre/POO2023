import java.util.ArrayList;
import java.util.List;

public class CuentaCredito {
    private double limite;
    private List<Double> compras;
    private List<Double> pagado;

    public CuentaCredito(double limite) {
        this.limite = limite;
        this.compras = new ArrayList<>();
        this.pagado = new ArrayList<>();
    }

    public boolean comprar(double monto) {
        if (monto > 0 && (getSaldoDeudor() + monto) <= this.limite) {
            this.compras.add(monto);
            return true;
        }
        return false;
    }

    public boolean pagar(double monto, int indiceCompra) {
        if (indiceCompra >= 0 && indiceCompra < compras.size()) {
            double saldoCompra = compras.get(indiceCompra);
            double saldoPagado = (pagado.size() > indiceCompra) ? pagado.get(indiceCompra) : 0.0;

            if ((monto + saldoPagado) <= saldoCompra) {
                if (pagado.size() > indiceCompra) {
                    pagado.set(indiceCompra, saldoPagado + monto);
                } else {
                    pagado.add(monto);
                }
                return true;
            }
        }
        return false;
    }

    public double getSaldoDeudorCompra(int indiceCompra) {
        if (indiceCompra >= 0 && indiceCompra < compras.size()) {
            double saldoCompra = compras.get(indiceCompra);
            double saldoPagado = (pagado.size() > indiceCompra) ? pagado.get(indiceCompra) : 0.0;
            return saldoCompra - saldoPagado + (saldoCompra * 0.05); // Agregar 5% de interés
        }
        return 0.0d;
    }

    public double getSaldoDeudor() {
        double saldoTotal = 0.0;
        for (int i = 0; i < compras.size(); i++) {
            saldoTotal += getSaldoDeudorCompra(i);
        }
        return saldoTotal;
    }

    public double getMontoDisponibleParaCompras() {
        return limite - getSaldoDeudor();}
}
