/*Descuentos para Clientes:
        Modificar la clase Cliente para incluir un atributo que rastree si el cliente está en el "top 10" del mes anterior.
        Crear un método para aplicar descuentos a los clientes según las condiciones especificadas.*/
public class Cliente {
    private String patente;
    private String nombre;
    private boolean enTop10MesAnterior;
    private double descuento;


    public String getNombre() {
        return nombre;
    }
    public boolean isEnTop10MesAnterior() {
        return enTop10MesAnterior;
    }

    public void setEnTop10MesAnterior(boolean enTop10MesAnterior) {
        this.enTop10MesAnterior = enTop10MesAnterior;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    // Resto de los métodos actuales

    public void aplicarDescuentoMesAnterior() {
        if (enTop10MesAnterior) {
            descuento = 0.05; // Descuento del 5% para clientes en el top 10
        } else {
            descuento = 0; // Sin descuento
        }
    }
}
