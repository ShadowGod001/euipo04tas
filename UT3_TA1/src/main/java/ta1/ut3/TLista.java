/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ta1.ut3;

/**
 *
 * @author ingFo
 * @param <T>
 */
public class TLista<T> {
    private TNodo<T> primero;
    
    public void insertarAlInicio(TNodo<T> newNodo) {
        newNodo.setSiguiente(this.primero);
        this.primero = newNodo;
    }
    
    public void insertarAlFinal(TNodo<T> newNodo) {
        TNodo<T> aux = this.primero;
        if (aux == null) {
            this.primero = newNodo;
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(newNodo);
        }
    }
    
    public void insertarOrdenado(TNodo<T> newNodo) {
        TNodo<T> aux = this.primero;
        if (aux == null || newNodo.getEtiqueta().compareTo(aux.getEtiqueta()) < 0) {
            newNodo.setSiguiente(this.primero);
            this.primero = newNodo;
        } else {
            while (aux.getSiguiente() != null && aux.getSiguiente().getEtiqueta().compareTo(newNodo.getEtiqueta()) < 0) {
                aux = aux.getSiguiente();
            }
            newNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(newNodo);
        }
    }    
    
    public TNodo<T> buscar(Comparable etiqueta) {
        TNodo<T> aux = this.primero;
        while (aux != null) {
            if (aux.getEtiqueta() == etiqueta) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public TLista<T> copiaOrdenada() {
        TNodo aux = this.primero;
        TLista toReturn = new TLista();
        while (aux != null) {
            toReturn.insertarOrdenado(aux.Copia());
            aux = aux.getSiguiente();
        }
        return toReturn;
    }
    
    public String toString() {
        TNodo aux = this.primero;
        String toReturn = "";
        while (aux != null) {
            toReturn += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return toReturn;
    }
}
