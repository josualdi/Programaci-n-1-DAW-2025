package operacionales;

import java.util.Scanner;

public class EurYen {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantidad de euros:");
        double eur = teclado.nextDouble();

        // 1€ = 173.82 JPY
        double yen = eur * 173.82;

        System.out.println(eur + " es igual a " + yen + " YJP");

    }
}
