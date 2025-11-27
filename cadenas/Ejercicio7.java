import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena (Max 80 caract.): ");
        String cadena = sc.nextLine();

        if (cadena.length() <= 80) {
            for (int i = 1; i <= cadena.length();i++) {
                System.out.println(cadena.substring(0, i));
            }
        } else {
            System.out.println("Maximo 80 caracteres, te has pasado");
        }
    }
}