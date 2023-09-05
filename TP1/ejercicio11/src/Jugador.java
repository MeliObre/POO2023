import java.util.ArrayList;
import java.util.List;
public class Jugador {
    private String nombre;
    private List<Palabra> palabrasFormadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        palabrasFormadas = new ArrayList<>();
    }
    public void agregarPalabra(String palabra, Diccionario diccionario) {
        if (diccionario.esValida(palabra)) {
            palabrasFormadas.add(new Palabra(palabra));
        } else {
            System.out.println("La palabra '" + palabra + "' no es válida.\n");
        }
    }
    public int getPuntajeTotal() {
        int puntajeTotal = 0;
        for (Palabra palabra : palabrasFormadas) {
            puntajeTotal += palabra.calcularPuntaje();
        }
        return puntajeTotal;
    }
    public String getNombre() {
        return nombre;
    }
}
