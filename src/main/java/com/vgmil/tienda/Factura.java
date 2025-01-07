
package com.vgmil.tienda;
/**
 *
 * @author V6M1000
 * 
 * Modelo de Factura necesario para el sistema
 */
public class Factura {
    Cliente cliente;
    int idsProducto[];
    String nombresProducto[];
    double precioProducto[];
    /*Sobrecarga de Constructor*/
    //Factura con Datos
    public Factura(Cliente cliente, int[] idsProducto, String[] nombresProducto, double[] precioProducto) {
        this.cliente = cliente;
        this.idsProducto = idsProducto;
        this.nombresProducto = nombresProducto;
        this.precioProducto = precioProducto;
    }
    //Factura sin Datos
    public Factura() {}

/*----------------Setters----------------*/
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setIdsProducto(int[] idsProducto) {
        this.idsProducto = idsProducto;
    }

    public void setNombresProducto(String[] nombresProducto) {
        this.nombresProducto = nombresProducto;
    }

    public void setPrecioProducto(double[] precioProducto) {
        this.precioProducto = precioProducto;
    }

    
    /*----------------Getters----------------*/
    public Cliente getCliente() {
        return cliente;
    }

    public int[] getIdsProducto() {
        return idsProducto;
    }

    public String[] getNombresProducto() {
        return nombresProducto;
    }

    public double[] getPrecioProducto() {
        return precioProducto;
    }
    
    
}
