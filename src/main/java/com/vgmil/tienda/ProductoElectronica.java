
package com.vgmil.tienda;

/**
 *
 * @author V6M1000
 */
public class ProductoElectronica extends Producto{
    boolean manual;
    String empresa;

    public ProductoElectronica(boolean manual, String empresa, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.manual = manual;
        this.empresa = empresa;
    }
    
    public ProductoElectronica() {}

    @Override
    public String toString() {
        return super.toString()+ ","+ "Manual: " + this.manual + ", Empresa: " + this.empresa;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean getManual() {
        return manual;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    
        
    
    

    
}
