/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author educacionit
 */
public class Auto extends Vehiculo{
    
    private String marca;
    private String modelo;
    private String color;
    private Double precio;
    
    public Auto() {
        
    }
    
    public Auto(String marca, String modelo, String color, int largo, int ancho, int alto) {
        
        super(alto, ancho, largo);
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        
        
    }   
    
    @Override
    public String toString() {
        return marca + " " + modelo + " " + color + " " + super.getAlto() + " " + super.getAncho() 
                + " " + super.getLargo();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
