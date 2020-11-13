package edu.unicauca.appstore.Entidades;

public class Persona {
    private String nombre;
    private String precio;
    private int foto;

    public Persona(){}

    public Persona(String nombre, String precio, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
