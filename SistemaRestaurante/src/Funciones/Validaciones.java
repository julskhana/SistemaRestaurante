/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Objetos.*;
import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Validaciones {
    
    public static boolean validarDupCliCedula(ArrayList<Cliente> registroC, String cedula){
        for (Cliente p:registroC){
            if(p.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean validarDupUsrCedula(ArrayList<Cliente> registroU, String cedula){
        for (Cliente p:registroU){
            if(p.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }

}
