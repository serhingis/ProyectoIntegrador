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
public class Comprador extends Persona {
    
    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public Comprador(String nombre, String apellido, String nroDocumento, double presupuesto) { 
        
        super(nombre, apellido, nroDocumento);
        this.presupuesto = presupuesto;

}
    
    @Override
    public String toString(){
        return "-- Comprador -- \n Nombre: " + this.getNombre() + "\n Apellido: " + this.getApellido() + "\n Documento: " + this.getNumeroDocumento() + "\n Presupuesto: " + this.presupuesto;
    }
    
}
