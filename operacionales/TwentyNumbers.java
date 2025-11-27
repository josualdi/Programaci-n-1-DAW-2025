package operacionales;

import java.util.Scanner;

public class TwentyNumbers {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suma = 0, contador = 0;

        System.out.print("Introduce 20 numeros: ");
        while (contador < 20) {
            int num = teclado.nextInt();
            suma = suma + num;
            contador++;
        }

        double media = suma / 20;
        System.out.print("La media es: " + media);
    }
}
