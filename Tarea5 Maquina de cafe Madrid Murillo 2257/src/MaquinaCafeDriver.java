import java.util.Scanner;
public class MaquinaCafeDriver {

    public static void main (String[]args)
    {

        //Objeto tipo MaquinaCafe
        MaquinaCafe machine = new MaquinaCafe();

        while (true) {
            System.out.println("1. Servir americano");
            System.out.println("2. Servir expreso");
            System.out.println("3. Servir capuchino");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    machine.hacerAmericado();
                    break;
                case 2:
                    machine.hacerExpreso();
                    break;
                case 3:
                    machine.hacerCapuchino();
                    break;
                case 4:
                   machine.cantidadIngredientes();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
