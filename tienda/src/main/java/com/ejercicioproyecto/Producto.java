package com.ejercicioproyecto;

public class Producto {
    protected int idProducto;
    protected String nombre;
    protected double precio;
    protected Categoria categoria;

    public Producto(int id, String nombre, double precio, Categoria categoria) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + "€, Categoría: " + categoria.getNombre());
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public double getPrecio() {
        return precio;
    }
}
