public class Nodo {
    private Object dato;
    private Nodo prox=null;

    public Nodo (Object dato){
        this.dato=dato;
        this.prox=null;
    }
    public Object getDato(){
        return dato;
    }
    public  void setDato(Object dato){
        this.dato=dato;
    }
    public Nodo getProx(){
        return prox;
    }
    public void setProx(Nodo prox){
        this.prox=prox;
    }
}
