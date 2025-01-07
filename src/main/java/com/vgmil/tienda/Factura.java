
package com.vgmil.tienda;
/**
 *
 * @author V6M1000
 * 
 * Modelo de Factura necesario para el sistema
 */
public class Factura {
    private Cliente cliente;
    private Producto productos[];
    private double iva;
    private double subtotal;
    private double total;
    
    /*Sobrecarga de Constructor*/
    //Factura con Datos

    public Factura(Cliente cliente, Producto[] productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.iva=0;
        this.subtotal=0;
        this.total=0;
    }
    
    //Factura sin Datos
    public Factura() {}
   
    //Seccion de metodos de Factura
    public int getCantidadProductos(){
        return productos.length;
    }
   //Ahora que tenemos productos hacer operaciones mas complejas son mucho mas sencillas
    public Producto searchProductoById(int id){
        for (int i = 0; i < productos.length; i++) {
            if(productos[i].getId() == id){
                return productos[i];
            }
        }
        return null;
    }
    //Listar Productos compete de factura antes estaba en controlador.
    public String listProductos(){
        String list ="";
        for (int i = 0; i < productos.length; i++) {
            //Mucho mas optimizado
            list += "\n"+productos[i].toString();
        }
        return list;
    }
    public void calculateSubTotal(){
        for (int i = 0; i < productos.length; i++) {
            this.subtotal += productos[i].getPrecio();
        }
    }
    public void calculateIVA(int percentage){
        this.iva = this.subtotal*(percentage/100.0);
    }
    public void calculateTotal(){
        this.total = this.subtotal + this.iva;
    }
    @Override
    public String toString() {
        return "Cliente: "+this.cliente.toString()+
                "\nProductos:\n"+
                listProductos()+
                "\nSubtotal: "+this.subtotal+
                "\nIVA: "+ this.iva+
                "\nTotal:"+this.total;
    }
    
    
/*----------------Setters----------------*/
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //NOTA: No se puede hacer set del IVA, Subtotal, Total puesto que se calculan.
    
    /*----------------Getters----------------*/
    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }


    

    
    
    
}
