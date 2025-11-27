package operacionales;

import java.util.Scanner;

public class TrianguloRectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("En que esquina quieres el angulo recto:");
            System.out.println("1- Arriba Izquierda");
            System.out.println("2- Abajo Izquierda");
            System.out.println("3- Arriba Derecha");
            System.out.println("4- Abajo Derecha");
            System.out.println("0- Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Cuanto mide el lado igual: ");
                    int n = teclado.nextInt();

                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 2 -> {
                    System.out.print("Cuanto mide el lado igual: ");
                    int n = teclado.nextInt();

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 3 -> {
                    System.out.print("Cuanto mide el lado igual: ");
                    int n = teclado.nextInt();

                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 4 -> {
                    System.out.print("Cuanto mide el lado igual: ");
                    int n = teclado.nextInt();

                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = n; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 0 -> {
                    System.out.println("Adios");
                }
            }
        } while (opcion != 0);
    }
}
