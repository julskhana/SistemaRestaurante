/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Formularios.*;

/**
 *
 * @author Julian
 * 
 * Version 0.2
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        NOTAS
        
        IMPLEMENTAR CAMBIO DE CLAVE, INGRESO DIFERENTE A USUARIOS ADMINISTRADORES Y CAJEROS, ADEMAS DE AGREGAR OPCIONES
        DE CIERRE DE SESION DE USUARIOS.
        
        */
        
        // SELECCION PARA EJECUTAR EL PROGRAMA CON O SIN INGRESO DE USUARIOS
        int estadoIn = 1;
        //
        if (estadoIn==1){
            // CODIGO PARA PRESENTACION DE PROYECTO
            frmLogin login = new frmLogin();
            login.setVisible(true);
        }else{
            // CODIGO PARA PRUEBAS DE PROGRAMACION
            FrmPrincipal principal = new FrmPrincipal("Julian Bajaña","jaba");
            principal.setVisible(true);
        }
    }
}
