import java.time.LocalDate;
import java.util.ArrayList;
public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean estado;
    private LocalDate fecha;

    public Tarea (String descripcion, String prioridad, LocalDate fecha){
        this.descripcion=descripcion;
        this.prioridad=prioridad;
        this.estado=false; //La inicializo como incompleta
        this.fecha=fecha;
    }
    public void modificarDes(String nuevaDescripcion){
        this.descripcion=nuevaDescripcion;
    }
    public  void cambiarPrioridad(String nuevaPrioridad){
        this.prioridad=nuevaPrioridad;
    }
    public void  terminada(){
        this.estado=true;
    }
    public  boolean esVacia(){
        return !estado && LocalDate.now().isAfter(fecha);
    }
    public boolean completa(){
        return estado;
    }
    public String mostrarTarea (){
        String mensaje="";
        if (esVacia()){
            mensaje+=" Vencida";
        }
        mensaje+=descripcion+"- Prioridad: "+ prioridad;
        if (estado){
            mensaje+= " Completa";
        }
        return mensaje;
    }
}
