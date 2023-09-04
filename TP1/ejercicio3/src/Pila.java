public class Pila {
    private Nodo inicio;
    private int tamaño;

    public Pila(){
        inicio=null;
        tamaño=0;
    }
    public void  Apilar(Object dato){
        Nodo nuevoNodo=new Nodo(dato);
        nuevoNodo.setProx(inicio);
        inicio=nuevoNodo;
        tamaño++;
    }
    public Object Desapilar(){
        if (inicio==null){
            throw new IllegalStateException("La pila está vacía.");
        }
        Object datoDesapilado = inicio.getDato();
        inicio=inicio.getProx();
        tamaño--;
        return datoDesapilado;
    }
    public  Object inicio(){
        if (inicio==null){
            throw new IllegalStateException("La pila está vacía.");
        }
        return inicio.getDato();
    }
    public boolean esVacia (){
        return inicio==null;
    }
    public int tamaño(){
        return tamaño;
    }
}
