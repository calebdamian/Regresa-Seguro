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
public class Sintomatologia {
    //Atributos
	
	    private boolean Fiebre;

	    private boolean DolorCabeza;

	    private boolean MalestarGeneral;

	    private boolean DificultadRespiratoria;

	    private boolean TosSeca;

	    //M�todos
	    
	    //Constructores
	    /**
	     * Construye una sintomatolog�a por defecto.  <br>
	     * <b>post: M�todo constructor. </b>  <br>
	     *
	     */
	    public Sintomatologia() {
	    }
	    /**
	     * Construye una sintomatolog�a por par�metros, ingresando valores para todos sus atributos.  <br>
	     * <b>post: M�todo constructor. </b>  <br>
	     *
	     */
	    public Sintomatologia(boolean Fiebre, boolean DolorCabeza, boolean MalestarGeneral, boolean DificultadRespiratoria, boolean TosSeca) {
	    	setFiebre(Fiebre);
	    	setDolorCabeza(DolorCabeza);
	    	setMalestarGeneral(MalestarGeneral);
	    	setDificultadRespiratoria(DificultadRespiratoria);
	    	setTosSeca(TosSeca);
	    }

	    /**
	     * Metodo que establece el valor del atributo Fiebre.<br>
	     *  
	     *
	     */
	    public void setFiebre(boolean Fiebre) {
	        this.Fiebre = Fiebre;
	    }
	    /**
	     * Metodo que establece el valor del atributo Dolor de cabeza.<br>
	     *  
	     *
	     */
	    public void setDolorCabeza(boolean DolorCabeza) {
	        this.DolorCabeza = DolorCabeza;
	    }
	    /**
	     * Metodo que establece el valor del atributo Malestar general.<br>
	     *  
	     *
	     */
	    public void setMalestarGeneral(boolean MalestarGeneral) {
	        this.MalestarGeneral = MalestarGeneral;
	    }
	    /**
	     * Metodo que establece el valor del atributo Dificultad respiratoria.<br>
	     *  
	     *
	     */
	    public void setDificultadRespiratoria(boolean DificultadRespiratoria) {
	        this.DificultadRespiratoria = DificultadRespiratoria;
	    }
	    /**
	     * Metodo que establece el valor del atributo Tos seca.<br>
	     *  
	     *
	     */
	    public void setTosSeca(boolean TosSeca) {
	        this.TosSeca = TosSeca;
	    }
	 
	    //M�todos de tipo String los cuales retornan una cadena de caracteres seg�n el valor del atributo (verdadero o falso)
	    /**
	     * Retorna uan cadena de caracteres seg�n el valor del atributo de Fiebre.  <br>
	     * <b>post: M�todo get. </b>  <br>
	     *
	     */
	    public String getFiebre() {
	        if (Fiebre == true) {
	        	return "Presenta fiebre";
	        }
	        else {
	        	return "No presenta fiebre";
	        }
	    }
	    /**
	     * Retorna uan cadena de caracteres seg�n el valor del atributo de dolor de cabeza.  <br>
	     * <b>post: M�todo get. </b>  <br>
	     *
	     */
	    public String getDolorCabeza() {
	    	if (DolorCabeza == true) {
	        	return "Presenta dolor de cabeza";
	        }
	        else {
	        	return "No presenta dolor de cabeza";
	        }
	    }
	    /**
	     * Retorna uan cadena de caracteres seg�n el valor del atributo de malestar general.  <br>
	     * <b>post: M�todo get. </b>  <br>
	     *
	     */
	    public String  getMalestarGeneral() {
	    	if (MalestarGeneral == true) {
	        	return "Presenta malestar general";
	        }
	        else {
	        	return "No presenta malestar general";
	        }
	    }
	    /**
	     * Retorna uan cadena de caracteres seg�n el valor del atributo de dificultades respiratorias.  <br>
	     * <b>post: M�todo get. </b>  <br>
	     *
	     */
	    public String  getDificultadRespiratoria() {
	    	if (DificultadRespiratoria == true) {
	        	return "Presenta dificultad respiratoria";
	        }
	        else {
	        	return "No presenta dificultad respiratoria";
	        }
	    }
	    /**
	     * Retorna uan cadena de caracteres seg�n el valor del atributo de tos seca.  <br>
	     * <b>post: M�todo get. </b>  <br>
	     *
	     */
	    public String  getTosSeca() {
	    	if (TosSeca == true) {
	        	return "Presenta tos";
	        }
	        else {
	        	return "No presenta tos";
	        }
	    }

	    /**
	     * Metodo que retorna el valor de la alerta seg�n los valores de los atributos<br>
	     *  
	     *
	     */
	    public boolean Alerta() {
	        if (Fiebre == true && DolorCabeza == true && MalestarGeneral == true && DificultadRespiratoria == true && TosSeca == true) {
	        	return true;
	        }
	        if (Fiebre == true && DolorCabeza == true && DificultadRespiratoria == true) {
	        	return true;
	        }
	        	else{
	        		return false;
	        	}
	    }
	    
	    @Override
	    
	    /**
	     * Metodo toString que simplifica la impresion del objeto.<br>
	     *  
	     *
	     */
	    public String toString() {
	    	return "\n"+getFiebre()+"\n"+getDificultadRespiratoria()+"\n"+getDolorCabeza()+"\n"+getMalestarGeneral()+"\n"+getTosSeca();
	    }
}
