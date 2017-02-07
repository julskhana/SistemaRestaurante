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
public class Plato {
    int id;
    int id_producto;
    int id_ingrediente;
    
    public Plato(int id, int idpr, int iding){
        this.id=id;
        this.id_producto=idpr;
        this.id_ingrediente=iding;
    }
    
    //constructor vacio
    public Plato(){}
    
    //constructor para ingresar plato
    public Plato(int idp, int idi){
        this.id_producto=idp;
        this.id_ingrediente=idi;
    }

    public int getId() {
        return id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getId_ingrediente() {
        return id_ingrediente;
    }
    
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_ingrediente(int id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }
    
}

