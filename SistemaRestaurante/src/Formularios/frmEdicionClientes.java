/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Objetos.Cliente;
import bd.ConexionBase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.PropertyExpander;

/**
 *
 * @author Julian
 */
public class frmEdicionClientes extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    frmMantenimientoClientes editarCli;
    
    public frmEdicionClientes(String id,String cedula, frmMantenimientoClientes edClientes) {
        System.out.println("id del usuario a editar: "+id);
        initComponents();
        this.editarCli=edClientes;
        tfuserId.setText(id);
        tfCedula.setText(cedula);
        
        //cargando datos de cliente a editar
        ConexionBase c = new ConexionBase();
        try{
            c.conectar();
            ArrayList<Cliente> cli = c.consultarClientes("","cliente");
            c.desconectar();
            
            for (Cliente ce:cli){
                if(ce.getCedula().equals(cedula)){
                   tfNombres.setText("");
                   tfApellidos.setText("");
                   tfCorreo.setText("");
                   tfDireccion.setText("");
                   tfTelefono.setText("");
                   tfEdad.setText("");
                   tfFechaNacimiento.setText("");
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los datos del registro","Edición",JOptionPane.ERROR_MESSAGE);
        }
                
        //Excepcion para cargar imagen
        try{
            BufferedImage clienticon = ImageIO.read(new File("src/icons/cliente_icon.png"));
            iconoCliente.setIcon(new ImageIcon(clienticon));
        }catch (Exception e){}
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEditar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfFechaNacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        iconoCliente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfuserId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Clientes");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombres:");

        tfCedula.setEditable(false);

        jLabel3.setText("Apellidos:");

        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo:");

        jLabel5.setText("Tipo:");

        cbTipo.setEditable(true);
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Huesped" }));

        jLabel6.setText("Edad:");

        tfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdadActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha de Nacimiento:");

        tfFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaNacimientoActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo:");

        cbSexo.setEditable(true);
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel9.setText("AAAA-MM-DD");

        iconoCliente.setPreferredSize(new java.awt.Dimension(132, 135));

        jLabel10.setText("Direccion:");

        jLabel11.setText("Telefono:");

        jLabel12.setText("Id:");

        tfuserId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfuserId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos)
                            .addComponent(tfNombres)
                            .addComponent(tfCorreo)
                            .addComponent(tfDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(iconoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfuserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarFormCli();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void tfFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaNacimientoActionPerformed

    private void tfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdadActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //Guardando datos nuevos
        int id = Integer.parseInt(tfuserId.getText());
        String cedula = tfCedula.getText();
        String nombres = tfNombres.getText();
        String apellidos = tfApellidos.getText();
        String correo = tfCorreo.getText();
        String direccion = tfDireccion.getText();
        String telefono = tfTelefono.getText();
        String tipo = (String) cbTipo.getSelectedItem();
        int edad = Integer.parseInt(tfEdad.getText());
        String fecha_nac = tfFechaNacimiento.getText();
        String sexo = (String) cbSexo.getSelectedItem();
        
        Cliente clin = new Cliente(id,cedula,nombres,apellidos,correo,tipo,edad,fecha_nac,sexo,direccion,telefono);
        ConexionBase c = new ConexionBase();
        
        try{
            c.conectar();
            if(c.modificarCliente(clin)){
                System.out.println("cliente modificado");
                JOptionPane.showMessageDialog(this,"Se editó correctamente el Cliente", "Edición Clientes",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }else{
                System.out.println("error al modificar cliente");
                JOptionPane.showMessageDialog(this,"Ocurrió un error en la edición", "Error",JOptionPane.ERROR_MESSAGE);            
            }
        }catch (Exception e){
        }
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void limpiarFormCli(){
        //tfCedula.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfCorreo.setText("");
        tfEdad.setText("18");
        tfFechaNacimiento.setText("1999-01-01");
        tfDireccion.setText("");
        tfTelefono.setText("");
    }
    
    private void validarFormCli(){
        
    }
    
    public void textoEditable(){
        tfNombres.setEditable(true);
        tfApellidos.setEditable(true);
        tfCorreo.setEditable(true);
        tfDireccion.setEditable(true);
        tfTelefono.setEditable(true);
        tfEdad.setEditable(true);
        tfFechaNacimiento.setEditable(true);
        cbTipo.setEditable(true);
        cbSexo.setEditable(true);
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel iconoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfFechaNacimiento;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfuserId;
    // End of variables declaration//GEN-END:variables
}
