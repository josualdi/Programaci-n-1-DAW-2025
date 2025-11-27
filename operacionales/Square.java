package operacionales;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuanto quiere de lado: ");
        int lado = teclado.nextInt();
        int var = 0;

        while (var < lado) {
            var++;
            for (int i = 0; i < lado; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
