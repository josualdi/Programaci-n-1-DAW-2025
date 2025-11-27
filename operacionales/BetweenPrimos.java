package operacionales;

import java.util.Scanner;

public class BetweenPrimos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = teclado.nextInt();

        // Corrección por si num1 > num2
        if (num1 > num2) {
            int aux;
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        // Bucle para cada número entre num1 y num2
        while (num1 < num2) {

            /**
             * Variable divisor para que si num1 tiene mas de dos divisores
             * Entonces no sera primo, si solo tiene dos sera primo
             */
            int divisor = 0;

            // Bucle para cada división desde 1 hasta num2
            for (int i = 1; i < num2; i++) {
                if (num1 % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.print(num1 + " ");
            }
            num1++;
        }
    }
}
