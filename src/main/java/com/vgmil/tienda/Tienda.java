
package com.vgmil.tienda;

import java.util.Scanner;

/**
 *
 * @author V6M1000
 */
public class Tienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Controlador controlador = new Controlador(leer);
        
       byte opcion = 0;
       do{
           System.out.println("Tienda Polimorfica");
           System.out.println("1. Ingresar Cliente");
           System.out.println("2. Insertar Productos");
           System.out.println("3. Imprimir Factura");
           opcion = leer.nextByte();
           switch (opcion) {
               case 1:
                   controlador.iniciarCliente();
                   break;
                case 2:
                    System.out.println("Ingrese cantidad de Productos a registrar");
                    byte cantidad = leer.nextByte();
                   controlador.insertarProductos(cantidad);
                   break;
                case 3:
                   controlador.imprimirFactura();
                   break;
                case 4:
                    System.out.println("Gracias por usar nuestro sistema");
                   break;
               default:
                   System.out.println("Ingrese numero valido");
           }
       }while(opcion <= 3);
        
       
    }
}
