package operacionales;

import java.util.Scanner;

public class Seconds2 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una cantidad de tiempo: hh mm ss");
        int h = teclado.nextInt();
        int m = teclado.nextInt();
        int s = teclado.nextInt();

        int ts = (h * 3600) + (m * 60) + s;

        while (ts >= 0) {
            System.out.println(ts);
            ts--;
        }
    }
}
