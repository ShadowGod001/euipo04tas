/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ta1.ut3;

import java.util.Arrays;


/**
 *
 * @author ingFo
 */
public class Almacen {
    private final TLista<Producto> productos;
    
    public Almacen() {
        this.productos = new TLista();
    }
    
    public void agregarProducto(Producto p) {
        TNodo newNodo = new TNodo(p.codigo, p);
        this.productos.insertarAlInicio(newNodo);
    }
            
    public void agregarStock(int aAumentar, String codigo) {
        Producto p = this.productos.buscar(codigo).getDato();
        p.stock += aAumentar;
    }
    
    public float reducirStock(int aReducir, String codigo) {
        if (this.productos.buscar(codigo) == null) {
            System.out.println("No encontrado" + codigo);
            return 0;
        }
        Producto p = this.productos.buscar(codigo).getDato();
        float antesDelCambio = p.stock;
        p.stock -= aReducir;
        if (p.stock < 0) {
            p.stock = 0;
        }
                
        return (antesDelCambio - p.stock) * p.precio;
    }
    
    public float eliminarDelStock(String codigo) {
        float totalEliminado = 0;
        TNodo<Producto> eliminado = this.productos.eliminar(codigo);
        if (eliminado != null) {
            totalEliminado = eliminado.getDato().stock * eliminado.getDato().precio;
        }
        return totalEliminado;
    }
    
    public TNodo<Producto> buscar(Comparable etiqueta) {
        return this.productos.buscar(etiqueta);
    }
    
    public String listarStock() {
        return this.productos.toString();
    }
    
    public String listarStockOrdenado() {
        return this.productos.copiaOrdenada().toString();
    }
    
    public float uppdateAltas() {
        String[] productosToAdd = ManejadorArchivosGenerico.leerArchivo("C:\\Users\\ingFo\\OneDrive\\Escritorio\\GIT\\euipo04tas\\UT3_TA1\\src\\main\\java\\ta1\\ut3\\altasPrueba.txt");
        float total = 0;
        for (int i=0; i<productosToAdd.length; i++) {
            String[] splited = productosToAdd[i].split(",");
            
            String codigo = splited[0];
            String nombre = splited[1];
            float precio = Float.parseFloat(splited[2]);
            int cantidad = Integer.parseInt(splited[3]);
            
            if (this.buscar(codigo) == null) {
                Producto newP = new Producto(precio, nombre, codigo, cantidad);
                this.agregarProducto(newP);
            } else {
                this.agregarStock(cantidad, codigo);
            }
            
            total += precio * cantidad;
        }
        return total;
    }
    
    public float uppdateVentas() {
        // LA RUTA RELATIVA NO FUNCIONA CORRECTAMENTE POR ERROR DEL COMPILADOR
        String[] productosToUppdate = ManejadorArchivosGenerico.leerArchivo("C:\\Users\\ingFo\\OneDrive\\Escritorio\\GIT\\euipo04tas\\UT3_TA1\\src\\main\\java\\ta1\\ut3\\ventasPrueba.txt");
        float total = 0;
        
        for (int i = 0; i<productosToUppdate.length; i++) {
            String[] splited = productosToUppdate[i].split(",");
            
            String codigo = splited[0];
            int cantidadDeVenta = Integer.parseInt(splited[1]);
            
            total += this.reducirStock(cantidadDeVenta, codigo);
            
        }
        
        return total;
    }
    
    public float uppdateEliminados() {
        // LA RUTA RELATIVA NO FUNCIONA CORRECTAMENTE POR ERROR DEL COMPILADOR
        String[] productosAEliminar = ManejadorArchivosGenerico.leerArchivo("C:\\Users\\ingFo\\OneDrive\\Escritorio\\GIT\\euipo04tas\\UT3_TA1\\src\\main\\java\\ta1\\ut3\\elimPrueba.txt");
        float total = 0;
        
        for (int i=0; i<productosAEliminar.length; i++) {
            total += this.eliminarDelStock(productosAEliminar[i]);
        }
        return total;
    }
}
