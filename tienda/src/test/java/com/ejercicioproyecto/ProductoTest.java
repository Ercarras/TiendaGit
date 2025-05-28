package com.ejercicioproyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {

    @Test
    public void pruebaGetPrecio() {
        Categoria c1 = new Categoria(0, "Sobrecamisas");
        Producto p = new Producto(1, "Camisa", 134, c1);
        double precioEsperado = 134;
        double precioReal = p.getPrecio();
        assertEquals(precioEsperado, precioReal, 0.001);
    }
}

