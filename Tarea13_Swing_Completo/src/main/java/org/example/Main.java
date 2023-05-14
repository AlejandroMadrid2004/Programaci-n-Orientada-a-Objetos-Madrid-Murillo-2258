package org.example;

import org.example.controller.ControladorVentana;
import org.example.view.Ventana;

public class Main {
    public static void main(String[] args) {

        Ventana view = new Ventana("Primer ejemplo MVC completo");
        ControladorVentana controller = new ControladorVentana(view);
    }
}