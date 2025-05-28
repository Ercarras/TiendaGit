package com.ejercicioproyecto;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PagoTest {
    @Test
public void pruebaProcesarPago() {
    Pago pago = new Pago(1, 200.0, "Tarjeta");

    boolean resultado = pago.procesarPago();

    assertTrue(resultado);
    assertTrue(pago.isPagado());
}
}
