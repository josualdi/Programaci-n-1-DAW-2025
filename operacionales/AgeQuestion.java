package operacionales;

import java.util.Scanner;

public class AgeQuestion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cual es tu edad");
        int edad = teclado.nextInt();

        System.out.println("Que dia es hoy: dd mm aaaa");
        int fechadia = teclado.nextInt();
        int fechames = teclado.nextInt();
        int fechaaño = teclado.nextInt();

        System.out.println("Que dia naciste dd mm");
        int dianac = teclado.nextInt();
        int mesnac = teclado.nextInt();

        int añonacimiento = fechaaño - edad;

        if (mesnac > fechames || mesnac == fechames && fechadia < dianac) /* Si aún no he cumplido años */ {
            añonacimiento--;
        }
        System.out.println("Naciste en el " + añonacimiento);
    }
}
