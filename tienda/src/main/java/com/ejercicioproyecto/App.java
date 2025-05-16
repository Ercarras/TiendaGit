package com.ejercicioproyecto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Categoria camisetas = new Categoria(1, "Camisetas");

        // Creo un producto ropa
        Ropa camiseta1 = new Ropa(1, "Camiseta Blanca", 19.99, camisetas, "M", "Blanco", "Algodón");
        camisetas.asignarProducto(camiseta1);

        // Creo un cliente 
        Cliente cliente1 = new Cliente(1, "Ana Pérez", "ana@email.com", "Calle Falsa 123", "600123456");

        // Creamos una orden
        Orden orden1 = new Orden(1);
        orden1.agregarProducto(camiseta1);
        cliente1.realizarOrden(orden1);

        camisetas.mostrarProductos();

        // Creamos un pago
        Pago pago1 = new Pago(1, orden1.getFactura(), "Tarjeta");
        pago1.mostrarDetalles();
        pago1.procesarPago();
        pago1.mostrarDetalles();
    }
}
