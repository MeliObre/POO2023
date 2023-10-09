import java.util.Date;
import java.util.Scanner;

/*
Respuestas a la reflexion planteada:
1: Yo creo que el problema ocurre por la falta de una estructura adecuada
para maejar los roles de una persona en ele sistema, A l refinar las relaciones
y considerar una estructura de herencia o una clase de roles, se podria evitar
la duplicaicon de daros y permitir que un miembro de la tripulacion actue como pasajero.

2: Considero que el problema surgio debido a la forma en que se han modelado las relaciones entre
"Persona", "Tripulante" y "Pasajero" en el diagrama UML original. La duplicación de datos y la necesidad
de dar de alta a una persona dos veces, una como tripulante y otra como pasajero, es el resultado de cómo
se han establecido estas relaciones.

3: La sulucion que pense se basa en una nueva clase "Roles" y el uso de subclases para representar roles especificos.
Clase de Roles: En lugar de modelar directamente a "Persona" con relaciones separadas a "Tripulante" y
"Pasajero",  una clase de roles (por ejemplo, "Rol") en el modelo. Esta clase de roles puede
tener subclases para representar los diferentes roles que una persona puede desempeñar, como "Tripulante" y "Pasajero".
La clase "Persona" estaría relacionada con la clase "Rol" a través de una asociación. Esto permitirá que una persona tenga
múltiples roles en diferentes contextos de vuelo sin duplicación de datos.
*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 13\n");
        Scanner scanner = new Scanner(System.in);

        // vuelo
        System.out.println("Ingrese la fecha del vuelo (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();
        Date fecha = new Date(); // Debes implementar la conversión de cadena a Date
        System.out.println("Ingrese el origen del vuelo: ");
        String origen = scanner.nextLine();
        System.out.println("Ingrese el destino del vuelo: ");
        String destino = scanner.nextLine();
        Vuelo vuelo = new Vuelo(fecha, origen, destino);

        // Crear una persona (pasajero)
        System.out.println("Ingrese el nombre del pasajero: ");
        String nombrePasajero = scanner.nextLine();
        System.out.println("Ingrese el teléfono del pasajero: ");
        String telefonoPasajero = scanner.nextLine();
        System.out.println("Ingrese la dirección del pasajero: ");
        String direccionPasajero = scanner.nextLine();
        Persona pasajero = new Persona(nombrePasajero, telefonoPasajero, direccionPasajero);

        System.out.println("Ingrese el número de ticket: ");
        String numeroTicket = scanner.nextLine();
        System.out.println("Ingrese el precio del ticket: ");
        double precioTicket = Double.parseDouble(scanner.nextLine());
        Ticket ticket = new Ticket(numeroTicket, precioTicket, vuelo);

        // Reservar el pasaje
        vuelo.reservarPasaje(pasajero);

        // Informacion del pasajero y el ticket
        System.out.println("Detalles del pasajero:");
        System.out.println("Nombre: " + pasajero.getNombre());
        System.out.println("Teléfono: " + pasajero.getTelefono());
        System.out.println("Dirección: " + pasajero.getDireccion());

        System.out.println("\nDetalles del ticket:");
        System.out.println("Numero: " + ticket.getNumero());
        System.out.println("Precio: $" + ticket.getPrecio());
        System.out.println("Origen: " + vuelo.getOrigen());
        System.out.println("Destino: " + vuelo.getDestino());

        scanner.close();
    }
}