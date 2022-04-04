/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ta1.ut3;

/**
 *
 * @author ingFo
 */
public class Producto {
    float precio;
    String nombre;
    Comparable codigo;
    int stock;
    
    public Producto(float precio, String nombre, Comparable codigo, int stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }
    
    public String toString() {
        return "Precio: " + this.precio + " Nombre: " + this.nombre + " Codigo: " + this.codigo + " Stock: " + this.stock;
    }
}
