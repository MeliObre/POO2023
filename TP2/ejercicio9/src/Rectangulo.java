public class Rectangulo extends Forma2D{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }
}
