/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private String nombre_med;
    private String tipo_med;
    private int cantidad;
    private String distribuidor;
    private String sucursal;
    
    public Pedido(){
    }

    public Pedido(String nombre_med, String tipo_med, int cantidad, String distribuidor, String sucursal) {
        this.nombre_med = nombre_med;
        this.tipo_med = tipo_med;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.sucursal = sucursal;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getTipo_med() {
        return tipo_med;
    }

    public void setTipo_med(String tipo_med) {
        this.tipo_med = tipo_med;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nombre_med=" + nombre_med + ", tipo_med=" + tipo_med + ", cantidad=" + cantidad + ", distribuidor=" + distribuidor + ", sucursal=" + sucursal + '}';
    }
    
    
}

