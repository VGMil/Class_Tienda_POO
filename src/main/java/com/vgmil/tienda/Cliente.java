
package com.vgmil.tienda;
/**
 *
 * @author V6M1000
 * 
 * Modelo de Cliente necesario para el sistema
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    
    /*Sobrecarga de Constructor*/
    //Generar Cliente con datos 
    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    public Cliente() {} //Generar Cliente sin datos
    
    //Seccion para metodos del Cliente
    
    //Sobreescritura del metodo de la SuperClase Object ToString
    @Override
    public String toString(){
        return "Cedula: "+this.cedula+" - Nombres: "+this.nombre+" "+this.apellido;
    }

/*----------------Setters----------------*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

/*----------------Getters----------------*/
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }
}
