import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Suscripcion {
    private String tipo;
    private List<Actividad> actividadesAccesibles; // Corregido el tipo de lista

    public Suscripcion(String tipo) {
        this.tipo = tipo;
        this.actividadesAccesibles = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        actividadesAccesibles.add(actividad);
    }

    public boolean tieneAcceso(Actividad actividad) {
        return actividadesAccesibles.contains(actividad);
    }

}
