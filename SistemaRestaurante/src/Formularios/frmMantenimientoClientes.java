/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import bd.ConexionBase;
import java.util.ArrayList;
import sun.security.util.PropertyExpander;
import Objetos.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Funciones.*;

/**
 *
 * @author Julian
 */
public class frmMantenimientoClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmMantenimientoClientes
     */
    public frmMantenimientoClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipoConsulta = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btingresar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Clientes");

        cbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cedula", "Nombres", "Apellidos" }));

        tfdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdescripcionActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombres", "Apellidos", "Direccion", "Telefono", "Correo", "Edad", "Fecha Nacimiento", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        btingresar.setText("Ingresar");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(btingresar)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 87, Short.MAX_VALUE)
                        .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btConsultar)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar)
                    .addComponent(btEditar)
                    .addComponent(btingresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdescripcionActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        if(formularioConsultaValidoA()){
            consultarRegistro();}
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        if (seleccionEliminacionValida()){
            ConexionBase c = new ConexionBase();
            try{
                c.conectar();
                int filas[] =tablaClientes.getSelectedRows();
                    for (int i = 0; i < filas.length; i++) {
                        int fila = filas[i];
                        String id = tablaClientes.getValueAt(fila,0).toString();
                        if(!c.eliminarCliente(Integer.parseInt(id))){
                            JOptionPane.showMessageDialog(this,"Ocurrió un error en la eliminación","Eliminación",JOptionPane.ERROR_MESSAGE);
                            return ;
                        }
                    }
            }catch(Exception e){
                System.out.println(e);
            }
            c.desconectar();
        }
        if(formularioConsultaValidoA()){
            consultarRegistro();}
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
        // TODO add your handling code here:
        frmIngresoClientes incli= new frmIngresoClientes();
        incli.setVisible(true);
    }//GEN-LAST:event_btingresarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        if (seleccionEdicionValida()){
            int fila = tablaClientes.getSelectedRow();
            String id = tablaClientes.getValueAt(fila,0).toString();
            String cedula = tablaClientes.getValueAt(fila,1).toString();
            ArrayList<Cliente> cli = new ArrayList<>();
            ConexionBase c = new ConexionBase();

            try{
                c.conectar();
                cli = c.consultarClientes("","cedula");
            }catch (Exception e){
                System.out.println("Error al iniciar edicion de cliente");
            }
            c.desconectar();

            if (Validaciones.validarDupCliCedula(cli, cedula)){
                frmEdicionClientes cliedit = new frmEdicionClientes(id,cedula,this);
                cliedit.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"El cliente seleccionado no existe","Edición",JOptionPane.ERROR_MESSAGE);
                System.out.println("El cliente no existe");
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void consultarRegistro(){
        String tipo = cbTipoConsulta.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBase c = new ConexionBase();
                c.conectar();
                
                ArrayList<Cliente> registro = c.consultarClientes("","cliente");
                ArrayList<Cliente> resultado = new ArrayList<Cliente>();
                
                if (tipo.equals("Todos")){
                    resultado = registro;
                }else{
                    for (Cliente c1:registro){
                        if(cbTipoConsulta.equals("Cedula")){
                            if(c1.getCedula().contains(descripcion)){
                                resultado.add(c1);
                            }
                        }
                        if(cbTipoConsulta.equals("Nombres")){
                            if(c1.getNombres().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(c1);
                            }
                        }
                        if(cbTipoConsulta.equals("Apellidos")){
                            if(c1.getApellidos().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(c1);
                            }
                        }
                    }
                    //System.out.println("consulta invalida...");
                }
                DefaultTableModel dtm = (DefaultTableModel)tablaClientes.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (Cliente cli:resultado){
                    Object[] fila = new Object[10];
                    fila[0] = cli.getId();
                    fila[1] = cli.getCedula();
                    fila[2] = cli.getNombres();
                    fila[3] = cli.getApellidos();
                    fila[4] = cli.getDireccion();
                    fila[5] = cli.getTelefono();
                    fila[6] = cli.getCorreo();
                    fila[7] = cli.getEdad();
                    fila[8] = cli.getFecha_nacimiento();
                    fila[9] = cli.getTipo();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar clientes");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean seleccionEdicionValida(){
        int n = tablaClientes.getSelectedRowCount();
        if(n!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro para editar",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    
    }
    
    private boolean seleccionEliminacionValida(){ 
        int n = tablaClientes.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar mínimo un registro para eliminar",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de eliminar los registros seleccionados?","Eliminación",JOptionPane.YES_NO_OPTION);
        if(op==0)
            return true;
        else
            return false;
    }

    private boolean formularioConsultaValidoA(){
        String tipo = cbTipoConsulta.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        /*
        if(!tipo.equals("Todo") && descripcion.equals("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }*/
        if(tipo.equals("Cedula")){
            try{
                tfdescripcion.equals("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }        
        }
        if(tipo.equals("Nombres")){
            try{
                tfdescripcion.equals("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }        
        }
        if(tipo.equals("Apellidos")){
            try{
                tfdescripcion.equals("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }        
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btingresar;
    private javax.swing.JComboBox<String> cbTipoConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}
