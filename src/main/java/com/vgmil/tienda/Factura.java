
package com.vgmil.tienda;
/**
 *
 * @author V6M1000
 * 
 * Modelo de Factura necesario para el sistema
 */
public class Factura {
    Cliente cliente;
    Producto productos[];
    /*Sobrecarga de Constructor*/
    //Factura con Datos

    public Factura(Cliente cliente, Producto[] productos) {
        this.cliente = cliente;
        this.productos = productos;
    }
    
    //Factura sin Datos
    public Factura() {}
   
    //Seccion de metodos de Factura
    public int getCantidadProductos(){
        return productos.length;
    }
    
/*----------------Setters----------------*/
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    /*----------------Getters----------------*/
    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    
    
    
}
