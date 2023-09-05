// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 11 \n");

        Diccionario diccionario = new Diccionario();
        diccionario.agregarPalabrasV("java");
        diccionario.agregarPalabrasV("programacion");
        diccionario.agregarPalabrasV("jugador");
        diccionario.agregarPalabrasV("diccionario");

        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        jugador1.agregarPalabra("java", diccionario);
        jugador1.agregarPalabra("programacion", diccionario);
        jugador2.agregarPalabra("jugador", diccionario);
        jugador2.agregarPalabra("python", diccionario); // Esta palabra no es válida

        int puntajeJugador1 = jugador1.getPuntajeTotal();
        int puntajeJugador2 = jugador2.getPuntajeTotal();

        System.out.println("Puntaje de " + jugador1.getNombre() + ": " + puntajeJugador1);
        System.out.println("Puntaje de " + jugador2.getNombre() + ": " + puntajeJugador2);

        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println(jugador1.getNombre() + " es el ganador.");
        } else if (puntajeJugador1 < puntajeJugador2) {
            System.out.println(jugador2.getNombre() + " es el ganador.");
        } else {
            System.out.println("El juego ha terminado en empate.");
        }
    }
}