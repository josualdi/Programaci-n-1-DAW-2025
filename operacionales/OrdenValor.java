package operacionales;

import java.util.Scanner;

public class OrdenValor {
    // Cambio de valor con 3 variable, teniendo una tercera para ayudarnos
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, aux;
        System.out.println("Dime un numero");
        num1 = teclado.nextInt();

        System.out.println("Dime otro numero");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.println(num1 + " " + num2);
    }
}
