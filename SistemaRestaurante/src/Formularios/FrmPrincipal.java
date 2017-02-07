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
import java.util.LinkedList;

/**
 *
 * @author julian
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(String nombreUsr, String cuentaUser) {
        initComponents();
        tfNombreUsr.setText(nombreUsr);
        lbCuenta.setText(cuentaUser);
        System.out.println("Ingreso al Sistema");
        
        //CARGA DE INGREDIENTES PARA CREAR PRODUCTOS
        ConexionBase c = new ConexionBase();
        try{
            c.conectar();
            ArrayList<Ingrediente> ing = c.consultarIngredientes("","ingrediente");
            LinkedList<Ingrediente> ln = new LinkedList();
            ln.add(ing.get(3));
            ln.add(ing.get(4));
            
            Producto pr = new Producto(1,"arroz con atun","arroz atun","mediano",2,"at",ln);
            
            System.out.println(pr.getIngredientes().get(0).getId());
            System.out.println(pr.getIngredientes().get(1).getId());
            
        }catch(Exception e){
            System.out.println(e);
        }
        c.desconectar();
        
        /*
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
        */
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
        jLabel1 = new javax.swing.JLabel();
        tfNombreUsr = new javax.swing.JTextField();
        lbCuenta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mcCambioClave = new javax.swing.JMenuItem();
        mnArchSalir = new javax.swing.JMenuItem();
        mnMantenimiento = new javax.swing.JMenu();
        mnMantClientes = new javax.swing.JMenuItem();
        mnIngredientes = new javax.swing.JMenuItem();
        mnProductos = new javax.swing.JMenuItem();
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

        jLabel1.setText("Usuario Activo:");

        tfNombreUsr.setEditable(false);

        lbCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        mArchivo.setText("Archivo");
        mArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mArchivoActionPerformed(evt);
            }
        });

        mcCambioClave.setText("Cambio de Contraseña");
        mcCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcCambioClaveActionPerformed(evt);
            }
        });
        mArchivo.add(mcCambioClave);

        mnArchSalir.setText("Salir");
        mnArchSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchSalirActionPerformed(evt);
            }
        });
        mArchivo.add(mnArchSalir);

        jMenuBar1.add(mArchivo);

        mnMantenimiento.setText("Mantenimiento");

        mnMantClientes.setText("Clientes");
        mnMantClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMantClientesActionPerformed(evt);
            }
        });
        mnMantenimiento.add(mnMantClientes);

        mnIngredientes.setText("Ingredientes");
        mnIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngredientesActionPerformed(evt);
            }
        });
        mnMantenimiento.add(mnIngredientes);

        mnProductos.setText("Productos");
        mnMantenimiento.add(mnProductos);

        jMenuBar1.add(mnMantenimiento);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombreUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(lbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfNombreUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void mnIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngredientesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoIngredientes maning = new frmMantenimientoIngredientes();
        maning.setVisible(true);
    }//GEN-LAST:event_mnIngredientesActionPerformed

    private void mnMantClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMantClientesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoClientes mantCli= new frmMantenimientoClientes();
        mantCli.setVisible(true);
    }//GEN-LAST:event_mnMantClientesActionPerformed

    private void mcCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcCambioClaveActionPerformed
        // TODO add your handling code here:
        String cuenta = lbCuenta.getText();
        frmCambioClave cambioPass = new frmCambioClave(cuenta);
        cambioPass.setVisible(true);
    }//GEN-LAST:event_mcCambioClaveActionPerformed

    private void mArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JMenu mAcciones;
    private javax.swing.JMenu mAcercade;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mProcesos;
    private javax.swing.JMenuItem mcCambioClave;
    private javax.swing.JMenuItem mnArchSalir;
    private javax.swing.JMenuItem mnAyuda;
    private javax.swing.JMenuItem mnConsultaClientes;
    private javax.swing.JMenuItem mnConsultaIngredientes;
    private javax.swing.JMenuItem mnConsultarIngredientes;
    private javax.swing.JMenuItem mnCreacionPlato;
    private javax.swing.JMenuItem mnInPedido;
    private javax.swing.JMenuItem mnInfo;
    private javax.swing.JMenuItem mnIngredientes;
    private javax.swing.JMenuItem mnListCli;
    private javax.swing.JMenuItem mnListProductos;
    private javax.swing.JMenuItem mnMantClientes;
    private javax.swing.JMenu mnMantenimiento;
    private javax.swing.JMenuItem mnPedidos;
    private javax.swing.JMenuItem mnProductos;
    private javax.swing.JTextField tfNombreUsr;
    // End of variables declaration//GEN-END:variables
}
