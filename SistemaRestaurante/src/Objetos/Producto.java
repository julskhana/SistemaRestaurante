/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  EL STRING INGREDIENTES ESTARA CONFORMADO POR TODOS LOS INGREDIENTES USADOS PARA EL PRODUCTO
 *  String ingredientes = "id_1,id_2,....,id_n"
 *  DE ESTA FORMA SE LLAMARA A LOS INGREDIENTES RECORRIENDO EL STRING
 * 
 * @author Julian
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private String tamaño;
    private float precio;
    private String tipo;
    //private LinkedList<Ingrediente> ingredientes;
    private String ingredientes;
    private int ventas;
    
    //constructor normal y consultas
    public Producto(int id,String nombre,String descripcion,String tamaño,float precio,String tipo,String ing, int ventas){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.ingredientes=ing;
        this.ventas=ventas;
    }
    
    //constructor para ingresar productos
    public Producto(String nombre,String descripcion,String tamaño,float precio,String tipo,String ing){
        //this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.ingredientes=ing;
        //this.ventas=ventas;
    }
    
    //constructor vacio
    public Producto(){}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public int getVentas() {
        return ventas;
    }
 
    
    //set

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
}
