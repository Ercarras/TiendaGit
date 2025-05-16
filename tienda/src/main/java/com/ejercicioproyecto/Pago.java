package com.ejercicioproyecto;

public class Pago {
    private int idPago;
    private double factura;
    private String metodoPago;
    private String fechaPago;
    private boolean pagado;

    public Pago(int id, double factura, String metodoPago) {
        this.idPago = id;
        this.factura = factura;
        this.metodoPago = metodoPago;
        this.pagado = false;
    }

    public void mostrarDetalles() {
        System.out.println("ID Pago: " + idPago + ", Monto: " + factura + "€, Método: " + metodoPago +
                ", Pagado: " + pagado + ", Fecha: " + (fechaPago != null ? fechaPago : "No realizado"));
    }

    public boolean procesarPago() {
        this.fechaPago = new String();
        this.pagado = true;
        return true;
    }
}
