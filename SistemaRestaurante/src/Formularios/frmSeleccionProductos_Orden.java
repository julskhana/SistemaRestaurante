/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Funciones.Validaciones;
import Objetos.Cliente;
import Objetos.Producto;
import bd.ConexionBase;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian
 */
public class frmSeleccionProductos_Orden extends javax.swing.JFrame {

    /**
     * Creates new form frmMantenimientoIngredientes
     */
    public frmSeleccionProductos_Orden() {
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

        cdTipo = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        tbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden - Ingreso de Productos");

        cdTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id", "Nombre" }));

        tbConsultar.setText("Consultar");
        tbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbConsultarActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Tamaño", "Precio", "Tipo", "Ingredientes", "Ventas"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btSeleccionar.setText("Seleccionar");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad:");

        tfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btSeleccionar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbConsultar)
                    .addComponent(jLabel1)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSeleccionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbConsultarActionPerformed
        // TODO add your handling code here:
        if (formularioConsultaValida()){
            consultarRegistro();
        }
    }//GEN-LAST:event_tbConsultarActionPerformed

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
        
        /*
        if (seleccionEdicionValida()){
            int fila = tablaIngredientes.getSelectedRow();
            String id = tablaIngredientes.getValueAt(fila,0).toString();
            String nombre = tablaIngredientes.getValueAt(fila,1).toString();
            ArrayList<Producto> ing = new ArrayList<>();
            ConexionBase c = new ConexionBase();

            try{
                c.conectar();
                ing = c.consultarIngredientes("","id");
            }catch (Exception e){
                System.out.println("Error al iniciar edicion de cliente");
            }
            c.desconectar();

            if (Validaciones.validarDupNombreIng(ing, nombre)){
                //frmEdicionIngredientes ingedit = new frmEdicionIngredientes(id,nombre,this);
                //ingedit.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"El ingrediente seleccionado no existe","Edición",JOptionPane.ERROR_MESSAGE);
                System.out.println("El ingrediente no existe");
            }
        }
        */
        
    }//GEN-LAST:event_btSeleccionarActionPerformed

    private void tfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void consultarRegistro(){
        String tipo = cdTipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBase c = new ConexionBase();
                c.conectar();
                
                ArrayList<Producto> registro = c.consultarProductos("","producto");
                ArrayList<Producto> resultado = new ArrayList<Producto>();
                
                
                if (tipo.equals("Todos")){
                    resultado = registro;
                }else{
                    
                    for (Producto prod:registro){
                        if(cdTipo.equals("Id")){
                            if(prod.getId()==Integer.parseInt(descripcion)){
                                resultado.add(prod);
                            }
                        }
                        if(cdTipo.equals("Nombre")){
                            if(prod.getNombre().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(prod);
                            }
                        }
                        if(cdTipo.equals("Tipo")){
                            if(prod.getTipo().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(prod);
                            }
                        }
                        
                    }
                    //System.out.println("consulta invalida...");
                }
                DefaultTableModel dtm = (DefaultTableModel)tablaProductos.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (Producto pro:resultado){
                    Object[] fila = new Object[8];
                    fila[0] = pro.getId();
                    fila[1] = pro.getNombre();
                    fila[2] = pro.getDescripcion();
                    fila[3] = pro.getTamaño();
                    fila[4] = pro.getPrecio();
                    fila[5] = pro.getTipo();
                    fila[6] = pro.getIngredientes();
                    fila[7] = pro.getVentas();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar productos");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean formularioConsultaValida(){
        String tipo = cdTipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        /*
        if(!tipo.equals("Todo") && descripcion.equals("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }*/
        if(tipo.equals("Nombre") && descripcion.equals("")){
            try{
                descripcion.equals("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Debe ingresar un nombre",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }        
        }
        if(tipo.equals("Id") && descripcion.equals("")){
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
    
    private boolean seleccionValida(){
        int n = tablaProductos.getSelectedRowCount();
        if(n!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro para Seleccionar",
                    "Seleccion Productos",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JComboBox<String> cdTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JButton tbConsultar;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}