/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

//import Formularios.Consultas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Objetos.*;
import bd.ConexionBase;

/**
 *
 * @author julian
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        System.out.println("Ingreso al Sistema");
        
        //conexion a base de datos
        ConexionBase c = new ConexionBase();
        ArrayList<Cliente> listaC = new ArrayList<Cliente>();
        try{
            c.conectar();
            listaC = c.cargarClientes(); 
            System.out.println("se cargaron correctamente los datos desde la base");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("error la cargar datos desde base");
        }
        c.desconectar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mcCambioClave = new javax.swing.JMenuItem();
        mnArchSalir = new javax.swing.JMenuItem();
        mMantenimiento = new javax.swing.JMenu();
        mClientes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mEditarClientes = new javax.swing.JMenuItem();
        mProductos = new javax.swing.JMenu();
        mnIngresarCliente = new javax.swing.JMenuItem();
        mnEditarCliente = new javax.swing.JMenuItem();
        mIngredientes = new javax.swing.JMenu();
        mnIngresarIngredientes = new javax.swing.JMenuItem();
        mnEditarIngredientes = new javax.swing.JMenuItem();
        mProcesos = new javax.swing.JMenu();
        mnInPedido = new javax.swing.JMenuItem();
        mnCreacionPlato = new javax.swing.JMenuItem();
        mnConsultaClientes = new javax.swing.JMenuItem();
        mnConsultaIngredientes = new javax.swing.JMenuItem();
        mnConsultarIngredientes = new javax.swing.JMenuItem();
        mAcciones = new javax.swing.JMenu();
        mnListCli = new javax.swing.JMenuItem();
        mnListProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnPedidos = new javax.swing.JMenuItem();
        mAcercade = new javax.swing.JMenu();
        mnInfo = new javax.swing.JMenuItem();
        mnAyuda = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Encuenstas para Restaurantes - Java");

        mArchivo.setText("Archivo");

        mcCambioClave.setText("Cambio de Contraseña");
        mArchivo.add(mcCambioClave);

        mnArchSalir.setText("Salir");
        mnArchSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchSalirActionPerformed(evt);
            }
        });
        mArchivo.add(mnArchSalir);

        jMenuBar1.add(mArchivo);

        mMantenimiento.setText("Mantenimiento");

        mClientes.setText("Clientes");

        jMenuItem2.setText("Ingresar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mClientes.add(jMenuItem2);

        mEditarClientes.setText("Editar Clientes");
        mEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEditarClientesActionPerformed(evt);
            }
        });
        mClientes.add(mEditarClientes);

        mMantenimiento.add(mClientes);

        mProductos.setText("Productos");

        mnIngresarCliente.setText("Ingresar Productos");
        mProductos.add(mnIngresarCliente);

        mnEditarCliente.setText("Editar Productos");
        mProductos.add(mnEditarCliente);

        mMantenimiento.add(mProductos);

        mIngredientes.setText("Ingredientes");

        mnIngresarIngredientes.setText("Ingresar Ingredientes");
        mIngredientes.add(mnIngresarIngredientes);

        mnEditarIngredientes.setText("Editar Ingredientes");
        mIngredientes.add(mnEditarIngredientes);

        mMantenimiento.add(mIngredientes);

        jMenuBar1.add(mMantenimiento);

        mProcesos.setText("Procesos");

        mnInPedido.setText("Ingresar Orden");
        mProcesos.add(mnInPedido);

        mnCreacionPlato.setText("Creacion de Platos");
        mProcesos.add(mnCreacionPlato);

        mnConsultaClientes.setText("Consultar Clientes");
        mProcesos.add(mnConsultaClientes);

        mnConsultaIngredientes.setText("Consultar Platos");
        mProcesos.add(mnConsultaIngredientes);

        mnConsultarIngredientes.setText("Consultar Ingredientes");
        mProcesos.add(mnConsultarIngredientes);

        jMenuBar1.add(mProcesos);

        mAcciones.setText("Reportes");

        mnListCli.setText("Lista Clientes");
        mAcciones.add(mnListCli);

        mnListProductos.setText("Lista Productos");
        mAcciones.add(mnListProductos);

        jMenuItem1.setText("Lista Ingredientes");
        mAcciones.add(jMenuItem1);

        mnPedidos.setText("Pedidos");
        mAcciones.add(mnPedidos);

        jMenuBar1.add(mAcciones);

        mAcercade.setText("Acerca De...");
        mAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAcercadeActionPerformed(evt);
            }
        });

        mnInfo.setText("Informacion");
        mnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoActionPerformed(evt);
            }
        });
        mAcercade.add(mnInfo);

        mnAyuda.setText("Ayuda");
        mAcercade.add(mnAyuda);

        jMenuBar1.add(mAcercade);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presentarInfoUser(){
        
    }
    
    private void mnArchSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchSalirActionPerformed
        // TODO add your handling code here:
        //SALIR
        int opt1= JOptionPane.showConfirmDialog(this,"Esta Seguro de que desea Salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(opt1==0){
            System.exit(0);
        }
    }//GEN-LAST:event_mnArchSalirActionPerformed

    private void mnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoActionPerformed
        // TODO add your handling code here:
        //Ejecucion de Informacion
        frmAcercaDe info = new frmAcercaDe();
        info.setVisible(true);
    }//GEN-LAST:event_mnInfoActionPerformed

    private void mAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAcercadeActionPerformed
        // TODO add your handling code here:
        frmAcercaDe info = new frmAcercaDe();
        info.setVisible(true);
    }//GEN-LAST:event_mAcercadeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmIngresoClientes inClientes = new frmIngresoClientes();
        inClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEditarClientesActionPerformed
        // TODO add your handling code here:
        frmEdicionClientes edClientes = new frmEdicionClientes();
        edClientes.setVisible(true);
    }//GEN-LAST:event_mEditarClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mAcciones;
    private javax.swing.JMenu mAcercade;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem mEditarClientes;
    private javax.swing.JMenu mIngredientes;
    private javax.swing.JMenu mMantenimiento;
    private javax.swing.JMenu mProcesos;
    private javax.swing.JMenu mProductos;
    private javax.swing.JMenuItem mcCambioClave;
    private javax.swing.JMenuItem mnArchSalir;
    private javax.swing.JMenuItem mnAyuda;
    private javax.swing.JMenuItem mnConsultaClientes;
    private javax.swing.JMenuItem mnConsultaIngredientes;
    private javax.swing.JMenuItem mnConsultarIngredientes;
    private javax.swing.JMenuItem mnCreacionPlato;
    private javax.swing.JMenuItem mnEditarCliente;
    private javax.swing.JMenuItem mnEditarIngredientes;
    private javax.swing.JMenuItem mnInPedido;
    private javax.swing.JMenuItem mnInfo;
    private javax.swing.JMenuItem mnIngresarCliente;
    private javax.swing.JMenuItem mnIngresarIngredientes;
    private javax.swing.JMenuItem mnListCli;
    private javax.swing.JMenuItem mnListProductos;
    private javax.swing.JMenuItem mnPedidos;
    // End of variables declaration//GEN-END:variables
}
