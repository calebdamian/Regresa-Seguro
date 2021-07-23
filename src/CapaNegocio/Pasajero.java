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
public class Pasajero {
    //Atributos
	
    private String nombre;

    private String apellido;
    
    private String nacionalidad;

    private String ciudadOrigenViaje;

    private String correoElectronico;

    private String numeroContacto;

    private String numeroPasaporte;

    private boolean genero;
    
    private String destinoFinalViaje;
    
    private Formulario formulario;

    //Métodos 
    
    //Constructores
    /**
     * Constructor por defecto de la clase Pasajero. <br>
     * <b>post: Método constructor </b>  <br>
     *
     */
    public Pasajero() {
    }
    /**
     * Constructor por parámetros de la clase Pasajero, recibe por parámetro tos sus atributos EXCEPTO formulario. <br>
     * <b>post: Método constructor </b>  <br>
     *
     */
   //Constructores por parametros
    public Pasajero(String nombre, String apellido, String nacionalidad, String ciudadOrigenViaje, String correoElectronico, String numeroContacto, String numeroPasaporte, boolean genero, String destinoFinalViaje) {
    setNombre(nombre);
    setApellido(apellido);
    setNacionalidad(nacionalidad);
    setCiudadOrigenViaje(ciudadOrigenViaje);
    setCorreoElectronico(correoElectronico);
    setNumeroContacto(numeroContacto);
    setNumeroPasaporte(numeroPasaporte);
    setGenero(genero);
    setDestinoFinalViaje(destinoFinalViaje);
    }
    
    //Métodos set
    /**
     * Establece el nombre para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Establece el apellido para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Establece la nacionalidad para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    /**
     * Establece el correo electrónico para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setCorreoElectronico(String correoElectronico) {
       this.correoElectronico = correoElectronico;
    }
    /**
     * Establece el  numero de contacto para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    /**
     * Establece el numero de pasaporte para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    /**
     * Establece el género para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
    public void setGenero(boolean genero) {
       this.genero = genero;
    }
    /**
     * Establece la ciudad de destino final para un pasajero. No retorna valor. <br>
     * <b>post: Método set </b>  <br>
     *
     */
   public void setDestinoFinalViaje(String destinoFinalViaje) {
        this.destinoFinalViaje = destinoFinalViaje;
    }
   /**
    * Establece la ciudad de origen del viaje para un pasajero. No retorna valor. <br>
    * <b>post: Método set </b>  <br>
    *
    */
   public void setCiudadOrigenViaje(String ciudadOrigenViaje) {
  
        this.ciudadOrigenViaje = ciudadOrigenViaje;
    }
   /**
    * Establece el formulario para un pasajero. No retorna valor. <br>
    * <b>post: Método set </b>  <br>
    *
    */
   public void setFormulario(Formulario formulario) {
	   this.formulario = formulario;
   }
    
    
    //Métodos get 
   /**
    * Retorna el nombre de un pasajero.  <br>
    * <b>post: Método get </b>  <br>
    *
    */
    public String getNombre() {
        return nombre;
    }
    /**
     * Retorna el apellido de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Retorna la nacionalidad de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Retorna el correo electronico de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    /**
     * Retorna el numero de pasaporte de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    /**
     * Metodo que retorna cadena de caracteres según el valor del genero del pasajero, para identificar si es femenino o masculino<br>
     *  
     *
     */
    public String getGenero() {
        if(genero == true) {
        	return "Masculino";
        }else {
        	return "Femenino";
        }
    }
    /**
     * Retorna el numero de contacto de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public String getNumeroContacto() {
    	return numeroContacto;
    }
  
    /**
     * Retorna el destino final del viaje de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
    public String getDestinoFinalViaje() {
        return destinoFinalViaje; 
    }
    /**
     * Retorna la ciudad de origen del viaje de un pasajero.  <br>
     * <b>post: Método get </b>  <br>
     *
     */
   public String getCiudadOrigenViaje() {
  
        return ciudadOrigenViaje;
    }
   /**
    * Retorna el formulario de un pasajero.  <br>
    * <b>post: Método get </b>  <br>
    *
    */
   public Formulario getFormulario() {
	   return formulario;
   }
    
   /**
    * Metodo que retorna un booleano según el valor del atributo destino final, para identificar si Ecuador es su ultima parada<br>
    *  
    *
    */
   public boolean verificarDestinoFinal() {
	if (formulario.getAvion().getCiudadDestino().equals(destinoFinalViaje)) {
		return true;
	}else {
		return false;
	}
}   
   /**
    * Metodo que retorna un booleano según el valor del atributo conexiones previas, para identificar si el pasajero pasó por otros destinos anteriores a la llegada al Ecuador<br>
    *  
    *
    */
   public boolean verificarConexionesPrevias() {
	if(formulario.getAvion().getCiudadOrigen().equals(ciudadOrigenViaje)) {
		return false;
	}
	else {
		return true;
	}
}
   /**
    * Metodo que retorna un string según el valor del metodo verificarConexionesPrevias<br>
    *  
    *
    */
  public String imprimirVerificacionConexionesPrevias() {
	
		   if(verificarConexionesPrevias() == false) {
				return("PASAJERO PRESENTA CONEXIONES PREVIAS.");
		   }else {
			   return("PASAJERO NO PRESENTA CONEXIONES PREVIAS.");
		   }
	}
  /**
    * Metodo que retorna un string según el valor del metodo verificarDestinoFinal<br>
    *  
    *
    */
  public String imprimirVerificacionDestinoFinal() {
			if(verificarDestinoFinal() == true) {
				return(getDestinoFinalViaje()+" ES SU DESTINO FINAL");
			}else {
				return("ESTE PASAJERO SE DIRIGE HACIA OTRO DESTINO.");
			}
  }
  /**
    * Metodo que retorna un string con la informacion de los atributos del formulario <br>
    *  
    *
    */
  public String imprimirFormulario(){
     return "\nLOS DATOS DEL FORMULARIO SON:"+formulario.toString();
  }
    @Override

    /**
     * Metodo toString que simplifica la impresion del objeto<br>
     *  
     *
     */
    public String toString() {
    	return ("\tDATOS PERSONALES:"+"\nNombre:"+nombre+" "+apellido+"\nGenero:"+getGenero()+"\nNacionalidad:"+nacionalidad+"\n\tDatos de contacto:"+"\nE-mail:"+correoElectronico+"\nNumero telefonico:"+numeroContacto+"\nNumero de pasaporte:"+numeroPasaporte+"\n"+imprimirVerificacionConexionesPrevias()+"\n"+imprimirVerificacionDestinoFinal());
    }
}
