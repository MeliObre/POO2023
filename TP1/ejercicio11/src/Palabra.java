import  java.util.ArrayList;
import  java.util.List;
public class Palabra {
    private String palabra;
    public Palabra (String palabra){
        this.palabra=palabra;
    }
    public String getPalabra(){
        return palabra;
    }
    public int calcularPuntaje(){
        int puntaje=palabra.length();
        for (char letra:palabra.toCharArray()){
            if (letra =='k'|| letra == 'z' || letra == 'x' || letra == 'y' || letra == 'w' || letra == 'q'){
               puntaje++;
            }
        }
        return puntaje;
    }
}
