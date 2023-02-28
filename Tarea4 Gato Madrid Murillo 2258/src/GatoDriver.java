public class GatoDriver {
    public static void main(String[] args) {

        Gato gatito = new Gato("Felino","Esponjado", "Negro",3 , "Mordelon");
        System.out.println(gatito.dormir());
        System.out.println(gatito.ronronear());
        System.out.println(gatito.feliz());
        System.out.println(gatito);
    }
}