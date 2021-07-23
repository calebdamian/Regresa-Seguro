/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author Czleb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Pasajero[] pasajeros = new Pasajero[5];
	Avion[] vuelos = new Avion[5];	
		//Se declaran objetos para probar los requerimientos funcionales de la aplicacion rápidamente
		Formulario formularioquemado = new Formulario();
		Pasajero pasajeroQuemado = new Pasajero("Pepe Jose", "Gomez Almada", "Ecuatoriano", "Madrid", "juan@hotmail.com", "099227112", "1802758746", true, "Quito");
		agregarPasajero(pasajeros, pasajeroQuemado);
		buscarPasajero(pasajeros,"1802758746").setFormulario(formularioquemado);
		Sintomatologia sintomatologiax = new Sintomatologia(true, true, true, true,true);
		Date fechaPruebaPCRQuemada  = new Date(120, 0, 15);
		PruebaPCR pruebaPCRQuemada = new PruebaPCR(fechaPruebaPCRQuemada, false);
		buscarPasajero(pasajeros,"1802758746").getFormulario().setPruebaPCR(pruebaPCRQuemada);
		buscarPasajero(pasajeros,"1802758746").getFormulario().setSintomatologia(sintomatologiax);
		Avion avionQuemado = new Avion(7,"18:00", 117, "Madrid", "Quito");
		buscarPasajero(pasajeros,"1802758746").getFormulario().setAvion(avionQuemado);
		//Segunda quemada de datos
		Formulario formularioquemado2 = new Formulario();
		Pasajero pasajeroQuemado2 = new Pasajero("Bad Bunny", "Sampedro Ocaña", "Cubano", "Guayaquil", "pepe@gmail.com", "09992927124", "1", true, "Bogotá");
		agregarPasajero(pasajeros, pasajeroQuemado2);
		buscarPasajero(pasajeros,"1").setFormulario(formularioquemado2);
		Sintomatologia sintomatologia2 = new Sintomatologia(false, true, true, false,true);
		Date fechaPruebaPCRQuemada2  = new Date(119, 0, 15);
		PruebaPCR pruebaPCRQuemada2 = new PruebaPCR(fechaPruebaPCRQuemada2, true);
		buscarPasajero(pasajeros,"1").getFormulario().setPruebaPCR(pruebaPCRQuemada2);
		buscarPasajero(pasajeros,"1").getFormulario().setSintomatologia(sintomatologia2);
		Avion avionQuemado2 = new Avion(10,"18:00", 1023, "Londres", "Quito");
		buscarPasajero(pasajeros,"1").getFormulario().setAvion(avionQuemado2);
		//Fin de declaración de objetos quemados
		
		Scanner sc = new Scanner(System.in); //Se inicializa el objeto de la clase Scanner para leer entradas del usuario.
		int n = 0; //variable para controlar el menú

		do {
			menu(); //Se despliega el menú
			boolean errorMenu = true; //Se inicializa una variable para controlar los errores posibles en la entrada del usuario en cuanto al menú
			do {//Bloque repetitivo que verifica que el error deje de existir.
				
				try {	//Bloque try/catch para optimizar errores
					
						System.out.println("Pulse ENTER para continuar");
						sc.nextLine();
						System.out.println("Ingrese la opcion: ");
						n = sc.nextInt();
						errorMenu = false;
					}catch(InputMismatchException e) {
							System.out.println("HA INGRESADO UN CARACTER INVALIDO. POR FAVOR INGRESE UN NUMERO SEGUN LA OPCION A REALIZAR.");
						}
				
					}while(errorMenu== true); //Fin de bloque de validación 
                  
				while (n<= 0 || n>8) { //Bloque de validacion de entrada de opcion del menú
					System.out.println("Ingrese la opcion correctamente:");
					n = sc.nextInt();
				}//Fin de bloque de validación
                                
			sc.nextLine(); //Limpia el buffer del Scanner.
			
			switch(n) { //EMPIEZA el bloque Switch
			
			case 1: //Opción que permite el registro de un pasajero
				
				//Declaracion de variables 
				boolean genero = false;
				boolean error = true;
				int gen = 1;
				boolean Fiebre = false;
				boolean TosSeca = false;
				boolean DificultadRespiratoria = false;
				boolean DolorCabeza = false;
				boolean MalestarGeneral = false;
				boolean resultado= false;
				boolean extranjero = true;
				String numeroPasaporte = null;
                                                                             //Fin de declaración de variables
                         
				System.out.println("\nIngrese los nombres del pasajero:");
					String nombre = sc.nextLine();
                                 while(isNumeric(nombre)==true){
                                     System.out.println("\nIngrese los nombres del pasajero CORRECTAMENTE:");
					nombre = sc.nextLine();
                                 }                                                      
				System.out.println("Ingrese los apellidos del pasajero:");
					String apellido = sc.nextLine();
                                        while(isNumeric(apellido)==true){
                                     System.out.println("\nIngrese los apellidos del pasajero CORRECTAMENTE:");
					apellido = sc.nextLine();
                                 }    
				System.out.println("Ingrese la nacionalidad del pasajero:");
					String nacionalidad = sc.nextLine();
                                        while(isNumeric(nacionalidad)==true){
                                     System.out.println("\nIngrese la nacionalidad del pasajero CORRECTAMENTE:");
					nacionalidad = sc.nextLine();
                                 }    
				System.out.println("Ingrese la ciudad de donde proviene el vuelo del pasajero:");
					String ciudadOrigenViaje = sc.nextLine();
                                        while(isNumeric(ciudadOrigenViaje)==true){
                                     System.out.println("\nIngrese la ciudad CORRECTAMENTE:");
					ciudadOrigenViaje = sc.nextLine();
                                 }    
				System.out.println("Ingrese el destino final del pasajero: ");
					String destinoFinalViaje = sc.nextLine();
                                       while(isNumeric(destinoFinalViaje)==true){
                                     System.out.println("\nIngrese la ciudad CORRECTAMENTE:");
					destinoFinalViaje = sc.nextLine();
                                 }    
					System.out.println("Ingrese el e-mail del pasajero:");
					String correoElectronico = sc.nextLine();
					
					//Bloque de validacion para email usando clases PATTERN y MATCHER
					Pattern rfc2822 = Pattern.compile(
					           "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$"
					);
					while(!rfc2822.matcher(correoElectronico).matches()) {
						System.out.println("Ingrese el e-mail del pasajero CORRECTAMENTE:");
						correoElectronico = sc.nextLine();
					} 
					//Fin de bloque de validación para email
					
					if(nacionalidad.equals("Ecuatoriano") || nacionalidad.equals("Ecuatoriana")) {
						extranjero = false;
						System.out.println("\n\tPASAJERO ECUATORIANO.");
					}
					
					  System.out.println("Ingrese el numero de contacto del pasajero:");
						String numeroContacto = sc.nextLine();
					while(isNumeric(numeroContacto)==false || numeroContacto.length()>10) { //Bloque de validación para numeros telefónicos ecuatorianos.
						System.out.println("Ingrese el numero de contacto del pasajero CORRECTAMENTE: (Recuerde que son 10 digitos)");
						numeroContacto = sc.nextLine();
					}//Fin de validaciones para números telefónicos ecuatorianos.   
					if(extranjero == true) {
						System.out.println("Ingrese el numero del pasaporte del pasajero extranjero:");
					    numeroPasaporte = sc.nextLine();	
					    while(numeroPasaporte.length()>10 || numeroPasaporte.length()<5) {
					    	System.out.println("Ingrese el numero del pasaporte del pasajero CORRECTAMENTE, es decir un numero:");
						    numeroPasaporte = sc.nextLine();	
					    }
					    while(isNumeric(numeroPasaporte)==false) {
					    	System.out.println("Ingrese el numero del pasaporte del pasajero CORRECTAMENTE, es decir un numero:");
						    numeroPasaporte = sc.nextLine();	
					    }
					}else {
						System.out.println("Ingrese el numero del pasaporte del pasajero (Recuerde que debe coincidir con el numero de cedula ecuatoriana):");
					    numeroPasaporte = sc.nextLine();		
					    while(validadorDeCedula(numeroPasaporte)== false) { //Bloque de validación para números de pasaporte ecuatorianos
					    	System.out.println("Pasaporte inválido. Ingreselo correctamente.:");
						    numeroPasaporte = sc.nextLine();		
					    } //Fin de validación para numeros de pasaporte
					}
				    
				do {//Bloque repetitivo que verifica que el error deje de existir.
					try { //Bloque try/catch para optimizar errores
				System.out.println("Ingrese el genero del pasajero: (Ingrese 1 si es Masculino, y 2 si es Femenino.)");
						gen = sc.nextInt();
						while(gen < 1 || gen > 2) { //Bloque de validacion de error
							System.out.println("Entrada incorrecta. Ingrese 1 si es Masculino o 2 si es Femenino.");
							gen = sc.nextInt();
						}
						if(gen == 1) {
							genero= true;
						}else {
							genero = false;
						}
					error = false;
					}catch(InputMismatchException e) {
						System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE.");
						sc.nextLine();
					}
				}while(error == true);
				error = true;
				Pasajero pasajero = new Pasajero(nombre, apellido, nacionalidad, ciudadOrigenViaje, correoElectronico, numeroContacto, numeroPasaporte, genero, destinoFinalViaje); //Constructor de un pasajero
				if(buscarPasajero(pasajeros, numeroPasaporte)== null) {
					agregarPasajero(pasajeros, pasajero);//Se agrega el pasajero al sistema
				}else
					throw new Exception("PASAJERO YA EXISTE EN EL SISTEMA. SI DESEA MODIFICAR LOS DATOS DEL PASAJERO DIRIGASE A LA OPCION 5 DEL SISTEMA."); //se define un error propio para evitar que el programa sufra un crash
					
				do {//Bloque repetitivo que verifica que el error deje de existir.
					
					try { //Bloque try/catch para optimizar errores
							System.out.println("\nA CONTINUACION SE SOLICITAN SINTOMAS DEL PASAJERO:");
							System.out.println("Ingrese 1 si siente fiebre o 2 si no es asi:");
							int fb = sc.nextInt();
							while(fb < 1 || fb > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si siente fiebre o 2 si no es asi:");
								fb = sc.nextInt();
							}
									if(fb == 1) {
										Fiebre = true;
									}
							error = false;
						}catch(InputMismatchException e) {
							System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE.");
							sc.nextLine();
						}
						}while(error == true);
						error = true;
			do {//Bloque repetitivo que verifica que el error deje de existir.
				try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si siente malestar general o 2 si no es asi:");
							int malestar = sc.nextInt();
							while(malestar < 1 || malestar > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si siente malestar general o 2 si no es asi: ");
								malestar = sc.nextInt();
								}
									if(malestar == 1) {
										MalestarGeneral = true;
									}
							error = false;
					}catch(InputMismatchException e) {
						System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
						sc.nextLine();
					}
				}while(error ==true);
					error = true;
				
			do {//Bloque repetitivo que verifica que el error deje de existir.
				try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si tiene tos seca o 2 si no es asi:");
							int tos = sc.nextInt();
							while(tos < 1 || tos > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA.Ingrese 1 si tiene tos seca o 2 si no es asi: ");
								tos = sc.nextInt();
								}
									if(tos == 1) {
										TosSeca= true;
									}
							error = false;
					}catch(InputMismatchException e) {
						System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
						sc.nextLine();
					}
				}while(error == true);
				error = true;
			do {//Bloque repetitivo que verifica que el error deje de existir.
				try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si tiene dolor de cabeza o 2 si no es asi:");
							int dcbz = sc.nextInt();
							while(dcbz < 1 || dcbz > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si tiene dolor de cabeza o 2 si no es asi: ");
								dcbz = sc.nextInt();
							}
									if(dcbz == 1) {
										DolorCabeza= true;
									}
									error = false;
					}catch(InputMismatchException e) {
					System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
					sc.nextLine();
					}
				}while(error == true);
				error = true;
			
					do {//Bloque repetitivo que verifica que el error deje de existir.
							try{ //Bloque try/catch para optimizar errores
								System.out.println("Ingrese 1 si tiene dificultades respiratorias o 2 si no es asi:");
								int dresp = sc.nextInt();
								while(dresp < 1 || dresp > 2) { //Bloque de validacion de error
									System.out.println("ENTRADA INCORRECTA. Ingrese 1 si tiene dificultades respiratorias o 2 si no es asi: ");
									dresp = sc.nextInt();
									}
										if(dresp == 1) {
											DificultadRespiratoria= true;
										}
										error = false;
								}catch(InputMismatchException e) {
									System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
									sc.nextLine();
								}
							}while(error == true);
							error = true;
					do {//Bloque repetitivo que verifica que el error deje de existir.
						try { //Bloque try/catch para optimizar errores
							Formulario formulario = new Formulario(); //Constructor de clase Formulario 
							buscarPasajero(pasajeros,numeroPasaporte).setFormulario(formulario); //Establece el formulario para el pasajero ingresado
							Sintomatologia sintomatologia = new Sintomatologia(Fiebre, DolorCabeza, MalestarGeneral, DificultadRespiratoria, TosSeca);//Constructor de clase Sintomatologia
							buscarPasajero(pasajeros,numeroPasaporte).getFormulario().setSintomatologia(sintomatologia); //Establece la sintomatologia en el formulario del pasajero registrado
							
							error = false;
							}catch(NullPointerException e) {
								System.out.println("PASAJERO NO EXISTE EN EL SISTEMA. INTENTE NUEVAMENTE");
							}catch(InputMismatchException e) {
								System.out.println("ENTRADA INCORRECTA. INTENTE NUEVAMENTE");
							}
					
							}while(error == true);
				
					error = true;
				//Declaración de variables
				int dia = 0;
				int mes = 0;
				int anio = 0;
				//Fin declaración de variables
				
				
						System.out.println("\nA CONTINUACION SE SOLICITAN LOS DATOS DE LA PRUEBA PCR NECESARIA PARA INGRESAR AL PAIS:");
						System.out.println("Por favor ingrese la fecha en la que se realizó la prueba PCR:");
							do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
									System.out.println("Ingrese el dia:");
									dia = sc.nextInt();
												while(dia <= 0 || dia > 31) { //Bloque de validacion de error
													System.out.println("Ingrese el dia correctamente:");
													dia = sc.nextInt();
												}
								error = false;
								}catch(InputMismatchException e) {
									System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
									sc.nextLine();
								}
						}while(error == true);
						error = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
							try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el mes:");
							mes = sc.nextInt();
							mes--; //Se realiza esta resta debido a las caracteristicas de la clase Date
							if(mes == 1) {
								mes++; //Se realiza esta suma debido a las caracteristicas de la clase Date
							}
									while(mes<= 0 || mes > 12) { //Bloque de validacion de error
										System.out.println("Ingrese el mes correctamente:");
										mes = sc.nextInt();
										mes--; //Se realiza esta resta debido a las caracteristicas de la clase Date
										if(mes == 1) {
											mes++;
										}
									}
									error = false;
							}catch(InputMismatchException e) {
								System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								sc.nextLine();
							}
					}while(error == true);
						error = true;
					sc.nextLine();
						do {//Bloque repetitivo que verifica que el error deje de existir.
							try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el año:");
					    	anio = sc.nextInt();
					    	anio= (anio-1900); //Se realiza esta resta debido a las caracteristicas de la clase Date
							    	while(anio <= 0 || anio > 2021) { //Bloque de validacion de error
										System.out.println("Ingrese el año correctamente:");
										anio = sc.nextInt();
										anio= (anio-1900); //Se realiza esta resta debido a las caracteristicas de la clase Date
									}
							    	error = false;
							}catch(InputMismatchException e) {
								System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								sc.nextLine();
							}
					}while(error == true);
						Date fechaPruebaPCR  = new Date(anio, mes, dia); //Constructor de objeto de clase Date
						error = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
							try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el resultado de la prueba (1 si es Positiva o 2 si es Negativa):" );
						int resul = sc.nextInt();
						while(resul < 1 || resul > 2 ) { //Bloque de validacion de error
							System.out.println("Ingrese el resultado de la prueba correctamente (1 si es Positiva o 2 si es Negativa):" );
							resul = sc.nextInt();
						}
									if (resul == 1) {
										resultado = true;
									}
								 	error = false;
								 	
							}catch(InputMismatchException e) {
								System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								sc.nextLine();
							}
						}while(error == true);
						error = true;
						
						PruebaPCR pruebaPCR = new PruebaPCR(fechaPruebaPCR, resultado); //Constructor de objeto de clase Prueba PCR
						
						try { //Bloque try/catch para optimizar errores
						buscarPasajero(pasajeros,numeroPasaporte).getFormulario().setPruebaPCR(pruebaPCR); //Establece los datos ingresados en Prueba PCR para el pasajero
									error = false;
									System.out.println("La verificacion de fecha es la siguiente:"+pruebaPCR.verificarValidez()); //Muestra validez de prueba PCR
									System.out.println("Se guardaron correctamente los datos.");
									}catch(NullPointerException e) {
											System.out.println("PASAJERO NO EXISTE EN EL SISTEMA INTENTE NUEVAMENTE");
									}
					error = true;
					//Declaración de variables
					int numeroPasajeros = 0;
					String horaLlegada = null; 
					int numeroVuelo = 0;
					//Fin declaración de variables
					sc.nextLine();
						System.out.println("\nA CONTINUACION SE SOLICITAN LOS DATOS DEL VUELO DEL QUE PROCEDE EL PASAJERO:");
					System.out.println("Ingrese la CIUDAD de donde proviene el vuelo:");
					String ciudadOrigen = sc.nextLine();
					System.out.println("Ingrese la CIUDAD a donde se dirige el vuelo:");
					String destinoFinalVuelo = sc.nextLine();
					error = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese el numero de pasajeros del avion en el que llego:");
								 		numeroPasajeros = sc.nextInt();
								 		while(numeroPasajeros < 0) { //Bloque de validacion de error
								 			System.out.println("Ingrese el numero de pasajeros del avion en el que llego correctamente:");
									 		numeroPasajeros = sc.nextInt();
								 		}
								 		error = false;
								}catch(InputMismatchException e) {
										System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
										sc.nextLine();
								}
						}while(error == true);
						error = true;
						do { //Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese la hora de llegada:");
										horaLlegada = sc.nextLine();
										error = false;
								}catch(InputMismatchException e) {
										System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								}
						}while(error == true);
						error = true;
						sc.nextLine();
						do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese el numero de vuelo:");
										numeroVuelo = sc.nextInt();
										error = false;
										while(numeroVuelo < 0) {
											System.out.println("Ingrese el numero de vuelo CORRECTAMENTE:");
											numeroVuelo = sc.nextInt();
										}
								}catch(InputMismatchException e) {
						System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
						sc.nextLine();
								}
							}while(error == true);
						Avion avion = new Avion(numeroPasajeros,horaLlegada, numeroVuelo, ciudadOrigen, destinoFinalVuelo); //Constructor de objeto de clase Avion
						
							try {
								buscarPasajero(pasajeros,numeroPasaporte).getFormulario().setAvion(avion);
								
							}catch(NullPointerException e) {
									System.out.println("PASAJERO NO EXISTE EN EL SISTEMA. INTENTE NUEVAMENTE.");
							}
			break;
						
			case 2: //Opción que elimina pasajeros del sistema
				
				System.out.println("Ingrese el numero de pasaporte del pasajero a eliminar del sistema:");
				String numeroPasaporteEliminar = sc.nextLine();
				eliminarPasajero(pasajeros,numeroPasaporteEliminar);
						
				break;
			
			case 3: //Opción que permite visualizar un solo pasajero ingresando su numero de pasaporte
				System.out.println("Ingrese el numero de pasaporte del pasajero a visualizar:");
				String numeroPasaporteVisualizar = sc.nextLine();
				mostrarPasajero(pasajeros, numeroPasaporteVisualizar);
						
					break;
					
			case 4: //Opción que permite visualizar todos los pasajeros que están registrados en el sistema
				mostrarPasaportesRegistrados(pasajeros);
			break;	
			
			case 5: //Opción que modifica los datos personales de un pasajero anteriormente registrado.
				//Declaracion de variables
				boolean x = false;
				boolean errorModificar = true;
				boolean extranjeroModificar = true;
				int i;
				//Fin de declaracion de variables
				System.out.println("Ingrese el numero de pasaporte del pasajero a modificar:");
				String numeroPasaporteModificar = sc.nextLine();
                               while(isNumeric(numeroPasaporteModificar)==false){
                                     System.out.println("\nIngrese el pasaporte CORRECTAMENTE:");
					numeroPasaporteModificar = sc.nextLine();
                                 }     
				System.out.println("\nIngrese los nombres del pasajero:");
					nombre = sc.nextLine();
                                        while(isNumeric(nombre)==true){
                                     System.out.println("\nIngrese los nombres del pasajero CORRECTAMENTE:");
					nombre = sc.nextLine();
                                 }    
				System.out.println("Ingrese los apellidos del pasajero:");
					apellido = sc.nextLine();
                                        while(isNumeric(apellido)==true){
                                     System.out.println("\nIngrese los apellidos del pasajero CORRECTAMENTE:");
					apellido = sc.nextLine();
                                 }    
				System.out.println("Ingrese la nacionalidad del pasajero:");
					nacionalidad = sc.nextLine();
                                        while(isNumeric(nacionalidad)==true){
                                     System.out.println("\nIngrese la nacionalidad del pasajero CORRECTAMENTE:");
					nacionalidad = sc.nextLine();
                                 }    
				System.out.println("Ingrese la ciudad de donde proviene el vuelo del pasajero:");
				    ciudadOrigenViaje = sc.nextLine();
                                    while(isNumeric(ciudadOrigenViaje)==true){
                                     System.out.println("\nIngrese la ciudad CORRECTAMENTE:");
					ciudadOrigenViaje = sc.nextLine();
                                 }    
				System.out.println("Ingrese el destino final del pasajero: ");
					destinoFinalViaje = sc.nextLine();
                                        while(isNumeric(destinoFinalViaje)==true){
                                     System.out.println("\nIngrese la ciudad CORRECTAMENTE:");
					destinoFinalViaje = sc.nextLine();
                                 }    
					System.out.println("Ingrese el e-mail del pasajero:");
					correoElectronico = sc.nextLine();
					
					//Bloque de validacion para email usando clases PATTERN y MATCHER
					rfc2822 = Pattern.compile(
					           "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$"
					);
					while(!rfc2822.matcher(correoElectronico).matches()) {
						System.out.println("Ingrese el e-mail del pasajero CORRECTAMENTE:");
						correoElectronico = sc.nextLine();
					} //Error creado para evitar correos electrónicos inválidos.
					//Fin de bloque de validación para email			
                     
                                                                            String numeroPasaporteNuevo = null;
                                                                                                                    if(nacionalidad.equals("Ecuatoriano") || nacionalidad.equals("Ecuatoriana")) {
							extranjeroModificar= false;
							System.out.println("\n\tPASAJERO ECUATORIANO.");
                                                        
						}
						if(extranjeroModificar == true) {
							System.out.println("Ingrese el numero del pasaporte del pasajero extranjero:");
							numeroPasaporteNuevo = sc.nextLine();	
								while(numeroPasaporteNuevo.length()>10 || numeroPasaporteNuevo.length()<5) {
									System.out.println("Ingrese el numero del pasaporte del pasajero CORRECTAMENTE:");
									numeroPasaporteNuevo = sc.nextLine();	
								}
								while(isNumeric(numeroPasaporteNuevo)==false) {
					    	System.out.println("Ingrese el numero del pasaporte del pasajero CORRECTAMENTE, es decir un numero.:");
					    	numeroPasaporteNuevo = sc.nextLine();	
								}
							}else {
						System.out.println("Ingrese el numero del pasaporte del pasajero (Recuerde que debe coincidir con el numero de cedula ecuatoriana):");
						numeroPasaporteNuevo = sc.nextLine();		
					    	while(validadorDeCedula(numeroPasaporteNuevo)== false) { //Bloque de validación para números de pasaporte ecuatorianos
					    		System.out.println("Pasaporte inválido. Ingreselo correctamente.:");
					    		numeroPasaporteNuevo = sc.nextLine();		
					    	} //Fin de validación para numeros de pasaporte
							}
					 System.out.println("Ingrese el numero de contacto del pasajero:");
					String numeroContactoM = sc.nextLine();
							while(isNumeric(numeroContactoM)==false || numeroContactoM.length()>10) { //Bloque de validación para numeros telefónicos ecuatorianos.
								System.out.println("Ingrese el numero de contacto del pasajero CORRECTAMENTE:");
								numeroContactoM = sc.nextLine();
							}//Fin de validaciones para números telefónicos ecuatorianos. 
				
							do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
									System.out.println("Ingrese el genero del pasajero: (Ingrese 1 si es Masculino, y 2 si es Femenino.)");
									i = sc.nextInt();
									while(i< 1 || i> 2) { //Bloque de validacion de error
										System.out.println("Entrada incorrecta. Ingrese 1 si es Masculino o 2 si es Femenino.");
										i= sc.nextInt();
									}
									if(i == 1) {
										x= true;
									}else {
										x= false;
									}
									errorModificar = false;
								}catch(InputMismatchException e) {
									System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE.");
									sc.nextLine();
								}
							}while(errorModificar == true);
						 
				modificarUsuario(pasajeros, nombre, apellido, nacionalidad, ciudadOrigenViaje, correoElectronico, numeroContactoM, numeroPasaporteModificar, numeroPasaporteNuevo,x, destinoFinalViaje); //Se modifica el pasajero
			break;
			case 6: //Ópción que modifica el formulario de un pasajero
				//Declaracion de variables
				boolean FiebreM = false;
				boolean TosSecaM = false;
				boolean DificultadRespiratoriaM = false;
				boolean DolorCabezaM = false;
				boolean MalestarGeneralM = false;
				boolean resultadoM= false;
				boolean errorM = true;
				//Fin de declaracion de variables
				System.out.println("Ingrese el numero de pasaporte del pasajero con el formulario a modificar:");
				String numeroPasaporteFormModificar = sc.nextLine();
						do {//Bloque repetitivo que verifica que el error deje de existir.
						try { //Bloque try/catch para optimizar errores
							System.out.println("\nA CONTINUACION SE SOLICITAN SINTOMAS DEL PASAJERO:");
							System.out.println("Ingrese 1 si siente fiebre o 2 si no es asi:");
							int fbm = sc.nextInt();
							while(fbm < 1 || fbm > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si siente fiebre o 2 si no es asi:");
								fbm = sc.nextInt();
							}
									if(fbm == 1) {
										FiebreM = true;
									}
							errorM = false;
						}catch(InputMismatchException e) {
							System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE.");
							sc.nextLine();
						}
						}while(errorM == true);
					
						errorM = true;
					do {//Bloque repetitivo que verifica que el error deje de existir.
					try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si siente malestar general o 2 si no es asi:");
							int malestarM = sc.nextInt();
							while(malestarM < 1 || malestarM > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si siente malestar general o 2 si no es asi: ");
								malestarM = sc.nextInt();
							}
									if(malestarM == 1) {
										MalestarGeneralM = true;
									}
							errorM = false;
						}catch(InputMismatchException e) {
						System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
						sc.nextLine();
						}
					}while(errorM ==true);
			
					errorM = true;
				
				do {//Bloque repetitivo que verifica que el error deje de existir.
					try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si tiene tos seca o 2 si no es asi:");
							int tosM = sc.nextInt();
							while(tosM < 1 || tosM > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA.Ingrese 1 si tiene tos seca o 2 si no es asi: ");
								tosM = sc.nextInt();
							}
									if(tosM == 1) {
										TosSecaM= true;
									}
							errorM = false;
						}catch(InputMismatchException e) {
							System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
							sc.nextLine();
					}
					}while(errorM == true);
			
			errorM = true;
			
				do {//Bloque repetitivo que verifica que el error deje de existir.
					try { //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si tiene dolor de cabeza o 2 si no es asi:");
							int dcbzM = sc.nextInt();
							while(dcbzM < 1 || dcbzM > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si tiene dolor de cabeza o 2 si no es asi: ");
								dcbzM = sc.nextInt();
									}
									if(dcbzM == 1) {
										DolorCabezaM= true;
									}
									errorM = false;
					}catch(InputMismatchException e) {
				System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
				sc.nextLine();
					}
					}while(errorM == true);
			
					errorM = true;
			
				do {//Bloque repetitivo que verifica que el error deje de existir.
					try{ //Bloque try/catch para optimizar errores
							System.out.println("Ingrese 1 si tiene dificultades respiratorias o 2 si no es asi:");
							int drespM = sc.nextInt();
							while(drespM < 1 || drespM > 2) { //Bloque de validacion de error
								System.out.println("ENTRADA INCORRECTA. Ingrese 1 si tiene dificultades respiratorias o 2 si no es asi: ");
								drespM = sc.nextInt();
							}
									if(drespM == 1) {
										DificultadRespiratoriaM= true;
									}
							errorM = false;
					}catch(InputMismatchException e) {
						System.out.println("SE INTRODUJO UN DATO INVALIDO. INTENTE NUEVAMENTE");
						sc.nextLine();
								}
					}while(errorM == true);
					
			Sintomatologia sintomatologiaModificada = new Sintomatologia(FiebreM, DolorCabezaM, MalestarGeneralM, DificultadRespiratoriaM, TosSecaM);//Constructor de clase Sintomatologia					
		    		errorM = true;
				//Declaración de variables
				dia = 0;
				mes = 0;
				anio = 0;
				//Fin declaración de variables
				
				
						System.out.println("\nA CONTINUACION SE SOLICITAN LOS DATOS DE LA PRUEBA PCR NECESARIA PARA INGRESAR AL PAIS:");
						System.out.println("Por favor ingrese la fecha en la que se realizó la prueba PCR:");
								do {//Bloque repetitivo que verifica que el error deje de existir.
									try { //Bloque try/catch para optimizar errores
									System.out.println("Ingrese el dia:");
									dia = sc.nextInt();
													while(dia <= 0 || dia > 31) { //Bloque de validacion de error
														System.out.println("Ingrese el dia correctamente:");
														dia = sc.nextInt();
													}
									errorM = false;
										}catch(InputMismatchException e) {
												System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
												sc.nextLine();
											}
									}while(errorM == true);
										errorM = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
							try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el mes:");
							mes = sc.nextInt();
							mes--; //Se realiza esta resta debido a las caracteristicas de la clase Date
							if(mes == 1) {
								mes++; //Se realiza esta suma debido a las caracteristicas de la clase Date
							}
									while(mes<= 0 || mes > 12) { //Bloque de validacion de error
										System.out.println("Ingrese el mes correctamente:");
										mes = sc.nextInt();
										if(mes == 1) {
											mes++; //Se realiza esta suma debido a las caracteristicas de la clase Date
										}
									}
									errorM = false;
										}catch(InputMismatchException e) {
												System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
												sc.nextLine();
															}
										}while(errorM == true);
												errorM = true;
							do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el año:");
					    	anio = sc.nextInt();
					    	anio= (anio-1900); //Se realiza esta resta debido a las caracteristicas de la clase Date
							    	while(anio <= 0 || anio > 2021) { //Bloque de validacion de error
										System.out.println("Ingrese el año correctamente:");
										anio = sc.nextInt();
										anio= (anio-1900); //Se realiza esta resta debido a las caracteristicas de la clase Date
									}
							    	errorM = false;
										}catch(InputMismatchException e) {
												System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
												sc.nextLine();
																		}
										}while(errorM == true);
						Date fechaPrueba  = new Date(anio, mes, dia); //Constructor de objeto de clase Date
									errorM = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
							try { //Bloque try/catch para optimizar errores
						System.out.println("Ingrese el resultado de la prueba (1 si es Positiva o 2 si es Negativa):" );
						int resulM = sc.nextInt();
								while(resulM < 1 || resulM > 2 ) { //Bloque de validacion de error
										System.out.println("Ingrese el resultado de la prueba correctamente (1 si es Positiva o 2 si es Negativa):" );
										resulM = sc.nextInt();
								}
									if (resulM == 1) {
										resultadoM = true;
									}
								 	errorM = false;
								 	
									}catch(InputMismatchException e) {
								System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								sc.nextLine();
										}
								}while(errorM == true);
								errorM = true;
						
						PruebaPCR pruebaPCRModificada = new PruebaPCR(fechaPrueba, resultadoM); //Constructor de objeto de clase Prueba PCR
						
						
					//Declaración de variables
					numeroPasajeros = 0;
					horaLlegada = null; 
					numeroVuelo = 0;
					//Fin declaración de variables
					sc.nextLine();
						System.out.println("\nA CONTINUACION SE SOLICITAN LOS DATOS DEL VUELO DEL QUE PROCEDE EL PASAJERO:");
					System.out.println("Ingrese la CIUDAD de donde proviene el vuelo:");
					ciudadOrigen = sc.nextLine();
					System.out.println("Ingrese la CIUDAD a donde se dirige el vuelo:");
					destinoFinalVuelo = sc.nextLine();
					errorM = true;
						do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese el numero de pasajeros del avion en el que llego:");
								 		numeroPasajeros = sc.nextInt();
								 		while(numeroPasajeros < 0) { //Bloque de validacion de error
								 			System.out.println("Ingrese el numero de pasajeros del avion en el que llego correctamente:");
									 		numeroPasajeros = sc.nextInt();
								 		}
								 		errorM = false;
								}catch(InputMismatchException e) {
										System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
										sc.nextLine();
								}
						}while(errorM == true);
						errorM = true;
						do { //Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese la hora de llegada:");
										horaLlegada = sc.nextLine();
										errorM = false;
								}catch(InputMismatchException e) {
										System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
								}
						}while(errorM == true);
						errorM = true;
						sc.nextLine();
						do {//Bloque repetitivo que verifica que el error deje de existir.
								try { //Bloque try/catch para optimizar errores
										System.out.println("Ingrese el numero de vuelo:");
										numeroVuelo = sc.nextInt();
										while(numeroVuelo < 0) {
											System.out.println("Ingrese el numero de vuelo CORRECTAMENTE:");
											numeroVuelo = sc.nextInt();
										}
										errorM = false;
								}catch(InputMismatchException e) {
						System.out.println("HA INGRESADO UN CARACTER INVALIDO INTENTE NUEVAMENTE");
						sc.nextLine();
								}
							}while(errorM == true);
						Avion avionModificado = new Avion(numeroPasajeros,horaLlegada, numeroVuelo, ciudadOrigen, destinoFinalVuelo); //Constructor de objeto de clase Avion
				modificarFormulario(pasajeros, numeroPasaporteFormModificar, sintomatologiaModificada, pruebaPCRModificada, avionModificado); //Se modifica el formulario
				break;
			case 7: //Salida del programa
				System.out.println("SALIENDO DEL PROGRAMA.....");
				System.out.println("HA SALIDO DEL PROGRAMA CORRECTAMENTE");
				System.exit(0); //Salida del programa 
				break;
			}
			
			}while (n!= 8);
			System.out.println("Ha salido del programa");
		}

