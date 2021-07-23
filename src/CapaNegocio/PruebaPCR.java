/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Czleb
 */
public class PruebaPCR {
    
		 private Date fechaPruebaPCR = new Date();

		 private boolean Resultado;

		 
		//Métodos
		 
		 /**
		     * Construye un objeto de Prueba PCR <br>
		     *  
		     *
		     */
		    public PruebaPCR() {
		    }
		    /**
		     * Construye el objeto Prueba PCR segun sus parametros, en este caso fecha y resultado de la prueba<br>
		     *  
		     *
		     */
		    public PruebaPCR(Date fechaPruebaPCR, boolean Resultado) {
		    setFechaPruebaPCR(fechaPruebaPCR);
		    setResultado(Resultado);
		    }
		  

		    
	
		    //Metodos set 
		    /**
		     * Establece la fecha de la prueba PCR.  <br>
		     * <b>post: Método set </b>  <br>
		     *
		     */
		    public void setFechaPruebaPCR(Date fechaPruebaPCR) {
		    	this.fechaPruebaPCR = fechaPruebaPCR;
		    }
		    /**
		     * Establece el resultado de la prueba PCR.  <br>
		     * <b>post: Método set </b>  <br>
		     *
		     */
		    public void setResultado(boolean Resultado) {
		    	this.Resultado = Resultado;
		    }
		    //Metodos get
		    /**
		     * Retorna una cadena de caracteres según el resultado de la prueba PCR.  <br>
		     * <b>post: Método get </b>  <br>
		     *
		     */
		    public String getResultado() {
		    	if (Resultado == false) {
			    	return "Resultado negativo";
			    }
		    	else {
			    	return "Resultado positivo";
			    }
		    }
		    /**
		     * Retorna la fecha de la prueba PCR.  <br>
		     * <b>post: Método get </b>  <br>
		     *
		     */

		    public Date getFechaPruebaPCR() {
				return fechaPruebaPCR;
			}
		    //Metodo para retornar los valores de verdadero o falso según el resultado de la prueba
		    /**
		     * Retorna un booleano dependiendo del resultado de la prueba PCR.  <br>
		     * <b>post: Método get </b>  <br>
		     *
		     */
		    public boolean booleanResultado() {
		    	if (Resultado == false) {
		    		return false;
		    	}
		    	return true;
		    }
		    /**
		     * Retorna el resultado de verificar si la prueba PCR realizada al pasajero es valida con respecto a la fecha del sistema.<br>
		     *  
		     *
		     */
		    public String verificarValidez() {
		    	
		    	Date fechaActual = new Date();
		    	int milisegundosAlDia = 86400000;
		    	if(((fechaActual.getTime()-fechaPruebaPCR.getTime())/milisegundosAlDia)>10) {
		    		return "La Prueba PCR es obsoleta con respecto a la fecha actual.";
		    	}else {
		    		return "La Prueba PCR es válida con respecto a la fecha actual.";
		    	}
		    }
		
		    
		
		
			@Override
		    
		    /**
		     * Método toString que simplfica la impresión de los atributos de la  PruebaPCR<br>
		     *  
		     *
		     */
		    public String toString() {
		    	return "\n"+getResultado()+"\nFecha en la que se realizo la prueba PCR:"+getFechaPruebaPCR()+"\n"+verificarValidez();
		    }
}
