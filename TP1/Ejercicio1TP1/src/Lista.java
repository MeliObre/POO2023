public class Lista {
    private Nodo cabeza;
    private int size;

    public Lista(){
        cabeza=null; //Inicializa la cabeza en null, para indicar que la lista esta vacia
        size=0;// Inicializa el tamaño en 0
    }

    public boolean esVacia(){
        return (cabeza==null);
    }
    public int longitud(){
        return size;
    }
    public void agregar(Object dato){
        Nodo nuevoNodo= new Nodo(dato);
        if (cabeza==null){
            cabeza=nuevoNodo;
        }else{
           Nodo actual=cabeza;
           while (actual.getProximo()!=null){
               actual=actual.getProximo();
           }
           actual.setProximo(nuevoNodo);
        }
        size ++;
    }

    public void eliminar(Object dato){
          if (cabeza==null){
              return;
          }
          if (cabeza.getDato().equals(dato)){
                  cabeza=cabeza.getProximo();
                  size --;
                  return;
          }
          Nodo actual =cabeza;
          while (actual.getProximo()!=null){
              if (actual.getProximo().getDato().equals(dato)){
                  actual.setProximo(actual.getProximo().getProximo());
                  size --;
                  return;

              }
              actual= actual.getProximo();
          }
    }

    public Object recuperar (int index ) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
        Nodo actual = cabeza;
        for (int i = 0; i < index; i++) {
            actual = actual.getProximo();
        }

        return actual.getDato();
    }

    public Object insertar(int index, Object dato) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
        Nodo nuevoNodo =new Nodo (dato);
        if (index==0){
            nuevoNodo.setProximo(cabeza);
            cabeza=nuevoNodo;
        }else{
            Nodo actual=cabeza;
            for (int i=0;i<index -1;i++){
                actual=actual.getProximo();
            }
            nuevoNodo.setProximo(actual.getProximo());
            actual.setProximo(nuevoNodo);
        }

        size ++;
        return dato;
    }
}
