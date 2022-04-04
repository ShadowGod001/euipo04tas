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
public class TNodo<T> {
    private final Comparable etiqueta;
    private final T dato;
    private TNodo<T> siguiente;
    
    public TNodo(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }
    
    public T getDato() {
        return this.dato;
    }
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }
    public TNodo<T> getSiguiente() {
        return this.siguiente;
    }
    public void setSiguiente(TNodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public TNodo<T> Copia() {
        return new TNodo<T>(this.etiqueta, this.dato);
    }
    
    public String toString() {
        return this.etiqueta + " " + this.dato + " ";
    }
}
