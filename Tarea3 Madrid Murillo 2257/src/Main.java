import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        while (cadena.length() != 9) {
            System.out.print("Introduzca una cadena de 9 caracteres que contenga solamente 'X', 'O' , '_': ");
            cadena = sc.nextLine();
        }
        String separador = "+---+---+---+";
        System.out.println("La cadena ingresada es: " + cadena);
        System.out.println(separador);
        for (int i = 0; i < 9; i += 3) {
            System.out.print("| " + cadena.charAt(i) + " | " + cadena.charAt(i+1) + " | " + cadena.charAt(i+2) + " |\n");
            System.out.println(separador);
        }
    }


}
