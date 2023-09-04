public class Nodo {
    private Object dato;
    private Nodo proximo=null;
    private Nodo anterior;

    public Nodo(Object dato){
        this.dato=dato;
        this.proximo=null;
        this.anterior=null;
    }
    public void setDato(Object dato){
        this.dato=dato;
    }

    public void  setProximo(Nodo proximo){
        this.proximo=proximo;
    }

    public void setAnterior(Nodo anterior){
        this.anterior=anterior;
    }
    public Object getDato(){
        return dato;
    }
    public Nodo getProximo(){
        return proximo;
    }
    public Nodo getAnterior(){
        return anterior;
    }

}
