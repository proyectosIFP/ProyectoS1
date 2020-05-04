package com.example.aplicacinftc.Models;

public class User {

    private String nombre;
    private String apellidos;
    private String email;
    private String edad;
    private String foto;
    private String recordar;

    public User(String nombre, String apellidos, String email, String edad, String foto, String recordar) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.foto = foto;
        this.recordar = recordar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRecordar() {
        return recordar;
    }

    public void setRecordar(String recordar) {
        this.recordar = recordar;
    }
}
