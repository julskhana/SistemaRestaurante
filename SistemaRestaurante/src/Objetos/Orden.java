/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.util.Date;

/**
 * EL OBJETO ORDEN TENDRA VARIOS STRINGS QUE CONTENDRAN DATOS DE CLIENTES, INGREDIENTES Y PRECIOS
 * DE ESTA FORMA SE RECORRERA CADA STRING FORMATEADO PARA OBTENER ESTOS BALORES.
 * 
 * String cliente = "cedula,nombre,direccion,telefono,correo"
 * String fecha = "AAAA-MM-DD HH:MM:SS"
 * String productos =id_producto,nombre,precio_unit"
 * @author Julian
 */
public class Orden {
    // FACTURA
    //datos cliente
    int id;
    String fecha;
    String usuario; //cedula
    String cliente; //cedula
    String estado;
    //detalle orden
    String cantidad;
    String productos;
    //valores
    float sub_total;
    float descuento;
    float subcero;
    float iva;
    float total;
    
    public Orden(int id, String fecha,String usuario, String cliente,String estado, String cantidad,String productos,float subt,float desc,float subcero,float iva,float total){
        this.id=id;
        this.fecha=fecha;
        this.usuario=usuario;
        this.cliente=cliente;
        this.estado=estado;
        this.cantidad=cantidad;
        this.productos=productos;
        this.sub_total=subt;
        this.descuento=desc;
        this.subcero=subcero;
        this.iva=iva;
        this.total=total;
    }
    
    //constructor vacio
    public Orden(){}
    
    //onstructor para ingreso de ordenes
    public Orden(String fecha,String usuario, String cliente,String estado, String cantidad,String productos,float subt,float desc,float subcero,float iva,float total){
        this.fecha=fecha;
        this.usuario=usuario;
        this.cliente=cliente;
        this.estado=estado;
        this.cantidad=cantidad;
        this.productos=productos;
        this.sub_total=subt;
        this.descuento=desc;
        this.subcero=subcero;
        this.iva=iva;
        this.total=total;
    }
    
    //getter

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getProductos() {
        return productos;
    }

    public float getSub_total() {
        return sub_total;
    }

    public float getIva() {
        return iva;
    }

    public float getTotal() {
        return total;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getSubcero() {
        return subcero;
    }
    
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setSub_total(float sub_total) {
        this.sub_total = sub_total;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setSubcero(float subcero) {
        this.subcero = subcero;
    }
    
}