//METODOS DE LA CLASE PRINCIPAL
	
/**
* Metodo que muestra el menú. No retorna valor.<br>
*  
*
*/
public static void menu() { 
	 System.out.println("\n\tBIENVENIDO A REGRESA SEGURO");
	 System.out.println("1.-Registrar un nuevo pasajero");
     System.out.println("2.-Eliminar informacion del pasajero");
     System.out.println("3.-Visualizar informacion de un pasajero");
     System.out.println("4.-Visualizar estados de alerta para cada pasajero registrado");
     System.out.println("5.-Modificar datos personales de un pasajero");
     System.out.println("6.-Modificar formulario de un pasajero");
     System.out.println("7.-Salir");
}

/**
 * Metodo que agrega pasajeros al arreglo. No retorna valor.<br>
 *  
 *
 */
public static void agregarPasajero(Pasajero[] pasajeros, Pasajero pasajero) {
	for (int i=0;i<pasajeros.length;i++) {
		if(pasajeros[i]==null) {
			pasajeros[i]=pasajero;
			System.out.println("PASAJERO REGISTRADO CORRECTAMENTE");
			break;
		}
	}
}
/**
 * Metodo que agrega pvuelos al arreglo. No retorna valor.<br>
 *  
 *
 */
public static void agregarVuelo(Avion[] vuelos, Avion avion) {
	for (int i=0;i<vuelos.length;i++) {
		if(vuelos[i]==null) {
			vuelos[i]=avion;
			System.out.println("VUELO REGISTRADO CORRECTAMENTE");
			break;
		}
	}
}
/**
 * Metodo que según un numero de vuelo identifica a un vuelo del arreglo y lo retorna.<br>
 *  
 *
 */
