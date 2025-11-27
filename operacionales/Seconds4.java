package operacionales;

import java.util.Scanner;

public class Seconds4 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int s, m, h;
        System.out.println("Dime una cantidad de segundos");
        s = teclado.nextInt();

        m = s / 60;
        s %= 60;
        h = m / 60;
        m %= 60;

        System.out.println(h + "h " + m + "m " + s + "s ");
    }
}
