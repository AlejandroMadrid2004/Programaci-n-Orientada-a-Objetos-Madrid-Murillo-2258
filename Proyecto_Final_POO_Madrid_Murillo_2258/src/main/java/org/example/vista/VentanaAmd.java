package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAmd extends JFrame {
    //Label 1
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblVelocidadM;
    private JLabel lblTamanoM;
    private JLabel lblFrecuencia;
    private JLabel lblUrl;

    private JLabel imagenTarjeta;

    //TextField 1
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtVelocidadM;
    private JTextField txtTamanoM;
    private JTextField txtFrecuencia;
    private JTextField txtUrl;

    //Label 2
    private JLabel lblId2;
    private JLabel lblNombre2;
    private JLabel lblVelocidadM2;
    private JLabel lblTamanoM2;
    private JLabel lblFrecuencia2;
    private JLabel lblUrl2;

    //TextField 2
    private JTextField txtId2;
    private JTextField txtNombre2;
    private JTextField txtVelocidadM2;
    private JTextField txtTamanoM2;
    private JTextField txtFrecuencia2;
    private JTextField txtUrl2;


    //Botones
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnBorrar;
    private JButton btnActualizar;

    //Tabla
    private JTable tblTarjeta;
    private JScrollPane scrollPane;
    private GridLayout layout;

    //Paneles
    private JPanel panel1;//Formulario para capturar datos
    private JPanel panel2;//Tabla para mostrar base de datos
    private JPanel panel3;//Imagen URL
    private JPanel panel4;//Boton Eliminar y Actualizar datos

    public VentanaAmd(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1

        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(248, 183, 183));

        //Labels
        lblId = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblVelocidadM = new JLabel("Velocidad de Memoria(efectiva) Gbps:");
        lblTamanoM = new JLabel("Tamano de memoria (GB):");
        lblFrecuencia = new JLabel("Frecuencia (Mhz):");
        lblUrl = new JLabel("Foto:");

        //Desabilitamos id
        txtId = new JTextField(1);
        txtId.setText("0");
        txtId.setEnabled(false);

        //Damos valores a las opciones de la tabla
        txtNombre = new JTextField(30);
        txtVelocidadM = new JTextField(10);
        txtTamanoM = new JTextField(10);
        txtFrecuencia = new JTextField(10);
        txtUrl = new JTextField(25);
        btnAgregar = new JButton("Agregar");

        //Agregamos los valores

        //Id
        panel1.add(lblId);
        panel1.add(txtId);

        //Nombre

        panel1.add(lblNombre);
        panel1.add(txtNombre);


        //Velocidad de Memoria
        panel1.add(lblVelocidadM);
        panel1.add(txtVelocidadM);

        //Tamaño de Memoria
        panel1.add(lblTamanoM);
        panel1.add(txtTamanoM);

        //Frecuencia
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);

        //Url
        panel1.add(lblUrl);
        panel1.add(txtUrl);

        //Boton Agregar
        panel1.add(btnAgregar);

        //Panel 2

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(219, 198, 246));
        btnCargar = new JButton("Cargar");

        //Agregamos el boton
        panel2.add(btnCargar);

        //Agregamos la tabla
        tblTarjeta = new JTable();

        //Agregamos el scrollPane
        scrollPane = new JScrollPane(tblTarjeta);
        panel2.add(scrollPane);

        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(246, 244, 197));

        //Agregamos la imagen
        imagenTarjeta = new JLabel("");
        panel3.add(imagenTarjeta);

        //Panel 4

        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(150, 216, 219));

        //Agregamos el boton Borrar y Actualizar

        btnBorrar = new JButton("Borrar");
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnBorrar);
        panel4.add(btnActualizar);

        //Labels
        lblId2 = new JLabel("Id:");
        lblNombre2 = new JLabel("Nombre:");
        lblVelocidadM2 = new JLabel("Velocidad de Memoria(efectiva) Gbps:");
        lblTamanoM2 = new JLabel("Tamano de memoria (GB):");
        lblFrecuencia2 = new JLabel("Frecuencia (Mhz):");
        lblUrl2 = new JLabel("Foto:");

        //Desabilitamos id
        txtId2 = new JTextField(1);
        txtId2.setText("0");
        txtId2.setEnabled(false);

        //Damos valores a las opciones de la tabla
        txtNombre2 = new JTextField(30);
        txtVelocidadM2 = new JTextField(10);
        txtTamanoM2= new JTextField(10);
        txtFrecuencia2 = new JTextField(10);
        txtUrl2 = new JTextField(25);

        //Agregamos los valores

        //Id
        panel4.add(lblId2);
        panel4.add(txtId2);

        //Nombre

        panel4.add(lblNombre2);
        panel4.add(txtNombre2);


        //Velocidad de Memoria
        panel4.add(lblVelocidadM2);
        panel4.add(txtVelocidadM2);

        //Tamaño de Memoria
        panel4.add(lblTamanoM2);
        panel4.add(txtTamanoM2);

        //Frecuencia
        panel4.add(lblFrecuencia2);
        panel4.add(txtFrecuencia2);

        //Url
        panel4.add(lblUrl2);
        panel4.add(txtUrl2);


        //Ponemos los paneles

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblId() {

        return lblId;
    }

    public void setLblId(JLabel lblId) {

        this.lblId = lblId;
    }

    public JLabel getLblNombre() {

        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {

        this.lblNombre = lblNombre;
    }

    public JLabel getLblVelocidadM() {

        return lblVelocidadM;
    }

    public void setLblVelocidadM(JLabel lblVelocidadM) {

        this.lblVelocidadM = lblVelocidadM;
    }

    public JLabel getLblTamanoM() {

        return lblTamanoM;
    }

    public void setLblTamanoM(JLabel lblTamanoM) {

        this.lblTamanoM = lblTamanoM;
    }

    public JLabel getLblFrecuencia() {

        return lblFrecuencia;
    }

    public void setLblFrecuencia(JLabel lblFrecuencia) {
        this.lblFrecuencia = lblFrecuencia;
    }

    public JLabel getLblUrl() {

        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {

        this.lblUrl = lblUrl;
    }

    public JLabel getImagenTarjeta() {

        return imagenTarjeta;
    }

    public void setImagenTarjeta(JLabel imagenTarjeta) {

        this.imagenTarjeta = imagenTarjeta;
    }

    public JTextField getTxtId() {

        return txtId;
    }

    public void setTxtId(JTextField txtId) {

        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {

        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {

        this.txtNombre = txtNombre;
    }

    public JTextField getTxtVelocidadM() {
        return txtVelocidadM;
    }

    public void setTxtVelocidadM(JTextField txtVelocidadM) {

        this.txtVelocidadM = txtVelocidadM;
    }

    public JTextField getTxtTamanoM() {

        return txtTamanoM;
    }

    public void setTxtTamanoM(JTextField txtTamanoM) {

        this.txtTamanoM = txtTamanoM;
    }

    public JTextField getTxtFrecuencia() {
        return txtFrecuencia;
    }

    public void setTxtFrecuencia(JTextField txtFrecuencia) {

        this.txtFrecuencia = txtFrecuencia;
    }

    public JTextField getTxtUrl() {

        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {

        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {

        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {

        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {

        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {

        this.btnCargar = btnCargar;
    }

    public JButton getBtnBorrar() {

        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {

        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnActualizar() {

        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {

        this.btnActualizar = btnActualizar;
    }

    public JTable getTblTarjeta() {

        return tblTarjeta;
    }

    public void setTblTarjeta(JTable tblTarjeta) {

        this.tblTarjeta = tblTarjeta;
    }

    public JScrollPane getScrollPane() {

        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {

        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {

        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {

        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {

        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {

        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {

        return panel4;
    }

    public void setPanel4(JPanel panel4) {

        this.panel4 = panel4;
    }

    public JLabel getLblId2() {
        return lblId2;
    }

    public void setLblId2(JLabel lblId2) {
        this.lblId2 = lblId2;
    }

    public JLabel getLblNombre2() {
        return lblNombre2;
    }

    public void setLblNombre2(JLabel lblNombre2) {
        this.lblNombre2 = lblNombre2;
    }

    public JLabel getLblVelocidadM2() {
        return lblVelocidadM2;
    }

    public void setLblVelocidadM2(JLabel lblVelocidadM2) {
        this.lblVelocidadM2 = lblVelocidadM2;
    }

    public JLabel getLblTamanoM2() {
        return lblTamanoM2;
    }

    public void setLblTamanoM2(JLabel lblTamanoM2) {
        this.lblTamanoM2 = lblTamanoM2;
    }

    public JLabel getLblFrecuencia2() {
        return lblFrecuencia2;
    }

    public void setLblFrecuencia2(JLabel lblFrecuencia2) {
        this.lblFrecuencia2 = lblFrecuencia2;
    }

    public JLabel getLblUrl2() {
        return lblUrl2;
    }

    public void setLblUrl2(JLabel lblUrl2) {
        this.lblUrl2 = lblUrl2;
    }

    public JTextField getTxtId2() {
        return txtId2;
    }

    public void setTxtId2(JTextField txtId2) {
        this.txtId2 = txtId2;
    }

    public JTextField getTxtNombre2() {
        return txtNombre2;
    }

    public void setTxtNombre2(JTextField txtNombre2) {
        this.txtNombre2 = txtNombre2;
    }

    public JTextField getTxtVelocidadM2() {
        return txtVelocidadM2;
    }

    public void setTxtVelocidadM2(JTextField txtVelocidadM2) {
        this.txtVelocidadM2 = txtVelocidadM2;
    }

    public JTextField getTxtTamanoM2() {
        return txtTamanoM2;
    }

    public void setTxtTamanoM2(JTextField txtTamanoM2) {
        this.txtTamanoM2 = txtTamanoM2;
    }

    public JTextField getTxtFrecuencia2() {
        return txtFrecuencia2;
    }

    public void setTxtFrecuencia2(JTextField txtFrecuencia2) {
        this.txtFrecuencia2 = txtFrecuencia2;
    }

    public JTextField getTxtUrl2() {
        return txtUrl2;
    }

    public void setTxtUrl2(JTextField txtUrl2) {
        this.txtUrl2 = txtUrl2;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtVelocidadM.setText("");
        txtTamanoM.setText("");
        txtFrecuencia.setText("");
        txtUrl.setText("");

        txtNombre2.setText("");
        txtVelocidadM2.setText("");
        txtTamanoM2.setText("");
        txtFrecuencia2.setText("");
        txtUrl2.setText("");

    }

}