public static Avion buscarVuelo(Avion[] vuelos,int numeroVuelo) {
	Avion avionEncontrado = null;
	for (int i=0;i<vuelos.length;i++) {
		if(vuelos[i]!=null) {
			if(vuelos[i].getNumeroVuelo()==(numeroVuelo)) {
				avionEncontrado=vuelos[i];		
	break;
			}
		}
	}
	return avionEncontrado;
}
/**
 * Metodo que muestra un pasajero y recibe como parametro algún numero de pasaporte, además de esto lo valida y verifica que exista. No retorna valor.<br>
 *  
 *
 */
public static void mostrarPasajero(Pasajero[] pasajeros,String numeroPasaporte){
	Pasajero psj = new Pasajero();
	for (int i=0;i<pasajeros.length;i++) 
	{
		if(pasajeros[i]!=null) 
		{
			psj = pasajeros[i];
			if(psj.getNumeroPasaporte().equals(numeroPasaporte)) {
				System.out.println("\n"+psj);
			}else {
				System.out.println("NO EXISTE EL PASAJERO EN EL SISTEMA."); //Validacion de que el pasajero no exista.
			}
    }
	}
}
/**
 * Metodo que según un numero de pasaporte identifica a un pasajero del arreglo y lo retorna.<br>
 *  
 *
 */
