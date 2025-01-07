
package com.vgmil.tienda;

import java.util.Scanner;

/**
 *
 * @author V6M1000
 * Primer Sistema donde se ejecutara todo el proceso
 */
public class Controlador {
    Scanner leer;
    Cliente myCliente = new Cliente();
    //Factura myFactura = new Factura();

    public Controlador(Scanner leer) {
        this.leer = leer;
    }
    
    public void iniciarCliente(){
        System.out.println("Ingrese Nombre del Cliente");
        myCliente.setNombre(leer.next());
        System.out.println("Ingrese Apellido del Cliente");
        myCliente.setApellido(leer.next());
        System.out.println("Ingrese Cedula del Cliente");
        myCliente.setCedula(leer.next());
        
        System.out.println("Cliente Creado con Exito");
        System.out.println(myCliente.toString());
    }
    
    
}
