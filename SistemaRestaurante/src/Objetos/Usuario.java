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
    private String cedula;
    private String nombre;
    private String rol;
    private String estado;
    private String cuenta;
    private String clave;
    
    public Usuario(int id, String cedula, String nombres, String rol, String estado, String cuenta, String clave){
        this.id=id;
        this.cedula=cedula;
        this.nombre=nombres;
        this.rol=rol;
        this.estado=estado;
        this.cuenta=cuenta;
        this.clave=clave;
    }
    
    //Constructor vaciousuario
    public Usuario(){}

    //constructor para autenticar usuario
    public Usuario(String cuenta, String clave) {
        this.cuenta=cuenta;
        this.clave=clave;
    }
    
    //constuctor para cambio de clave usuario
    public Usuario(int id,String nombre, String cuenta,String clave){
        this.id=id;
        this.nombre=nombre;
        this.cuenta=cuenta;
        this.clave=clave;
    }

    //funciones para ingresar datos usuario
    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    

    //funciones para obtener datos usuario

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public String getEstado() {
        return estado;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getClave() {
        return clave;
    }
    
    
}
