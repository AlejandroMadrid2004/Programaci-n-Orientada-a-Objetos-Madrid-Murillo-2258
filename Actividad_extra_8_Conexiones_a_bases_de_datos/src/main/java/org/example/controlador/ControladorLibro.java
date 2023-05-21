package org.example.controlador;

import org.example.modelo.ModeloTablaLibros;
import org.example.vista.VentanaLibro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLibro extends MouseAdapter {
        private VentanaLibro view;
        private ModeloTablaLibros modelo;
    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        this.view.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnAgregar()){
            modelo = new ModeloTablaLibros();
            modelo.cargarDatos();
            this.view.getTblLibro().setModel(modelo);
            this.view.getTblLibro().updateUI();
        }
    }
}
