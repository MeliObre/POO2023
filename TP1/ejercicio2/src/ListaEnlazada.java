public class ListaEnlazada {
    private Nodo inicio;
    private int longitud;

    public ListaEnlazada(){
        inicio=null;
        longitud=0;
    }
    public boolean esVacia(){
        return longitud==0;
    }
    public int Largo(){
        return longitud;
    }
    public void Agregar(Object dato){
        Nodo nuevoNodo=new Nodo(dato);
        if (inicio==null){
            inicio=nuevoNodo;
        }else{
           Nodo actual=inicio;
           while (actual.getProximo()!=null){
               actual=actual.getProximo();
           }
           actual.setProximo(nuevoNodo);
           nuevoNodo.setAnterior(actual);
        }
        longitud++;
    }
    public void Eliminar (Object dato){
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getDato() == dato) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setProximo(actual.getProximo());
                } else {
                    inicio = actual.getProximo();
                }
                if (actual.getProximo() != null) {
                    actual.getProximo().setAnterior(actual.getAnterior());
                }
                longitud--;
                break;
            }
            actual = actual.getProximo();
        }
    }

    public Object Recuperar (int indice){
        if (indice<0 || indice >=longitud){
            throw new IndexOutOfBoundsException();
        }
        Nodo actual=inicio;
        for (int i=0;i<indice;i++){
            actual=actual.getProximo();
        }
        return actual.getDato();
    }

    public void Insetar (Object dato, int posicion){
        if (posicion<0  || posicion > longitud){
            throw new IndexOutOfBoundsException();
        }
        if (posicion==0){
            Nodo nuevoNodo = new Nodo (dato);
            nuevoNodo.setProximo(inicio);
            if (inicio!=null){
                inicio.setAnterior(nuevoNodo);
            }
            inicio=nuevoNodo;
            longitud++;
            return;
        }
        Nodo actual=inicio;
        for (int i=0;i<posicion-1;i++){
            actual=actual.getProximo();
        }
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setProximo(actual.getProximo());
        nuevoNodo.setAnterior(actual);
        if (actual.getProximo()!=null){
            actual.getProximo().setAnterior(nuevoNodo);
        }
        actual.setProximo(nuevoNodo);
        longitud++;
    }
}
