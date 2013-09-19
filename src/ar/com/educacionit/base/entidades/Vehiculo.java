package ar.com.educacionit.base.entidades;

/**
 * Vehículo
 * @author Sergio Fernandez
 * @since 12/09/2013
 * 
 */
public abstract class Vehiculo {
    
    private int alto;
    private int ancho;
    private int largo;
   
    /**
     *  Constructor por defecto
     */
    public Vehiculo() {
    }

    /**
     * Crear nuevo vehículo a partir de los parámetros
     * @param alto El alto del vehículo
     * @param ancho El ancho del vehículo
     * @param largo El largo del vehiculo
     */
    public Vehiculo(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    /**
     *  Retorna alto del vehículo
     * @return int Alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Establece el alto del vehículo
     * @param alto int Alto del vehículo
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * Retorna el ancho del vehículo
     * @return int ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Establece el ancho del vehículo
     * @param int ancho 
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * Retorna el largo del vehículo
     * @return int largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Establece el largo del vehículo
     * @param int largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    
}
