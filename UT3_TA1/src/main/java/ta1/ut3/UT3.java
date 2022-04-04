/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ta1.ut3;

/**
 *
 * @author ingFo
 */
public class UT3 {

    public static void main(String[] args) {
        Producto p1 = new Producto(0, null, 1, 0);
        Producto p2 = new Producto(0, null, 2, 0);
        Producto p3 = new Producto(0, null, 3, 0);
        Producto p4 = new Producto(0, null, 4, 0);
        
        Almacen lista = new Almacen();
        lista.agregarProducto(p1);
        lista.agregarProducto(p2);
        lista.agregarProducto(p3);
        lista.agregarProducto(p4);
        
        System.out.println(lista.listarStock());
        System.out.println(lista.listarStockOrdenado());
        System.out.println(lista.listarStock());
    }
}
