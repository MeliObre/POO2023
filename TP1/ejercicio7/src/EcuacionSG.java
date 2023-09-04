import java.util.Scanner;
public class EcuacionSG {
    private final double a;
    private final double b;
    private final double c;

    public EcuacionSG (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double calcularDis(){
        return (b * b )-(4*a*c);
    }
    public double calcularRaiz1(){
        double discriminante = calcularDis();
        if (discriminante<0){
            throw new ArithmeticException("No hay raíces reales");
        }
            return (-b-Math.sqrt(discriminante))/(2*a);

    }
    public double calcularRaiz2(){
        double discriminante=calcularDis();
        if (discriminante < 0) {
            throw new ArithmeticException(" No hay raics reales");
        }
        return (-b-Math.sqrt(discriminante))/(2*a);
    }
    public double calcularY(double x){
        return (a*x*x)+(b*x)+c;
    }
 }
