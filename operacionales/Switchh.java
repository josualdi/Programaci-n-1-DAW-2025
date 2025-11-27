package operacionales;

import java.util.Scanner;

public class Switchh {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4");
            System.out.print("Pon una opcion --> ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("1- Hago la cosa uno");
                case 2 -> System.out.println("2- Hago la cosa dos");
                case 3 -> System.out.println("3- Hago la cosa tres");
                case 0 -> System.out.println("0- Adios");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 0);

    }
}
