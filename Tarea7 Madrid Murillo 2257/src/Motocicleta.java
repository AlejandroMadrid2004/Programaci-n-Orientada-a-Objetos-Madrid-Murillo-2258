public class Motocicleta implements Vehiculo{

    private int centimetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void hacerCaballito(){
    System.out.println("Haciendo un caballito para romperse un hueso...");
    }


    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimetrosCubicos + " C.C");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de " + this.centimetrosCubicos + " C.C");
    }
}
