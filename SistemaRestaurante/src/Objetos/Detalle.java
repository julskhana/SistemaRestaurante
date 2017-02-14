/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Julian
 */
public class Detalle {
    String id;
    int cantidad;
    String productos;
    float precio;
    float precioT;
    
    public Detalle (String id,int cantidad,String productos,float p,float pt){
        this.id=id;
        this.cantidad=cantidad;
        this.productos=productos;
        this.precio=p;
        this.precioT=pt;
    }
    
    public Detalle(){}
    
    //para ingresar detalle a orden
    public Detalle (int cantidad,String productos,float p,float pt){
        //this.id=id;
        this.cantidad=cantidad;
        this.productos=productos;
        this.precio=p;
        this.precioT=pt;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProductos() {
        return productos;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPrecioT() {
        return precioT;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPrecioT(float precioT) {
        this.precioT = precioT;
    }
    
    
}
