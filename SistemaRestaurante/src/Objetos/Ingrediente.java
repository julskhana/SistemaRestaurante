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
public class Ingrediente implements Serializable{
    private int id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private float costo_porcion;
    private int cantidad;
    
    public Ingrediente(int id, String nombre, String descripcion, String tipo, float costo, int cantidad){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tipo=tipo;
        this.costo_porcion=costo;
        this.cantidad=cantidad;
    }
    
    //constructor vacio ingrediente
    public Ingrediente(){}

    //Funciones para ingresar informacion ingredientes

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto_porcion(float costo_porcion) {
        this.costo_porcion = costo_porcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Funciones para obtener datos ingredientes

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public float getCosto_porcion() {
        return costo_porcion;
    }

    public int getCantidad() {
        return cantidad;
    }       
}
