package operacionales;

import java.util.Scanner;

public class Absolute {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Absoluto de: ");
        double num = teclado.nextDouble();

        double absoluto = Math.abs(num);
        System.out.println("El absoluto de " + num + " es " + absoluto);

        /**
         * double raiz = Math.sqrt(25); √25 = 5.0
         * double potencia = Math.pow(2, 3); 2^3 = 8.0
         * double valorAbs = Math.abs(-7); | -7 | = 7
         * double redondeo = Math.round(4.6); 5
         * double piso = Math.floor(4.9); 4.0 (redondea hacia abajo)
         * double techo = Math.ceil(4.1); 5.0 (redondea hacia arriba)
         * double seno = Math.sin(Math.PI/2); sin(90°) = 1.0
         * double aleatorio = Math.random(); número entre 0.0 y 1.0
         */
    }
}