public static Pasajero buscarPasajero(Pasajero[] pasajeros,String numeroPasaporte) {
	Pasajero pasajeroEncontrado = null;
	for (int i=0;i<pasajeros.length;i++) {
		if(pasajeros[i]!=null) {
			if(pasajeros[i].getNumeroPasaporte().equals(numeroPasaporte)) {
				pasajeroEncontrado=pasajeros[i];		
	break;
			}
		}
	}
	return pasajeroEncontrado;
}
/**
 * Metodo que según un numero de pasaporte elimina al pasajero existente en el arreglo, o no lo hace si este no existe. No retorna valor.<br>
 *  
 *
 */
public static void  eliminarPasajero(Pasajero[] pasajeros,String numeroPasaporte) {
	for(int i=0;i<pasajeros.length;i++) {
		if(pasajeros[i]!=null) {
			if(pasajeros[i].getNumeroPasaporte().equals(numeroPasaporte)) {
				pasajeros[i]=null;
				System.out.println("PASAJERO ELIMINADO CORRECTAMENTE DEL SISTEMA.");
			}else {
				System.out.println("PASAJERO NO EXISTE EN EL SISTEMA."); //Validacion de que el pasajero no exista.
    break;
			}
		}
	}

}
/**
 * Metodo que retorna el arreglo completo de pasajeros registrados, junto con sus numero de pasaporte y estado de alerta. No retorna valor.<br>
 *  
 *
 */
