
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
        //Omitir Menu para pruebas
        controlador.iniciarCliente();
        controlador.insertarProductos(1);
        controlador.revisarProductos();
    }
}
