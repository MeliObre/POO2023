
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Ejercicio 1: !\n");

        Actividad natacion = new Actividad("Natación");
        Actividad tenis = new Actividad("Tenis");
        Actividad boxeo = new Actividad("Boxeo");

        //Creo tipo de suscripcion
        Suscripcion basica = new Suscripcion("Básica");
        basica.agregarActividad(natacion);

        Suscripcion intermedia = new Suscripcion("Intermedia");
        intermedia.agregarActividad(natacion);
        intermedia.agregarActividad(tenis);

        Suscripcion destacada = new Suscripcion("Destacada");
        destacada.agregarActividad(natacion);
        destacada.agregarActividad(tenis);
        destacada.agregarActividad(boxeo);

        //Creo algunos socios
        Socio socio1=new Socio("Melina", "Obregón","Durazno 4088", "meliobre06@gmail.com", intermedia);
        Socio socio2=new Socio("Pedro","Lopez", "Calle 789", "pedro@email.com", destacada);
        Socio socio3=new Socio("Iris", "Rodriguez", "Avenida 456", "irisR@gmail.com", basica);

        socio1.realizarActividad(natacion);
        socio1.realizarActividad(tenis);
        socio1.realizarActividad(boxeo);

        socio3.realizarActividad(natacion);
        socio3.realizarActividad(tenis);

    }
}