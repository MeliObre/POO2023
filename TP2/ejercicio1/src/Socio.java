public class Socio {
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private Credencial credencial;
    private Suscripcion suscripcion;

    public Socio(String nombre,String apellido, String direccion, String email, Suscripcion suscripcion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.email=email;
        this.credencial= new Credencial(this);
        this.suscripcion=suscripcion;
    }

    public void realizarActividad(Actividad actividad){
        if (suscripcion.tieneAcceso(actividad)){

        }else{
            System.out.print("No tiene acceso a la actividad");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }
}
