package com.ejercicioproyecto;

public class Ropa extends Producto{
    private String talla;
    private String color;
    private String tela;

    public Ropa(int id, String nombre, double precio, Categoria categoria, String talla, String color, String tela) {
        super(id, nombre, precio, categoria);
        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Talla: " + talla + ", Color: " + color + ", Tela: " + tela);
    }
}
