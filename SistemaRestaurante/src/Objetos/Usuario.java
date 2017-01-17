/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.io.Serializable;

/**
 *
 * @author Julian
 */
public class Usuario implements Serializable{
    private int id;
    private String nombres;
    private String apellidos;
    private String rol;
    private String estado;
    private String clave;
    
    public Usuario(int id, String nombres, String apellidos, String rol, String estado, String clave){
        this.id=id;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.rol=rol;
        this.clave=clave;
    }
    
    //Constructor vaciousuario
    public Usuario(){}

    //funciones para ingresar datos usuario
    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //funciones para obtener datos usuario
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRol() {
        return rol;
    }

    public String getEstado() {
        return estado;
    }

    public String getClave() {
        return clave;
    }
    
    
}
