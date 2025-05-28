package com.ejercicioproyecto;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrdenTest { //esto prueba que: al agregar productos a una orden, la factura total se actualiza correctamente.
    @Test
    public void pruebaCalculoFacturaTotal() {
        Categoria c1 = new Categoria(1, "Ropa");
        Producto p1 = new Producto(1, "Camisa", 100.0, c1);
        Producto p2 = new Producto(2, "Pantalón", 150.0, c1);

        Orden orden = new Orden(1);
        orden.agregarProducto(p1);
        orden.agregarProducto(p2);

        double esperado = 250.0;
        double actual = orden.getFactura();

        assertEquals(esperado, actual, 0.001);
    }
}
