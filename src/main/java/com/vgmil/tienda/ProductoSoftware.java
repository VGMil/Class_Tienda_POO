
package com.vgmil.tienda;

/**
 *
 * @author V6M1000
 */
public class ProductoSoftware extends Producto{
    boolean portada;
    String autor;

    public ProductoSoftware(boolean portada, String autor, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.portada = portada;
        this.autor = autor;
    }
    
    public ProductoSoftware() {}

    @Override
    public String toString() {
        return super.toString()+"portada: " + this.portada + ", autor: " + this.autor;
    }

    public void setPortada(boolean portada) {
        this.portada = portada;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getPortada() {
        return portada;
    }

    public String getAutor() {
        return autor;
    }
}
