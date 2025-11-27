import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");

        while (true) {
            String cadena = sc.nextLine();

            if (cadena.length() == 0) {
                break;
            }

            if (esPalindromo(cadena)) {
                System.out.println("Es palindromo");
            } else {
                System.out.println("No es palindromo");
            }
        }
    }

    public static boolean esPalindromo(String frase) {
        int inicio = 0;
        int fin = frase.length() - 1;

        while (inicio < fin) {
            if (frase.charAt(inicio) == ' ') {
                inicio++;
            } else if (frase.charAt(fin) == ' ') {
                fin--;
            } else {
                if (frase.charAt(inicio) != frase.charAt(fin)) {
                return false;
                }
                inicio++;
                fin--;
            }
        }
        return true;
    }
}