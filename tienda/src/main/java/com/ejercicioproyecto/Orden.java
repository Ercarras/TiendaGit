package com.ejercicioproyecto;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private int idOrden;
    private String fecha;
    private String estado;
    private List<Producto> productos;
    private double factura;

    public Orden(int id) {
        this.idOrden = id;
        this.fecha = new String();
        this.estado = "pendiente";
        this.productos = new ArrayList<>();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void calcularFacturaTotal() {
        factura = 0;
        for (Producto p : productos) {
            factura += p.getPrecio();
        }
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        calcularFacturaTotal();
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        calcularFacturaTotal();
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public double getFactura() {
        return factura;
    }

}
