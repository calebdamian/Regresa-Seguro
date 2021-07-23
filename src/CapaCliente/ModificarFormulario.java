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
public class ModificarFormulario extends javax.swing.JFrame {

    /**
     * Creates new form ModificarFormulario
     */
    public ModificarFormulario() {
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

        botonesFiebreModif = new javax.swing.ButtonGroup();
        botonesMalestarModif = new javax.swing.ButtonGroup();
        botonesDolorModif = new javax.swing.ButtonGroup();
        botonesTosModif = new javax.swing.ButtonGroup();
        botonesDificultadesModif = new javax.swing.ButtonGroup();
        botonesResultado = new javax.swing.ButtonGroup();
        logoTop = new javax.swing.JLabel();
        tituloModificarFormulario = new javax.swing.JLabel();
        tituloSintomatologia = new javax.swing.JLabel();
        labelFiebre = new javax.swing.JLabel();
        labelMalestar = new javax.swing.JLabel();
        labelDolorCabeza = new javax.swing.JLabel();
        labelTos = new javax.swing.JLabel();
        labelDificultades = new javax.swing.JLabel();
        fiebreSiModif = new javax.swing.JRadioButton();
        fiebreNoModif = new javax.swing.JRadioButton();
        malestarSiModif = new javax.swing.JRadioButton();
        malestarNoModif = new javax.swing.JRadioButton();
        dolorSiModif = new javax.swing.JRadioButton();
        dolorNoModif = new javax.swing.JRadioButton();
        tosSiModif = new javax.swing.JRadioButton();
        tosNoModif = new javax.swing.JRadioButton();
        dificultadSiModif = new javax.swing.JRadioButton();
        dificultadNoModif = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();
        labelAnio = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        ingresaDiaModif = new javax.swing.JTextField();
        ingresaMesModif = new javax.swing.JTextField();
        ingresaAnioModif = new javax.swing.JTextField();
        botonPositivoModif = new javax.swing.JRadioButton();
        botonNegativoModif = new javax.swing.JRadioButton();
        botonGuardarYSalirModificarFormulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar el formulario de un pasajero");

        logoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura.JPG"))); // NOI18N

        tituloModificarFormulario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloModificarFormulario.setText("LOS DATOS INGRESADOS REEMPLAZARÁN A LOS INGRESADOS EN EL PRIMER REGISTRO");

        tituloSintomatologia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloSintomatologia.setText("SINTOMATOLOGÍA: (Ingrese aquellos sintomas que presente)");

        labelFiebre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFiebre.setText("Fiebre:");

        labelMalestar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMalestar.setText("Malestar general:");

        labelDolorCabeza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDolorCabeza.setText("Dolor de cabeza:");

        labelTos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTos.setText("Tos Seca:");

        labelDificultades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDificultades.setText("Dificultades Respiratorias:");

        botonesFiebreModif.add(fiebreSiModif);
        fiebreSiModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fiebreSiModif.setSelected(true);
        fiebreSiModif.setText("Si");

        botonesFiebreModif.add(fiebreNoModif);
        fiebreNoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fiebreNoModif.setText("No");

        botonesMalestarModif.add(malestarSiModif);
        malestarSiModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        malestarSiModif.setSelected(true);
        malestarSiModif.setText("Si");

        botonesMalestarModif.add(malestarNoModif);
        malestarNoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        malestarNoModif.setText("No");

        botonesDolorModif.add(dolorSiModif);
        dolorSiModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dolorSiModif.setSelected(true);
        dolorSiModif.setText("Si");

        botonesDolorModif.add(dolorNoModif);
        dolorNoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dolorNoModif.setText("No");

        botonesTosModif.add(tosSiModif);
        tosSiModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tosSiModif.setSelected(true);
        tosSiModif.setText("Si");

        botonesTosModif.add(tosNoModif);
        tosNoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tosNoModif.setText("No");

        botonesDificultadesModif.add(dificultadSiModif);
        dificultadSiModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dificultadSiModif.setSelected(true);
        dificultadSiModif.setText("Si");

        botonesDificultadesModif.add(dificultadNoModif);
        dificultadNoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dificultadNoModif.setText("No");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PRUEBA PCR: (Ingrese los datos de la prueba PCR realizada)");

        labelDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDia.setText("Dia:");

        labelMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMes.setText("Mes:");

        labelAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAnio.setText("Año:");

        labelResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelResultado.setText("Resultado:");

        ingresaDiaModif.setText("dd");

        ingresaMesModif.setText("mm");
        ingresaMesModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaMesModifActionPerformed(evt);
            }
        });

        ingresaAnioModif.setText("aaaa");

        botonesResultado.add(botonPositivoModif);
        botonPositivoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonPositivoModif.setText("Positivo");

        botonesResultado.add(botonNegativoModif);
        botonNegativoModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonNegativoModif.setSelected(true);
        botonNegativoModif.setText("Negativo");

        botonGuardarYSalirModificarFormulario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonGuardarYSalirModificarFormulario.setText("Guardar y Salir");
        botonGuardarYSalirModificarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarYSalirModificarFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloModificarFormulario)
                    .addComponent(tituloSintomatologia)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPositivoModif))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelMalestar)
                                    .addGap(18, 18, 18)
                                    .addComponent(malestarSiModif)
                                    .addGap(18, 18, 18)
                                    .addComponent(malestarNoModif))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelDolorCabeza)
                                    .addGap(18, 18, 18)
                                    .addComponent(dolorSiModif)
                                    .addGap(18, 18, 18)
                                    .addComponent(dolorNoModif))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelFiebre)
                                    .addGap(18, 18, 18)
                                    .addComponent(fiebreSiModif)
                                    .addGap(18, 18, 18)
                                    .addComponent(fiebreNoModif)
                                    .addGap(163, 163, 163)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelDificultades)
                                            .addGap(18, 18, 18)
                                            .addComponent(dificultadSiModif)
                                            .addGap(18, 18, 18)
                                            .addComponent(dificultadNoModif))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelTos)
                                            .addGap(18, 18, 18)
                                            .addComponent(tosSiModif)
                                            .addGap(18, 18, 18)
                                            .addComponent(tosNoModif)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(logoTop))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonGuardarYSalirModificarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labelAnio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ingresaAnioModif))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelMes)
                                                .addGap(10, 10, 10)
                                                .addComponent(ingresaMesModif, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(labelDia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ingresaDiaModif, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(272, 272, 272)
                                    .addComponent(labelResultado))))
                        .addGap(18, 18, 18)
                        .addComponent(botonNegativoModif)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoTop)
                .addGap(18, 18, 18)
                .addComponent(tituloModificarFormulario)
                .addGap(26, 26, 26)
                .addComponent(tituloSintomatologia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFiebre)
                    .addComponent(labelTos)
                    .addComponent(fiebreSiModif)
                    .addComponent(fiebreNoModif)
                    .addComponent(tosSiModif)
                    .addComponent(tosNoModif))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMalestar)
                    .addComponent(labelDificultades)
                    .addComponent(malestarSiModif)
                    .addComponent(malestarNoModif)
                    .addComponent(dificultadSiModif)
                    .addComponent(dificultadNoModif))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDolorCabeza)
                    .addComponent(dolorSiModif)
                    .addComponent(dolorNoModif))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDia)
                    .addComponent(ingresaDiaModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMes)
                    .addComponent(labelResultado)
                    .addComponent(ingresaMesModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPositivoModif)
                    .addComponent(botonNegativoModif))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnio)
                    .addComponent(ingresaAnioModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonGuardarYSalirModificarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarYSalirModificarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarYSalirModificarFormularioActionPerformed
        // TODO add your handling code here:
        MenuOpcionesPrincipales m1 = new MenuOpcionesPrincipales();
        
        if(validarFecha()){
        Sintomatologia sintomatologia = new Sintomatologia(validarFiebre(), validarDolorCabeza(), validarMalestar(), validarDificultadRespiratoria(),validarTos());
        Date fechaPruebaPCR = new Date(Integer.parseInt(ingresaAnioModif.getText())-1900,Integer.parseInt(ingresaMesModif.getText())-1, Integer.parseInt(ingresaDiaModif.getText()));
        PruebaPCR pruebaPCR = new PruebaPCR(fechaPruebaPCR, validarResultadoPrueba());
        Avion avion = PantallaInicial.buscarVuelo(PantallaInicial.vuelos, PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarForm).getFormulario().getAvion().getNumeroVuelo());
        PantallaInicial.modificarFormulario(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarForm, sintomatologia, pruebaPCR, avion);
        this.setVisible(false);
        m1.setVisible(true);
        }else if(validarFecha()==false){
            JOptionPane.showMessageDialog(null, "ERROR EN EL CAMPO DE INGRESO DE FECHA.");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO");
        }
    }//GEN-LAST:event_botonGuardarYSalirModificarFormularioActionPerformed

    private void ingresaMesModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaMesModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresaMesModifActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarFormulario().setVisible(true);
            }
        });
    }
    /**
     * Metodo que retorna lo seleccionado para el atributo de fiebre
     * @return boolean
     */
