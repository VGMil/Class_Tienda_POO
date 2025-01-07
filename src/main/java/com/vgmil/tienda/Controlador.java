
package com.vgmil.tienda;

import java.util.Scanner;

/**
 *
 * @author V6M1000
 * Primer Sistema donde se ejecutara todo el proceso
 */
public class Controlador {
    private Scanner leer;
    private Cliente myCliente = new Cliente();
    private Factura myFactura = new Factura();

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
        myFactura.setCliente(myCliente);
        System.out.println(myFactura.getCliente().toString());
        
    }
    
    public void insertarProductos(int cantidad){
        Producto[] listaProductos = new Producto[cantidad]; //Arreglo de productos
        Producto newProducto;
        int id;
        String nombre;
        double precio;
        int opcion=0;
        for (int i = 0; i < cantidad; i++) {
            //Seleccionar que categoria es del producto
            do{
                System.out.println("Ingrese un numero del Menu para seleccionar la categoria del producto");
                System.out.println("1) Software");
                System.out.println("2) Electronica");
                opcion = leer.nextInt();
            }while(opcion != 1 && opcion !=2);
            
            //Datos de producto normal
            System.out.println("ID Producto");
            id = leer.nextInt();
            System.out.println("Nombre del Producto");
            nombre = leer.next();
            System.out.println("Precio del Producto");
            precio = leer.nextDouble();
            
            
            //Factory: Crear un objeto segun la eleccion del cliente con ayuda del polimorfismo
            if(opcion == 1){
                System.out.println("¿Tiene Portada? Si o No");
                boolean portada = leer.next().equalsIgnoreCase("si");
                System.out.println("Autor del Producto");
                String autor = leer.next();
                newProducto = new ProductoSoftware(portada, autor, id, nombre, precio);
            }else{
                System.out.println("¿Tiene Manual? Si o No");
                boolean manual = leer.next().equalsIgnoreCase("si");
                System.out.println("Empresa Creadora del Producto");
                String empresa = leer.next();
                newProducto = new ProductoElectronica(manual, empresa, id, nombre, precio);
            }
            //Insertar el nuevo producto en la lista de Productos del cliente
            listaProductos[i]=newProducto;
            //Insertar nuestra lista en la factura
            myFactura.setProductos(listaProductos);
        }
    }
    
    public void imprimirFactura(){
        myFactura.calculateSubTotal();
        myFactura.calculateIVA(12);
        myFactura.calculateTotal();
        
        System.out.println(myFactura.toString());
    }

    
    
}
