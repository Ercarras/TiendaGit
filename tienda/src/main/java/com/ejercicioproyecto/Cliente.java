package com.ejercicioproyecto;

public class Cliente {

    private int id_Cliente;
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;

    public Cliente(int idCliente, String nombre, String correo, String direccion, String telefono) {

        this.id_Cliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public Cliente() {
    }

    public int getId_Cliente(){
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente){
        this.id_Cliente = id_Cliente;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void realizarOrden(Orden orden) {
        System.out.println(nombre + " ha realizado una orden con ID: " + orden.getIdOrden());
    }

    public void actualizarDatos(String nombre, String correo, String direccion, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
