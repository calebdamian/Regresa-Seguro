/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Czleb
 */
public class Avion {
    //Atributos
	
    private int numeroPasajeros;

    private String horaLlegada;

    private int numeroVuelo;
    
    private String ciudadDestino;
    
    private String ciudadOrigen;
    
    

   //Metodos 
    
    /**
     * Construye el avi�n. <br>
     * <b>post: </b>  <br>
     *
     */
    public Avion() {
    }
    /**
     * Construye el avi�n. <br>
     * <br>post: Segun sus parametros, en este caso numero de pasajeros, fecha de llegada, hora de llegada y numero de vuelo  <br>
     *
     */
    public Avion(int numeroPasajeros,String horaLlegada, int numeroVuelo, String ciudadOrigen, String ciudadDestino) {
    	setNumeroPasajeros(numeroPasajeros);
    	setHoraLlegada(horaLlegada);
    	setNumeroVuelo(numeroVuelo);
    	setCiudadOrigen(ciudadOrigen);
    	setCiudadDestino(ciudadDestino);
    	
    }
    /**
     * Establece el numero de pasajeros <br>
     *  
     *
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
  
    /**
     * Establece la hora de llegada <br>
     *  
     *
     */
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    /**
     * Establece el numero de vuelo en el cual se movilizo el pasajero <br>
     *  
     *
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }
    /**
     * Establece la ciudad de la cual proviene el vuelo en el cual se movilizo el pasajero <br>
     *  
     *
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    /**
     * Establece la ciudad a la cual se dirije el vuelo en el cual se movilizo el pasajero <br>
     *  
     *
     */
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    /**
     * Retorna una cadena de caracteres especificando el numero de pasajeros<br>
     *  
     *
     */
    public String getNumeroPasajeros() {
        return "El numero de pasajeros actual es de "+numeroPasajeros;
    }

    /**
     * Retorna una cadena de caracteres especificando la hora de llegada<br>
     *  
     *
     */
    public String getHoraLlegada() {
        return horaLlegada;
    }
    /**
     * Retorna un entero representando el numero de vuelo<br>
     *  
     *
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Establece la ciudad a la cual se dirije el vuelo en el cual se movilizo el pasajero <br>
     *  
     *
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    
    /**
     * Establece la ciudad a la cual se dirije el vuelo en el cual se movilizo el pasajero <br>
     *  
     *
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

/**
 * Metodo para impresion del objeto Avion<br>
 *  
 *
  */
@Override

public String toString() {
	return ("\nNumero de vuelo:"+numeroVuelo+"\nNumero de pasajeros que viajaron en el vuelo:"+numeroPasajeros+"\nHora de llegada:"+horaLlegada+"\nDestino del vuelo:"+ciudadDestino+"\nOrigen del vuelo:"+ciudadOrigen);
}
}
