import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        LeerArchivo lectura = new LeerArchivo();
        try {
            lectura.metodoUno("datos.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}