public static void mostrarPasaportesRegistrados(Pasajero[] pasajeros){
	System.out.println("Pasaportes registrados:");
	for (int i=0;i<pasajeros.length;i++) 
	{
		if(pasajeros[i]!=null) 
		{
			System.out.println((i+1)+")");
			 System.out.println(pasajeros[i].getNombre()+" "+pasajeros[i].getApellido()+" con numero de pasaporte: "+pasajeros[i].getNumeroPasaporte()+" "+"ESTADO DE ALERTA:"+pasajeros[i].getFormulario().obtenerEstadoAlerta());
		}else {
			System.out.println("NO EXISTE PASAPORTE REGISTRADO AÚN");
		}
    }
}
/**
 * Metodo que retorna verdadero o falso según el numero de pasaporte sea correcto.<br>
 * Este método solo funciona para ingresar pasaportes ECUATORIANOS.<br>
 * Método basado en el creado por: Argenis año 2011
 */
public static boolean validadorDeCedula(String numeroPasaporte) {
	boolean pasaporteCorrecto = false;
	 
	try {
	 
	if (numeroPasaporte.length() == 10) // ConstantesApp.LongitudCedula
	{
	int tercerDigito = Integer.parseInt(numeroPasaporte.substring(2, 3));
	if (tercerDigito < 6) {
	// Coeficientes de validación cédula
	// El decimo digito se lo considera dígito verificador
	 int[] coefValPasaporte = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
	 int verificador = Integer.parseInt(numeroPasaporte.substring(9,10));
	 int suma = 0;
	 int digito = 0;
	for (int i = 0; i < (numeroPasaporte.length() - 1); i++) {
	 digito = Integer.parseInt(numeroPasaporte.substring(i, i + 1))* coefValPasaporte[i];
	 suma += ((digito % 10) + (digito / 10));
	}
	 
	if ((suma % 10 == 0) && (suma % 10 == verificador)) {
		pasaporteCorrecto = true;
	}
	else if ((10 - (suma % 10)) == verificador) {
		pasaporteCorrecto = true;
	} else {
		pasaporteCorrecto = false;
	}
	} else {
		pasaporteCorrecto = false;
	}
	} else {
		pasaporteCorrecto = false;
	}
	} catch (NumberFormatException nfe) {
		pasaporteCorrecto = false;
	} catch (Exception err) {
	System.out.println("NÚMERO DE PASAPORTE EQUIVOCADO.");
		pasaporteCorrecto = false;
	}
	
	return pasaporteCorrecto;
}
/**
 * Metodo que retorna verdadero o falso según el numero de teléfono contenga letras.<br>
 * Método basado en el creado por: Victor Cuervo año 2020<br>
 * 
 */
