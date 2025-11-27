package operacionales;

import java.util.Scanner;

public class Seconds {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una cantidad de tiempo: hh mm ss");
        int h = teclado.nextInt();
        int m = teclado.nextInt();
        int s = teclado.nextInt();

        int ts = (h * 3600) + (m * 60) + s;

        System.out.println("La cantidad total de segundos es de " + ts);

    }
}
