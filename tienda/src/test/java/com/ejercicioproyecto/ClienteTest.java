package com.ejercicioproyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {
    @Test
public void pruebaActualizarDatosCliente() {
    Cliente cliente = new Cliente(1, "Juan", "juan@correo.com", "Calle 1", "111111111");

    cliente.actualizarDatos("Maria", "maria@correo.com", "Calle 2", "222222222");

    assertEquals("Maria", cliente.getNombre());
    assertEquals("maria@correo.com", cliente.getCorreo());
    assertEquals("Calle 2", cliente.getDireccion());
    assertEquals("222222222", cliente.getTelefono());
}
}
