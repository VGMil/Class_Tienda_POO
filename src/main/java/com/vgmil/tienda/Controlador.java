
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
        Producto[] listaProductos = new Producto[cantidad]; //Arreglo de productos
        Producto newProducto = new Producto(); //nuevo producto
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ID Producto");
            newProducto.setId(leer.nextInt());
            System.out.println("Nombre del Producto");
            newProducto.setNombre(leer.next());
            System.out.println("Precio del Producto");
            newProducto.setPrecio(leer.nextDouble());
            //Insertar el nuevo producto en la lista de Productos del cliente
            listaProductos[i]=newProducto;
            //Insertar nuestra lista en la factura
            myFactura.setProductos(listaProductos);
        }
    }
    
    public void revisarProductos(){
        for (int i = 0; i < myFactura.getCantidadProductos(); i++) {
            //Mucho mas optimizado
            System.out.println(myFactura.getProductos()[i].toString());
        }
    }
    
    
}