public boolean validarFiebre(){
      boolean validar = true;
      if(fiebreSiModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
/**
     * Metodo que retorna lo seleccionado para el atributo de tos
     * @return boolean
     */
    public boolean validarTos(){
      boolean validar = true;
      if(tosSiModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
    /**
     * Metodo que retorna lo seleccionado para el atributo de malestar
     * @return boolean
     */
    public boolean validarMalestar(){
     boolean validar = true;
      if(malestarSiModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
    /**
     * Metodo que retorna lo seleccionado para el atributo de dificultad respiratoria
     * @return boolean
     */
    public boolean validarDificultadRespiratoria(){
     boolean validar = true;
      if(dificultadSiModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
    /**
     * Metodo que retorna lo seleccionado para el atributo de dolor de cabeza
     * @return boolean
     */
    public boolean validarDolorCabeza(){
      boolean validar = true;
      if(dolorSiModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
    /**
     * Metodo que valida que lo ingresado en los campos de fecha sean válidos
     * @return boolean
     */
    public boolean validarFecha(){
        boolean validar = true;
        if((ingresaDiaModif.getText().isEmpty()==false)&&PantallaInicial.isNumeric(ingresaDiaModif.getText())==false){
            validar = false;
        }
        if(ingresaMesModif.getText().isEmpty()==false&&PantallaInicial.isNumeric(ingresaMesModif.getText())==false){
            validar = false;
        }
        if(ingresaAnioModif.getText().isEmpty()==false&&PantallaInicial.isNumeric(ingresaAnioModif.getText())==false){
            validar = false;
        }
        if((PantallaInicial.retornarNumero(ingresaDiaModif.getText())==0)){
            validar = false;
        }else if(PantallaInicial.retornarNumero(ingresaDiaModif.getText())<=0||PantallaInicial.retornarNumero(ingresaDiaModif.getText())>31){
            validar = false;
        }
        if((PantallaInicial.retornarNumero(ingresaMesModif.getText())==0)){
            validar = false;
        }else if(PantallaInicial.retornarNumero(ingresaMesModif.getText())<=0||PantallaInicial.retornarNumero(ingresaMesModif.getText())>12){
            validar = false;
        }
        if((PantallaInicial.retornarNumero(ingresaAnioModif.getText())==0)){
            validar = false;
        }else if(PantallaInicial.retornarNumero(ingresaAnioModif.getText())<=2000||PantallaInicial.retornarNumero(ingresaAnioModif.getText())>2021){
            validar = false;
        }
        return validar;
    }
    /**
     * Metodo que retorna lo seleccionado para el atributo de resultado
     * @return boolean
     */
    public boolean validarResultadoPrueba(){
      boolean validar = true;
      if(botonPositivoModif.isSelected()){
          validar = true;
      }else{
          validar = false;
     
    }
      return validar;
    }
    
/**
     * Metodo que no retorna, y rellena los campos con lo anteriormente registrado
     * @return void
     */
      /*public void llenarConDatosAnteriores(){
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarDatos).getFormulario().getSintomatologia().getFiebre().equals("Presenta fiebre")){
           fiebreSiModif.setSelected(true);
        }else{
            fiebreNoModif.setSelected(true);
        }
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarDatos).getFormulario().getSintomatologia().getDificultadRespiratoria().equals("Presenta dificultad respiratoria")){
           dificultadSiModif.setSelected(true);
        }else{
            dificultadNoModif.setSelected(true);
        }
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarDatos).getFormulario().getSintomatologia().getDolorCabeza().equals("Presenta dolor de cabeza")){
           dolorSiModif.setSelected(true);
        }else{
            dolorNoModif.setSelected(true);
        }
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarDatos).getFormulario().getSintomatologia().getMalestarGeneral().equals("Presenta malestar general")){
          malestarSiModif.setSelected(true);
        }else{
            malestarNoModif.setSelected(true);
        }
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarDatos).getFormulario().getSintomatologia().getTosSeca().equals("Presenta tos")){
           tosSiModif.setSelected(true);
        }else{
            tosNoModif.setSelected(true);
        }
        if(PantallaInicial.buscarPasajero(PantallaInicial.pasajeros, MenuOpcionesPrincipales.numeroPasaporteModificarForm).getFormulario().getPruebaPCR().booleanResultado()== true){
            botonPositivoModif.setSelected(true);
        }else{
            botonNegativoModif.setSelected(false);
        }
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarYSalirModificarFormulario;
    private javax.swing.JRadioButton botonNegativoModif;
    private javax.swing.JRadioButton botonPositivoModif;
    private javax.swing.ButtonGroup botonesDificultadesModif;
    private javax.swing.ButtonGroup botonesDolorModif;
    private javax.swing.ButtonGroup botonesFiebreModif;
    private javax.swing.ButtonGroup botonesMalestarModif;
    private javax.swing.ButtonGroup botonesResultado;
    private javax.swing.ButtonGroup botonesTosModif;
    private javax.swing.JRadioButton dificultadNoModif;
    private javax.swing.JRadioButton dificultadSiModif;
    private javax.swing.JRadioButton dolorNoModif;
    private javax.swing.JRadioButton dolorSiModif;
    private javax.swing.JRadioButton fiebreNoModif;
    private javax.swing.JRadioButton fiebreSiModif;
    private javax.swing.JTextField ingresaAnioModif;
    private javax.swing.JTextField ingresaDiaModif;
    private javax.swing.JTextField ingresaMesModif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelDificultades;
    private javax.swing.JLabel labelDolorCabeza;
    private javax.swing.JLabel labelFiebre;
    private javax.swing.JLabel labelMalestar;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTos;
    private javax.swing.JLabel logoTop;
    private javax.swing.JRadioButton malestarNoModif;
    private javax.swing.JRadioButton malestarSiModif;
    private javax.swing.JLabel tituloModificarFormulario;
    private javax.swing.JLabel tituloSintomatologia;
    private javax.swing.JRadioButton tosNoModif;
    private javax.swing.JRadioButton tosSiModif;
    // End of variables declaration//GEN-END:variables
}
