package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Amd {

    private int id;
    private String nombre;
    private int velocidadM;
    private int tamanoM;
    private int frecuencia;
    private String UrlImagen;

    public Amd() {
    }

    public Amd(int id, String nombre, int velocidadM, int tamanoM, int frecuencia, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.velocidadM = velocidadM;
        this.tamanoM = tamanoM;
        this.frecuencia = frecuencia;
        UrlImagen = urlImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadM() {
        return velocidadM;
    }

    public void setVelocidadM(int velocidadM) {
        this.velocidadM = velocidadM;
    }

    public int getTamanoM() {
        return tamanoM;
    }

    public void setTamanoM(int tamanoM) {
        this.tamanoM = tamanoM;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getUrlImagen() {
        return UrlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        UrlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Amd{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", velocidadM=" + velocidadM +
                ", tamanoM=" + tamanoM +
                ", frecuencia=" + frecuencia +
                ", UrlImagen='" + UrlImagen + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException{
        URL urlImage = new URL(getUrlImagen());
        return new ImageIcon(urlImage);
    }

}
