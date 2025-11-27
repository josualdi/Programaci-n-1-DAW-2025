package operacionales;

import java.util.Scanner;

public class Inverted {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entero: ");
        int num = teclado.nextInt();
        int invertido = 0;

        while (num != 0) {
            int digitofinal = num % 10;
            invertido = invertido * 10 + digitofinal;
            num /= 10;
        }
        System.out.println("El numero al reves es: " + invertido);
    }
}
