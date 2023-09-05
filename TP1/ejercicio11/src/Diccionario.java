import java.util.ArrayList;
import java.util.List;

public class Diccionario {
    private List<String> palabrasValidas;
    public Diccionario(){
        palabrasValidas=new ArrayList<>();
    }
    public void agregarPalabrasV (String palabra){
        palabrasValidas.add(palabra);
    }
    public boolean esValida(String palabra){
        return palabrasValidas.contains(palabra);
    }
}
