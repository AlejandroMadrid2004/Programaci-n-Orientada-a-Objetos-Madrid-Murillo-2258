import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {

    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;


    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
        lblNombre = new JLabel("Introduce un nombre: ");
        this.getContentPane().add(lblNombre);
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);

        // configurar el modelo


        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Alejandro");
        modelo.agregarNombre("Silvia");
        combo = new JComboBox(modelo);
        this.getContentPane().add(combo);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevoNombre = txtNombre.getText();
                modelo.agregarNombre(nuevoNombre);
            }
        });

        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Hola " + combo.getSelectedItem());
            }
        });


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
