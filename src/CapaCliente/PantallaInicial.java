/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaCliente;

import CapaNegocio.*;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Czleb
 */
public class PantallaInicial extends javax.swing.JFrame {

    
   public static Pasajero[] pasajeros = new Pasajero[5];
   public static Avion[] vuelos = new Avion[5];
    /**
     * Creates new form PantallaInicial
     */
    public PantallaInicial() {
   
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoGrande = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Regresa Seguro");

        logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresa seguro (1).png"))); // NOI18N

        botonIniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIniciar.setText("INICIAR");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(logoGrande))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoGrande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
        MenuOpcionesPrincipales m1 = new MenuOpcionesPrincipales();
        m1.setVisible(true);
        this.setVisible(false);
        //QUEMA DE DATOS
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
		Pasajero pasajeroQuemado2 = new Pasajero("Bad Bunny", "Sampedro Ocaña", "Cubano", "Guayaquil", "pepe@gmail.com", "09992927124", "1721480133", true, "Bogotá");
		agregarPasajero(pasajeros, pasajeroQuemado2);
		buscarPasajero(pasajeros,"1721480133").setFormulario(formularioquemado2);
		Sintomatologia sintomatologia2 = new Sintomatologia(false, true, true, false,true);
		Date fechaPruebaPCRQuemada2  = new Date(119, 0, 15);
		PruebaPCR pruebaPCRQuemada2 = new PruebaPCR(fechaPruebaPCRQuemada2, true);
		buscarPasajero(pasajeros,"1721480133").getFormulario().setPruebaPCR(pruebaPCRQuemada2);
		buscarPasajero(pasajeros,"1721480133").getFormulario().setSintomatologia(sintomatologia2);
		Avion avionQuemado2 = new Avion(10,"18:00", 1023, "Londres", "Quito");
		buscarPasajero(pasajeros,"1721480133").getFormulario().setAvion(avionQuemado2);
		//Fin de declaración de objetos quemados        
    }//GEN-LAST:event_botonIniciarActionPerformed
    /**
 * Metodo que retorna verdadero o falso según el string contenga letras.<br>
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
 * Metodo que retorna verdadero o falso según el string contenga numeros.<br>
 * Método basado en el creado por: Victor Cuervo año 2020<br>
 * 
 */
    public static int retornarNumero(String numeroContacto){
        int i=0;
	try {
            i=Integer.parseInt(numeroContacto);
            return i;
	} catch (NumberFormatException nfe){
		          System.out.println("HA OCURRIDO UN ERROR.");
                          return 0;
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
				JOptionPane.showMessageDialog(null, psj.toString()+psj.imprimirFormulario());
			}
    }
	}
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
			JOptionPane.showMessageDialog(null, "PASAJERO REGISTRADO CORRECTAMENTE");
			break;
		}
	}
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
                                 JOptionPane.showMessageDialog(null, "PASAJERO ELIMINADO CORRECTAMENTE DEL SISTEMA.");      
			 //Validacion de que el pasajero no exista.
    break;
			}
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
	JOptionPane.showMessageDialog(null, "PASAJERO MODIFICADO CORRECTAMENTE.");
	}else {
		
                JOptionPane.showMessageDialog(null, "NO SE HA PODIDO MODIFICAR EL PASAJERO.");
		
                JOptionPane.showMessageDialog(null, "PASAJERO NO EXISTE EN EL SISTEMA.");
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
        JOptionPane.showMessageDialog(null, "FORMULARIO MODIFICADO CORRECAMENTE.");
	}else {
		JOptionPane.showMessageDialog(null, "NO SE HA PODIDO MODIFICAR EL PASAJERO.");
                JOptionPane.showMessageDialog(null, "PASAJERO NO EXISTE EN EL SISTEMA.");
	}
}
    /**
 * Metodo que muestra todos los pasaportes y psasjeros registrados junto con su estado de alerta y numero de pasaporte.<br>
 *  @return void
 *
 */
    public static void mostrarPasaportesRegistrados(Pasajero[] pasajeros){
	
	for (int i=0;i<pasajeros.length;i++) 
	{
		if(pasajeros[i]!=null) 
		{
                         JOptionPane.showMessageDialog(null, pasajeros[i].getNombre()+" "+pasajeros[i].getApellido()+" con numero de pasaporte: "+pasajeros[i].getNumeroPasaporte()+" "+"ESTADO DE ALERTA:"+pasajeros[i].getFormulario().obtenerEstadoAlerta());
                         //pasajeros[i].getNombre()+" "+pasajeros[i].getApellido()+" con numero de pasaporte: "+pasajeros[i].getNumeroPasaporte()+" "+"ESTADO DE ALERTA:"+pasajeros[i].getFormulario().obtenerEstadoAlerta()
		}else {
                         JOptionPane.showMessageDialog(null,"NO EXISTE PASAPORTE REGISTRADO AÚN");
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
			JOptionPane.showMessageDialog(null,"VUELO REGISTRADO CORRECTAMENTE");
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
 * Metodo que muestra los vuelos registrados en el sistema<br>
 *  @return void
 *
 */
public static void mostrarVuelosRegistrados(Avion[] vuelos){
	
	for (int i=0;i<vuelos.length;i++) 
	{
		if(vuelos[i]!=null) 
		{
                         JOptionPane.showMessageDialog(null, vuelos[i].toString());
                         //pasajeros[i].getNombre()+" "+pasajeros[i].getApellido()+" con numero de pasaporte: "+pasajeros[i].getNumeroPasaporte()+" "+"ESTADO DE ALERTA:"+pasajeros[i].getFormulario().obtenerEstadoAlerta()
		}else {
                         JOptionPane.showMessageDialog(null,"NO EXISTE VUELO REGISTRADO AÚN");
		}
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel logoGrande;
    // End of variables declaration//GEN-END:variables
}