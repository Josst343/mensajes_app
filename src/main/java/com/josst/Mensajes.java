package com.josst;

public class Mensajes {

    private int id_mensaje;
    private String mensjae;
    private String autor_mensaje;
    private String fecha_mensaje;

    public Mensajes() {
    }

    public Mensajes( String mensjae, String autor_mensaje, String fecha_mensaje) {
        this.mensjae = mensjae;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensjae() {
        return mensjae;
    }

    public void setMensjae(String mensjae) {
        this.mensjae = mensjae;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}
