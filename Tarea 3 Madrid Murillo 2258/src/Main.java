import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Pedir al usuario que ingrese la cadena de caracteres
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres (solo X, O o _): ");
        String cadena = sc.nextLine();
        sc.close();

        // Validar que la cadena ingresada tenga 9 caracteres
        if (cadena.length() != 9) {
            System.out.println("La cadena ingresada no tiene 9 caracteres.");
            return;
        }

        // Validar que la cadena ingresada contenga solo X, O o _
        for (char c : cadena.toCharArray()) {
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("La cadena ingresada contiene caracteres no válidos.");
                return;
            }
        }

        // Imprimir la cadena ingresada
        System.out.println("Cadena ingresada: " + cadena);

        // Imprimir el marco con los caracteres ordenados
        System.out.println("  " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " ");
        System.out.println("-----------");
        System.out.println("  " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " ");
        System.out.println("-----------");
        System.out.println("  " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " ");
    }

}
