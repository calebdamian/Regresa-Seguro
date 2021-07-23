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
public class Formulario {
    //Atributos
    
    
    private Sintomatologia sintomatologia;
    
    private PruebaPCR pruebaPCR;
    
    private Avion avion;
 
    
    //Constructores
   
    /**
     * Construye un formulario por defecto. <br>
     * <b>post: Método constructor </b>  <br>
     *
     */
    public Formulario() {
    }

     //Métodos set
    /**
     * Establece la sintomatología para el formulario. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
        public void setSintomatologia(Sintomatologia sintomatologia) {
            this.sintomatologia = sintomatologia; 
             
         }
        /**
         * Establece un avión para el formulario. No retorna valor. <br>
         * <b>post: Método set </b>  <br>
         *
         */   
        
         public void setAvion(Avion avion) {
         	this.avion = avion;
         }
         /**
          * Establece una prueba PCR para el formulario. No retorna valor. <br>
          * <b>post: Método set </b>  <br>
          *
          */
         public void setPruebaPCR(PruebaPCR pruebaPCR) {
         	this.pruebaPCR = pruebaPCR;
         }
         
         
         
    //Métodos get
         /**
          * Retorna la sintomatología ingresada en el formulario. <br>
          * <b>post: Método get </b>  <br>
          *
          */
    public Sintomatologia getSintomatologia() {
        return sintomatologia;
    }
    /**
     * Retorna el avion ingresada en el formulario. <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public Avion getAvion() {
    	return avion;
    }
    /**
     * Retorna la prueba PCR ingresada en el formulario. <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public PruebaPCR getPruebaPCR() {
    	return pruebaPCR;
    }
    
    //Métodos funcionales
    /**
     * Metodo que retorna cadena de caracteres según el valor de la alerta para identificarlo como covid-19 positivo o posible caso<br>
     *  
     *
     */
    public String obtenerEstadoAlerta() {
    	
    	if ( sintomatologia.Alerta() == true) {
    		return "\nPASAJERO EN ESTADO DE ALERTA POR SARS-COV 2 POSITIVO O POSIBLE CASO POSITIVO"+"\nPOR FAVOR AISLAR VUELO CON NUMERO:"+avion.getNumeroVuelo();
    		
    	}
    	if (pruebaPCR.booleanResultado() == true) {
    		return "\nPASAJERO EN ESTADO DE ALERTA POR SARS-COV 2 POSITIVO O POSIBLE CASO POSITIVO"+"\nPOR FAVOR AISLAR VUELO CON NUMERO:"+avion.getNumeroVuelo();
    	}
    	else {
    		return "\nPASAJERO NO SE ENCUENTRA EN ESTADO DE ALERTA";
    	}
    }
  
   /*public String pasajerosPorAvion(int numeroVuelo) {
	   
	   if(getAvion().getNumeroVuelo() == numeroVuelo) {
		   return 
	   }
	   
   }*/
    @Override

    /**
     * Metodo toString que simplifica la impresion del objeto<br>
     *  
     *
     */
    public String toString() {
    	return ("\tSINTOMATOLOGIA PRESENTADA:"+sintomatologia+"\n\tDATOS DEL VUELO:"+avion+"\n\tDATOS DE PRUEBA PCR:"+pruebaPCR+"\n**ESTADO DE ALERTA:**"+obtenerEstadoAlerta());
    }
}
