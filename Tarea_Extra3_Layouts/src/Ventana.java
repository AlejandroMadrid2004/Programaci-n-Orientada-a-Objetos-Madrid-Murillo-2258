import java.awt.*;
public class Ventana extends Frame{

    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private FlowLayout layout;
    public Ventana(String title) throws HeadlessException {
        super(title);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1);
        txtCuadro1 = new TextField(60);
        this.add(txtCuadro1);
        lblEtiqueta2 = new Label("Etiqueta 1");
        this.add(lblEtiqueta2);
        txtCuadro2 = new TextField(60);
        this.add(txtCuadro2);
        this.setSize(800,600);
        this.setVisible(true);
    }
}
