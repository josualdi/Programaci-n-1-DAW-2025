package operacionales;

import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        int menor;

        if (num1 < num2) {
            menor = num1;
        } else {
            menor = num2;
        }

        int resultado = mCd(menor, num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
    }

    public static int mCd(int a, int b, int c) {
        for (int i = a; i >= 1; i--) {
            if (b % i == 0 && c % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
