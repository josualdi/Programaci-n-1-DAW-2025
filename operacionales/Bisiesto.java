package operacionales;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un ano: ");
        int ano = teclado.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println(ano + " es bisiesto");
        } else {
            System.out.println(ano + " no es bisiesto");
        }
    }
}
