/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.pruebas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;

/**
 *
 * @author educacionit
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Auto a1 = new Auto("Ford", "Fiesta Kinetic Design", "Blanco", 300, 460, 130);
        System.out.println(a1);
        
        System.out.println();
        
        Comprador c1 = new Comprador("Juan", "Perez", "12.345.678", 103.000);
        System.out.println(c1);
        
        System.out.println();
        
        Vendedor v1 = new Vendedor("Jose", "Gomez", "15.555.666", 65);
        System.out.println(v1);
        
        System.out.println();
    }
            
    
}
