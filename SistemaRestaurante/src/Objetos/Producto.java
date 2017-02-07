/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

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
    private ArrayList<Ingrediente> ingredientes;
    
    //constructor normal
    public Producto(int id,String nombre,String descripcion,String tamaño,float precio,String tipo,ArrayList<Ingrediente> ing){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.ingredientes=ing;
    }
    
    //constructor vacio
    public Producto(){}
    
}
