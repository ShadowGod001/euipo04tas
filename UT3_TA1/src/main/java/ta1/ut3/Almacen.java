/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ta1.ut3;

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
            
    public void agregarStock(int newStock, String codigo) {
        Producto p = this.productos.buscar(codigo).getDato();
        p.stock += newStock;
    }
    
    public void reducirStock(int newStock, String codigo) {
        Producto p = (Producto)this.productos.buscar(codigo).getDato();
        p.stock -= newStock;
    }
    
    public String listarStock() {
        return this.productos.toString();
    }
    
    public String listarStockOrdenado() {
        return this.productos.copiaOrdenada().toString();
    }
}
