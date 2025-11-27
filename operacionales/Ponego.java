package operacionales;

import java.util.Scanner;

public class Ponego {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.println("Dime un  numero");
        num = teclado.nextInt();

        if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            if (num > 0) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es 0");
            }
        }
    }
}
