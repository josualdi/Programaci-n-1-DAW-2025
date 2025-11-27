package operacionales;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();
        int factorial = 1;

        for (int i = 1; i < num + 1; i++) {
            factorial = factorial * i;
        }
        System.out.print("El factorial de " + num + " es " + factorial);
    }
}
