/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.LinkedList;

/**
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
    private LinkedList<Ingrediente> ingredientes;
    
    //constructor normal
    public Producto(int id,String nombre,String descripcion,String tamaño,float precio,String tipo,LinkedList<Ingrediente> ing){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.ingredientes=ing;
    }
    
    //constructor para ingresar productos
    public Producto(String nombre,String descripcion,String tamaño,float precio,String tipo,LinkedList<Ingrediente> ing){
        //this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.ingredientes=ing;
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

    public LinkedList<Ingrediente> getIngredientes() {
        return ingredientes;
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

    public void setIngredientes(LinkedList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
