package operacionales;

import java.util.Scanner;

public class OrdenValor3 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, aux;
        System.out.println("Dime 3 numeros: 1 2 3");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;

        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;

            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
