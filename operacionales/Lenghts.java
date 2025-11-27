package operacionales;

import java.util.Scanner;

public class Lenghts {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double met;
        double piep = 12;
        double pul = 39.27;
        System.out.println("Dime una cantidad de metros:");
        met = teclado.nextInt();

        double pie = (met * pul) / piep;

        System.out.println(met + "m son " + pie + " pies");
    }
}
