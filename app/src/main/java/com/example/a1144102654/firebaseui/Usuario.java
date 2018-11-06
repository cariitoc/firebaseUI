package com.example.a1144102654.firebaseui;

public class Usuario {
    public String uid;
    public String nombre;
    public String correo;
    public String pass;

    public Usuario(){
        //Es requisito de Firebase

    }

    public Usuario(String uid, String nombre, String correo, String pass) {
        this.uid = uid;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
    }
}
