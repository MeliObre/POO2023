public class Tripulante  extends Rol{
    private String cargo;

    public Tripulante(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String obtenerTipo() {
        return "Tripulante";
    }
}
