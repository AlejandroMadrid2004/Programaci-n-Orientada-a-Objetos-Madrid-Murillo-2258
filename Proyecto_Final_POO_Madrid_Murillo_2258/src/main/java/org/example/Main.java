package org.example;

import org.example.controlador.ControladorAmd;
import org.example.vista.VentanaAmd;

public class Main {
    public static void main(String[] args) {

        VentanaAmd view = new VentanaAmd("Proyecto Final Madrid Murillo 2258");
        ControladorAmd controller = new ControladorAmd(view);

    }
}