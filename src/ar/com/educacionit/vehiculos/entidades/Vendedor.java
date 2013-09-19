/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;

/**
 *
 * @author educacionit
 */
public class Vendedor extends Persona {
    
    private int cantAutosVendidos;

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }
    
    public Vendedor(String nombre, String apellido, String nroDocumento, int cantAutosVendidos) { 
        
        super(nombre, apellido, nroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;

}

    @Override
    public String toString(){
        return "-- Vendedor -- \n Nombre: " + this.getNombre() + "\n Apellido: " + this.getApellido() + "\n Documento: " + this.getNumeroDocumento() + "\n Cant. Autos Vend: " + this.cantAutosVendidos;
    }
    
}
