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
        
        Almacen lista = new Almacen();
        
        System.out.println(lista.uppdateAltas());
        System.out.println(lista.listarStock());
        System.out.println("------------------------------------");
        
        System.out.println(lista.uppdateVentas());
        System.out.println(lista.listarStock());
        System.out.println("------------------------------------");
        
        System.out.println(lista.uppdateEliminados());
        System.out.println(lista.listarStock());
    }
}