public static boolean isNumeric(String numeroContacto){
	try {
		Integer.parseInt(numeroContacto);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
/**
 * Metodo que modifica un pasajero.No retorna valor.<br>
 * <br>
 * 
 */
public static void modificarUsuario(Pasajero[] pasajeros,String nombre, String apellido, String nacionalidad, String ciudadOrigenViaje, String correoElectronico, String numeroContacto, String numeroPasaporte,String numeroPasaporteNuevo, boolean genero, String destinoFinalViaje) {
	if(buscarPasajero(pasajeros, numeroPasaporte)!= null) { //Validacion de que el pasajero no exista.
	buscarPasajero(pasajeros, numeroPasaporte).setApellido(apellido);
	buscarPasajero(pasajeros, numeroPasaporte).setCiudadOrigenViaje(ciudadOrigenViaje);
	buscarPasajero(pasajeros, numeroPasaporte).setCorreoElectronico(correoElectronico);
	buscarPasajero(pasajeros, numeroPasaporte).setDestinoFinalViaje(destinoFinalViaje);
	buscarPasajero(pasajeros, numeroPasaporte).setGenero(genero);
	buscarPasajero(pasajeros, numeroPasaporte).setNacionalidad(nacionalidad);
	buscarPasajero(pasajeros, numeroPasaporte).setNombre(nombre);
	buscarPasajero(pasajeros, numeroPasaporte).setNumeroContacto(numeroContacto);
	buscarPasajero(pasajeros, numeroPasaporte).setNumeroPasaporte(numeroPasaporteNuevo);
	System.out.println("PASAJERO MODIFICADO CORRECTAMENTE.");
	}else {
		System.out.println("NO SE HA PODIDO MODIFICAR EL PASAJERO.");
		System.out.println("PASAJERO NO EXISTE EN EL SISTEMA.");
	}
}
/**
 * Metodo que modifica un formulario.No retorna valor.<br>
 * <br>
 * 
 */
public static void modificarFormulario(Pasajero[] pasajeros, String numeroPasaporte, Sintomatologia sintomatologia,PruebaPCR pruebaPCR,Avion avion) {
	Formulario formulario = new Formulario();
	formulario.setAvion(avion);
	formulario.setPruebaPCR(pruebaPCR);
	formulario.setSintomatologia(sintomatologia);
	if(buscarPasajero(pasajeros, numeroPasaporte)!= null) { //Validacion de que el pasajero no exista.
	buscarPasajero(pasajeros, numeroPasaporte).setFormulario(formulario);
	}else {
		System.out.println("NO SE HA PODIDO MODIFICAR EL FORMULARIO.");
		System.out.println("PASAJERO NO EXISTE EN EL SISTEMA.");
	}
}
  
}
