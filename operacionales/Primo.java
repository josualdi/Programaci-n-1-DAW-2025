package operacionales;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();

        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("El " + num + " es primo");
        } else {
            System.out.println("El " + num + " no es primo");
        }

    }
}
