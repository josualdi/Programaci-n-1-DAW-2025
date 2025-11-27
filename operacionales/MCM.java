package operacionales;

import java.util.Scanner;

public class MCM {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        int mayor;

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        int resultado = mCm(mayor, num1, num2);
        System.out.println("El MCM de " + num1 + " y de " + num2 + " es: " + resultado);
    }

    public static int mCm(int mcm, int num1, int num2) {
        while (true) {
            if (mcm % num1 == 0 && mcm % num2 == 0) {
                return mcm;
            }
            mcm++;
        }
    }
}
