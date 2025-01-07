
package com.vgmil.tienda;

/**
 *
 * @author V6M1000
 * 
 * Modelo necesario para el Sistema
 */
public class Producto {
    int id;
    String nombre;
    double precio;
    
    /*Sobrecarga de Constructor*/
    //Generar Cliente con datos 
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Generar Cliente sin datos
    public Producto() {}
    
    //Seccion para metodos del Cliente
    
    //Sobreescritura del metodo de la SuperClase Object ToString
    @Override
    public String toString() {
        return "id:" + id + ", nombre=" + nombre + ", precio=" + precio;
    }
    /*----------------Setters----------------*/

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*----------------Getters----------------*/

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
}
