import javax.print.DocFlavor;
import javax.swing.*;

public class Cola {
    private Nodo frente;
    private Nodo fin;
    private int tamaño;

    public Cola(){
        frente=null;
        fin=null;
        tamaño=0;
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (esVacia()){
            frente= nuevoNodo;
            fin=nuevoNodo;
        }else {
            fin.setSiguente(nuevoNodo);
            fin=nuevoNodo;
        }
        tamaño++;
    }

    public Object desencolar(){
        if (esVacia()){
            throw new IllegalStateException("La cola está vacía");
        }
        Object datoDesencolar=frente.getDato();
        frente=frente.getSiguente();
        tamaño--;
        return datoDesencolar;
    }
    public Object frente(){
        if (esVacia()){
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.getDato();
    }
    public int tamaño(){
        return tamaño;
    }
    public boolean esVacia(){
        return tamaño==0;
    }
}
