package operacionales;

import java.util.Scanner;

public class RaizNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double g = 1;
        double g2;

        System.out.print("Introduzca un numero: ");
        double num = sc.nextInt();

        do {

            g2 = 0.5 * (g + num / g);
            System.out.println("Aproximacion: " + g2);
            g = g2;

        } while (Math.sqrt(g * g - num) > 0.001);

        System.out.println("La raiz aproximada de " + num + " es " + g);
        System.out.println("Verificacion: Raiz de " + num + " es " + Math.sqrt(num));
    }
}
