/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 * String cliente = "cedula,nombre,direccion,telefono,correo"
 * String fecha = "AAAA-MM-DD HH:MM:SS"
 * String productos =id_producto,nombre,precio_unit"
 * @author Julian
 */
public class Orden {
    // FACTURA
    //datos cliente
    int id;
    String codigo;
    String fecha;
    String cliente;
    //detalle orden
    int cantidad;
    String productos;
    //valores
    float sub_total;
    float iva;
    float total;
    
    public Orden(int id,String codigo, String fecha, String cliente, int cantidad,String productos,float subt,float iva,float total){
        this.id=id;
        this.codigo=codigo;
        this.fecha=fecha;
        this.cliente=cliente;
        this.cantidad=cantidad;
        this.productos=productos;
        this.sub_total=subt;
        this.iva=iva;
        this.total=total;
    }
    
    //constructor vacio
    public Orden(){}
    
    //getter

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public int getCantidad() {
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
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCantidad(int cantidad) {
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
    
}
