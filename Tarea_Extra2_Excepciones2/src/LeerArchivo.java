import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta) throws IOException{

            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line ="";
            while((line = reader.readLine())  !=null){
                System.out.println("Info: " + line);
            }
        }
        public void metodoUno(String ruta) throws IOException{
            this.metodoDos(ruta);
        }

        public void metodoDos(String ruta)throws IOException{
            this.leer(ruta);
        }

}

