import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.print("Dime una cadena: ");
        cadena = sc.nextLine();

        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }

    }
}
