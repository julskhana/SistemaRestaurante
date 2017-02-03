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
public class Cliente implements Serializable{
    
    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String tipo;
    private int edad;
    private String fecha_nacimiento;
    private String sexo;
    private String estado;
    private String direccion;
    private String telefono;
    
    public Cliente(int id, String cedula, String nombres, String apellidos, String correo, String tipo , int edad, String fecha_nacimiento, String sexo, String estado, String direccion, String telefono){
        this.id=id;
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.correo=correo;
        this.tipo=tipo;
        this.edad=edad;
        this.fecha_nacimiento=fecha_nacimiento;
        this.sexo=sexo;
        this.estado=estado;
        this.direccion=direccion;
        this.telefono=telefono;
                
    }
    
    //Constructor vacio Cliente
    public Cliente(){}
    
    //Funciones para ingresar datos clientes

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
    //Funciones para obtener datos clientes

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstado() {
        return estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
