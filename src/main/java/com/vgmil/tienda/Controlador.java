
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
    Factura myFactura = new Factura();

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
    
    public void insertarProductos(int cantidad){
        int idsProducto[] = new int[cantidad];
        String nombresProducto[] = new String[cantidad];
        double preciosProducto[] = new double[cantidad];
        //Corregir, no ayuda a que en un futuro se maneje mas productos para el cliente
        //Plantear que sucediera con este bucle, no podemos crear una lista de productos general
        //deberiamos crear un objeto producto incluso para operar con el
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ID Producto");
            idsProducto[i] = leer.nextInt();
            System.out.println("Nombre del Producto");
            nombresProducto[i] = leer.next();
            System.out.println("Precio del Producto");
            preciosProducto[i] = leer.nextDouble();
        }
        
        //Primero llenamos los vectores y luego podemos insertarlos en la factura
        myFactura.setIdsProducto(idsProducto);
        myFactura.setNombresProducto(nombresProducto);
        myFactura.setPreciosProducto(preciosProducto);
        //y si ahora quiero añadir, modificar o borrar cosas nuevas tengo que modificar todo. 
        //ID, Nombre, precio y si hubieran mas ... ? 
    }
    
    public void revisarProductos(){
        int idsProducto[] = myFactura.getIdsProducto();
        String nombresProducto[] = myFactura.getNombresProducto();
        double precioProducto[] = myFactura.getPreciosProducto();
        for (int i = 0; i < myFactura.getCantidadProductos(); i++) {
            System.out.println("ID: "+idsProducto[i]+" Nombre: "+nombresProducto[i]+" Precio: "+precioProducto[i]);
        }
    }
    
    
}
