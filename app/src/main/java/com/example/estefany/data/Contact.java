package com.example.estefany.data;

/**
 * Created by Estefany on 19/12/2016.
 */

public class Contact {

    private String Nombre;
    private String Telefono;
    private String Email;
    private String Description;

    public Contact(String nombre, String telefono) {
        Nombre = nombre;
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
