/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

//import Formularios.Consultas.*;
import javax.swing.JOptionPane;

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
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mcCambioClave = new javax.swing.JMenuItem();
        mnArchSalir = new javax.swing.JMenuItem();
        mMantenimiento = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnUser = new javax.swing.JMenuItem();
        mnProducto = new javax.swing.JMenuItem();
        mnIngredientes = new javax.swing.JMenuItem();
        mProcesos = new javax.swing.JMenu();
        mnCreacionPlato = new javax.swing.JMenuItem();
        mnInPedido = new javax.swing.JMenuItem();
        mAcciones = new javax.swing.JMenu();
        mnListCli = new javax.swing.JMenuItem();
        mnListProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnListUsers = new javax.swing.JMenuItem();
        mnPedidos = new javax.swing.JMenuItem();
        mAcercade = new javax.swing.JMenu();
        mnInfo = new javax.swing.JMenuItem();
        mnAyuda = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

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

        mnCliente.setText("Cliente");
        mMantenimiento.add(mnCliente);

        mnUser.setText("Usuarios");
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });
        mMantenimiento.add(mnUser);

        mnProducto.setText("Producto");
        mMantenimiento.add(mnProducto);

        mnIngredientes.setText("Ingrediente");
        mMantenimiento.add(mnIngredientes);

        jMenuBar1.add(mMantenimiento);

        mProcesos.setText("Procesos");

        mnCreacionPlato.setText("Creacion de Platos");
        mProcesos.add(mnCreacionPlato);

        mnInPedido.setText("Ingresar Pedido");
        mProcesos.add(mnInPedido);

        jMenuBar1.add(mProcesos);

        mAcciones.setText("Reportes");

        mnListCli.setText("Lista Clientes");
        mAcciones.add(mnListCli);

        mnListProductos.setText("Lista Productos");
        mAcciones.add(mnListProductos);

        jMenuItem1.setText("Lista Ingredientes");
        mAcciones.add(jMenuItem1);

        mnListUsers.setText("Lista Usuarios");
        mAcciones.add(mnListUsers);

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

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        // TODO add your handling code here:
        //frmDispUsuario dispuser = new frmDispUsuario();
        //dispuser.setVisible(true);
    }//GEN-LAST:event_mnUserActionPerformed

    private void mAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAcercadeActionPerformed
        // TODO add your handling code here:
        frmAcercaDe info = new frmAcercaDe();
        info.setVisible(true);
    }//GEN-LAST:event_mAcercadeActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mAcciones;
    private javax.swing.JMenu mAcercade;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mMantenimiento;
    private javax.swing.JMenu mProcesos;
    private javax.swing.JMenuItem mcCambioClave;
    private javax.swing.JMenuItem mnArchSalir;
    private javax.swing.JMenuItem mnAyuda;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnCreacionPlato;
    private javax.swing.JMenuItem mnInPedido;
    private javax.swing.JMenuItem mnInfo;
    private javax.swing.JMenuItem mnIngredientes;
    private javax.swing.JMenuItem mnListCli;
    private javax.swing.JMenuItem mnListProductos;
    private javax.swing.JMenuItem mnListUsers;
    private javax.swing.JMenuItem mnPedidos;
    private javax.swing.JMenuItem mnProducto;
    private javax.swing.JMenuItem mnUser;
    // End of variables declaration//GEN-END:variables
}