package com.ejercicioproyecto;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
     private int idCategoria;
    private String nombre;
    private List<Producto> productos;

    public Categoria(int id, String nombre) {
        this.idCategoria = id;
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void asignarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos en la categoría: " + nombre);
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getidCategoria(){
        return idCategoria;
    }
}
