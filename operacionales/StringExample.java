package operacionales;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String cadena;

        System.out.print("Introduce una cadena de carecteres: ");

        cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i) + " " + (int) cadena.charAt(i));
        }

        System.out.println(cadena.indexOf('o'));
        System.out.println(cadena.charAt(3));
    }
}
