package operacionales;

import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
