/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.*;
import bd.ConexionBase;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.rmi.Naming.list;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.List;
import java.util.Arrays;

/**
 *
 * PARA CONFIGURAR EL TFIELD CEDULA QUE SEA ACCESIBLE EN OTROS JFRAMES 
 * SE DEBE IR A OPCION "CUSTOMIZE CODE" Y HABILITAR PUBLIC + STATIC EN LAS PROPIEDADES
 * @author Julian
 */
public class frmGenerarOrden extends javax.swing.JFrame {

    //FrmPrincipal frmPr;
    
    /**
     * Creates new form frmGenerarOrden
     * @param nombreUsuario
     */
    public frmGenerarOrden(String usuario) {
        initComponents();
        tfUsuario.setText(usuario);
        
        //contador de ingredientes
        //public static int cont=0;
        
        //ArrayList<Producto> ListaProductos = new ArrayList<Producto>();
        
        //Excepcion para cargar imagen
        try{
            BufferedImage ordenIcono = ImageIO.read(new File("src/icons/orden_icon.png"));
            icon.setIcon(new ImageIcon(ordenIcono));
        }catch (Exception e){
            
        }        
        
        //generar fecha de ingreso de orden
        //String fecha = new SimpleDateFormat("")
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String fecha_hora = dateFormat.format(date); //2016/11/16 12:08:43
        tfFechaOrden.setText(fecha_hora);
        
        DefaultTableModel dtm = (DefaultTableModel)tablaProductosOrden.getModel();
        dtm.setRowCount(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btBuscarCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfFechaOrden = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductosOrden = new javax.swing.JTable();
        tfSubTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfIVA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btIngresarOrden = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        btIngresarProductosOrden = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfDescuento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfSubtotalCero = new javax.swing.JTextField();
        icon = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();
        tbEliminarItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generacion de Orden");

        jLabel1.setText("Datos del Cliente");

        jLabel2.setText("Cedula:");

        tfCedula.setEditable(false);
        tfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombres:");

        tfNombres.setEditable(false);

        jLabel4.setText("Apellidos:");

        tfApellidos.setEditable(false);

        jLabel5.setText("Correo:");

        tfCorreo.setEditable(false);

        jLabel6.setText("Direccion:");

        tfDireccion.setEditable(false);

        jLabel7.setText("Datos de Orden");

        btBuscarCliente.setText("Buscar Clientes");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha:");

        tfFechaOrden.setEditable(false);

        jLabel9.setText("Usuario:");

        tfUsuario.setEditable(false);

        jLabel10.setText("Detalle de la Orden:");

        tablaProductosOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Descripcion (Productos)", "Precio Unitario", "Precio Total"
            }
        ));
        tablaProductosOrden.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tablaProductosOrden);

        tfSubTotal.setEditable(false);
        tfSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel11.setText("SubTotal:");

        tfIVA.setEditable(false);
        tfIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel12.setText("SubTotal IVA %:");

        tfTotal.setEditable(false);
        tfTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Total:");

        btIngresarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/orden2_icon.png"))); // NOI18N
        btIngresarOrden.setText("Ingresar Orden");
        btIngresarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarOrdenActionPerformed(evt);
            }
        });

        jLabel14.setText("Telefono:");

        tfTelefono.setEditable(false);
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        btIngresarProductosOrden.setText("Ingresar Productos");
        btIngresarProductosOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarProductosOrdenActionPerformed(evt);
            }
        });

        jLabel15.setText("Descuento:");

        tfDescuento.setEditable(false);
        tfDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel16.setText("SubTotal 0%:");

        tfSubtotalCero.setEditable(false);
        tfSubtotalCero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btActualizar.setText("Actualizar Datos");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        tbEliminarItem.setText("Eliminar Item");
        tbEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEliminarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(tfFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btBuscarCliente))
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDireccion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btIngresarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btIngresarProductosOrden))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btActualizar)
                                    .addGap(29, 29, 29)
                                    .addComponent(tbEliminarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel15))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(tfSubtotalCero, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfDescuento, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente)
                    .addComponent(jLabel8)
                    .addComponent(tfFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btIngresarProductosOrden, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSubtotalCero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(btActualizar)
                            .addComponent(tbEliminarItem))
                        .addGap(72, 72, 72)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btIngresarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedulaActionPerformed

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        // TODO add your handling code here:
        frmSeleccionCliente_Orden selectCli = new frmSeleccionCliente_Orden();
        selectCli.setVisible(true);
    }//GEN-LAST:event_btBuscarClienteActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void btIngresarProductosOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarProductosOrdenActionPerformed
        // TODO add your handling code here:
        frmSeleccionProductos_Orden inProductosOrden = new frmSeleccionProductos_Orden();
        inProductosOrden.setVisible(true);
        btActualizar.requestFocus();
    }//GEN-LAST:event_btIngresarProductosOrdenActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
        actualizarProductos();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btIngresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarOrdenActionPerformed
        // TODO add your handling code here:
        if (ordenValida()){
            //obtener cantidades de tabla
            ArrayList<String> listaC = new ArrayList<>();
            String cants = "";
            //agregando lista de nombres a un arreglo de strings
            int filas1 [] = tablaProductosOrden.getSelectedRows();
            for (int r=0;r<filas1.length;r++){
                int fila = filas1[r];
                String numeros = tablaProductosOrden.getValueAt(fila,1).toString();
                listaC.add(numeros);
            }
            //convirtiendo el arreglo a un solo string
            StringBuilder sb1 = new StringBuilder();
            for (String s : listaC)
            {
                sb1.append(s);
                sb1.append(",");
            }
            cants=sb1.toString();
            
            //obtener productos de tabla
            ArrayList<String> listaP = new ArrayList<>();
            String nombs_prod = "";
            //agregando lista de nombres a un arreglo de strings
            int filas [] = tablaProductosOrden.getSelectedRows();
            for (int r=0;r<filas.length;r++){
                int fila = filas[r];
                String ids = tablaProductosOrden.getValueAt(fila,1).toString();
                listaP.add(ids);
            }
            //convirtiendo el arreglo a un solo string
            StringBuilder sb = new StringBuilder();
            for (String s : listaP)
            {
                sb.append(s);
                sb.append(",");
            }
            nombs_prod=sb.toString();
            
            //ingreso de datos de orden
            String fechahora = tfFechaOrden.getText();
            String usuario = tfUsuario.getText();
            String cliente = tfCedula.getText();
            String estado = "cancelado";
            String cantidades = cants;
            String productos = nombs_prod;
            float subTotal = Float.parseFloat(tfSubTotal.getText());
            float descuento = Float.parseFloat(tfDescuento.getText());
            float subcero = Float.parseFloat(tfSubtotalCero.getText());
            float iva = Float.parseFloat(tfIVA.getText());
            float total = Float.parseFloat(tfTotal.getText());
            
            //convirtiendo fecha
            try{
                Orden orden1 = new Orden(fechahora, usuario, cliente, estado, cantidades, productos, subTotal, descuento, subcero, iva, total);
                System.out.println("objeto orden creado...");
                ConexionBase c = new ConexionBase();
                try{
                    c.conectar();
                    if(c.ingresarOrden(orden1)){
                        System.out.println("orden ingresada correctamente");
                        JOptionPane.showMessageDialog(this,"Orden ingresada Correctamente","Ingreso Correcto",JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }else{
                        System.out.println("error al ingresar orden");
                        JOptionPane.showMessageDialog(this,"Orden no ingresada","Ingreso Incorrecto",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Formulario Invalido","Ingreso Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btIngresarOrdenActionPerformed

    private void tbEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEliminarItemActionPerformed
        // TODO add your handling code here:
        int fila = tablaProductosOrden.getSelectedRow();
        if (seleccionEliminacionValida()){
            DefaultTableModel dtm = (DefaultTableModel)tablaProductosOrden.getModel();
            dtm.removeRow(fila);
            calcularTotal();
        }
        
    }//GEN-LAST:event_tbEliminarItemActionPerformed

    /**
     * @param args the command line arguments
     */

    private boolean ordenValida(){
        if(tfCedula.getText().equals("") /*|| tablaProductosOrden.getSelectedRowCount()==0 */ ){
            return false;
        }
        return true;
    }
    
    private void actualizarProductos(){
        String detalle = frmSeleccionProductos_Orden.tfDetalle.getText();
        System.out.println("Producto Obtenido Orden: "+ detalle);
        //obteniendo datos de string detalle
        ArrayList lista = new ArrayList(Arrays.asList(detalle.split(",")));
        
        //agregando items al detalle
        DefaultTableModel dtm = (DefaultTableModel)tablaProductosOrden.getModel();
        Object[] det = {lista.get(0),lista.get(2),lista.get(3),lista.get(4)};
        dtm.addRow(det);
        
        calcularTotal();
    }
    
    private void actualizarDatos(){
        
    }
    
    private boolean seleccionEliminacionValida(){ 
        int n = tablaProductosOrden.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar mínimo un Item para eliminar","Eliminación",JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de eliminar los registros seleccionados?","Eliminación",JOptionPane.YES_NO_OPTION);
        if(op==0)
            return true;
        else
            return false;
    }
    
    private void calcularTotal(){
        //Obteniendo calculos
        float subtotal = 0;
        for (int i=0;i<tablaProductosOrden.getRowCount();i++){
            DefaultTableModel dtm = (DefaultTableModel)tablaProductosOrden.getModel();
            float precioTotal = Float.parseFloat(dtm.getValueAt(i,3).toString());
            System.out.println(precioTotal);
            subtotal = subtotal+precioTotal;
            System.out.println(subtotal);
        }
        System.out.println("subtotal: "+subtotal);
        tfSubTotal.setText(String.valueOf(subtotal));
        float descuento = 0;
        tfDescuento.setText(String.valueOf(descuento));
        float subtotalcero = 0;
        tfSubtotalCero.setText(String.valueOf(subtotalcero));
        float sub_iva = subtotal*0.14f;
        tfIVA.setText(String.valueOf(sub_iva));
        float Total = subtotal + sub_iva;
        tfTotal.setText(String.valueOf(Total));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btIngresarOrden;
    private javax.swing.JButton btIngresarProductosOrden;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaProductosOrden;
    private javax.swing.JButton tbEliminarItem;
    public static javax.swing.JTextField tfApellidos;
    public static javax.swing.JTextField tfCedula;
    public static javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDescuento;
    public static javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfFechaOrden;
    private javax.swing.JTextField tfIVA;
    public static javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfSubTotal;
    private javax.swing.JTextField tfSubtotalCero;
    public static javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
