package org.example.controlador;

import org.example.modelo.Amd;
import org.example.modelo.ModeloTablaAmd;
import org.example.vista.VentanaAmd;
import org.example.persistencia.AmdDAO;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorAmd extends MouseAdapter {

    private VentanaAmd view;
    private ModeloTablaAmd modelo;


    //Agreamos el constructor de el controlador
    public ControladorAmd(VentanaAmd view) {
        //Agregamos el modelo de la tabla
        this.view = view;
        modelo = new ModeloTablaAmd();
        this.view.getTblTarjeta().setModel(modelo);

        //Agregamos los mouseListener de los botones
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);

        //Agregamos el mouseListener de la tabla
        this.view.getTblTarjeta().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ImageIcon icono = new ImageIcon("bien.png");

        if(e.getSource() == this.view.getBtnCargar()){

            modelo.cargarDatos();

            this.view.getTblTarjeta().setModel(modelo);
            this.view.getTblTarjeta().updateUI();
            this.view.limpiar();

        }

        if (e.getSource() == this.view.getBtnAgregar()){
            Amd amd = new Amd();
            amd.setId(0);
            amd.setNombre(this.view.getTxtNombre().getText());
            amd.setVelocidadM(Integer.parseInt(this.view.getTxtVelocidadM().getText()));
            amd.setTamanoM(Integer.parseInt(this.view.getTxtTamanoM().getText()));
            amd.setFrecuencia(Integer.parseInt(this.view.getTxtFrecuencia().getText()));
            amd.setUrlImagen(this.view.getTxtUrl().getText());

            if(modelo.agregarAmd(amd)){
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE, icono);
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Revisa la conexion", "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
            }

            modelo.cargarDatos();
            this.view.getTblTarjeta().setModel(modelo);
            this.view.getTblTarjeta().updateUI();
            this.view.limpiar();

        }

        if (e.getSource() == this.view.getTblTarjeta()) {

            Icon error = new ImageIcon("mal.png");

            int index = this.view.getTblTarjeta().getSelectedRow();
            Amd temporal = modelo.getAmdAtIndex(index);

            try{
                this.view.getImagenTarjeta().setIcon(temporal.getImagen());
                this.view.getImagenTarjeta().setText("");
            }catch(MalformedURLException mfue){
                this.view.getImagenTarjeta().setIcon(error);
                JOptionPane.showMessageDialog(view,"La URL que se registro no es correcta.","Error",JOptionPane.ERROR_MESSAGE);
                System.out.println(e.toString());
            }
        }

       if(e.getSource() == this.view.getBtnBorrar()){
           int row = this.view.getTblTarjeta().getSelectedRow();
           String index = String.valueOf(this.modelo.getValueAt(row,0));

           System.out.println(index);

           int respuesta = JOptionPane.showConfirmDialog(view, "¿Estas seguro de borrar el registro?","Selecciona una opcion",JOptionPane.YES_NO_OPTION);

           if (respuesta == JOptionPane.YES_NO_OPTION){
               modelo.eliminarDatos(index);
               JOptionPane.showMessageDialog(view,"El registro fue borrado","Aviso",JOptionPane.INFORMATION_MESSAGE,icono);
           }else{
               JOptionPane.showMessageDialog(view,"El objeto no fue eliminado","Error al eliminar",JOptionPane.ERROR_MESSAGE);
           }

           modelo.cargarDatos();
           this.view.getTblTarjeta().setModel(modelo);
           this.view.getTblTarjeta().updateUI();
           this.view.limpiar();
       }

       if(e.getSource() == this.view.getBtnActualizar()) {
           int row = this.view.getTblTarjeta().getSelectedRow();
           String index = String.valueOf(this.modelo.getValueAt(row, 0));

           Amd amd = new Amd();

           amd.setNombre(this.view.getTxtNombre2().getText());
           amd.setVelocidadM(Integer.parseInt(this.view.getTxtVelocidadM2().getText()));
           amd.setTamanoM(Integer.parseInt(this.view.getTxtTamanoM2().getText()));
           amd.setFrecuencia(Integer.parseInt(this.view.getTxtFrecuencia2().getText()));
           amd.setUrlImagen(this.view.getTxtUrl2().getText());
           amd.setId(Integer.parseInt(index));

           if (modelo.updateAmd(amd)) {
               JOptionPane.showMessageDialog(view, "Se ha modificado el registro", "Aviso", JOptionPane.INFORMATION_MESSAGE, icono);
               this.view.getTblTarjeta().updateUI();
           } else {
               JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error", JOptionPane.ERROR_MESSAGE);
               this.view.getTblTarjeta().updateUI();
           }

           modelo.cargarDatos();
           this.view.getTblTarjeta().setModel(modelo);
           this.view.getTblTarjeta().updateUI();
           this.view.limpiar();
       }
       this.view.getTblTarjeta().updateUI();


    }
}
