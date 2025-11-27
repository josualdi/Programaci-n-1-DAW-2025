package operacionales;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("MENU");
            System.out.println("1- Celsius a Fahrenheit");
            System.out.println("2- Fahrenheit a Celsius");
            System.out.println("0- Cerrar");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            double C, F;

            switch (opcion) {
                case 1 -> {
                    System.out.print("Cantidad de Celsius a pasar: ");
                    C = teclado.nextDouble();
                    F = (9.0 / 5.0) * C + 32;
                    System.out.println(C + "C son " + F + "F");
                }
                case 2 -> {
                    System.out.print("Cantidad de Fahrenheit a pasar: ");
                    F = teclado.nextDouble();
                    C = (F - 32) * 5.0 / 9.0;
                    System.out.println(F + "F son " + C + "C");
                }
                case 0 -> System.out.println("Adios");
                default -> System.out.println("Invalido");
            }

        } while (opcion != 0);
    }
}
