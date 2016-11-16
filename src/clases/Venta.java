/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author user
 */
public class Venta implements java.io.Serializable{
    private Producto producto;
    private Persona cliente;
    private int unidades;
    private double costo;

    public Venta(Producto producto, Persona cliente, int unidades, double costo) {
        this.producto = producto;
        this.cliente = cliente;
        this.unidades = unidades;
        this.costo = costo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
}
