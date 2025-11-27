package operacionales;

import java.util.Scanner;

public class OrdenValor2 {
// Cambio de valor con 2 variables
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Dime un numero");
        num1 = teclado.nextInt();

        System.out.println("Dime otro numero");
        num2 = teclado.nextInt();

        if (num1 > num2) {
           num1 += num2;
           num2 = num1-num2;
           num1 = num1+num2;
        }
        System.out.println(num1 + " " + num2);
    }
}