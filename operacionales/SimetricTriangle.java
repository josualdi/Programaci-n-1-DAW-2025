package operacionales;

import java.util.Scanner;

public class SimetricTriangle {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU:");
            System.out.println("Donde desea el vertice del eje del triangulo?");
            System.out.println("1- Arriba");
            System.out.println("2- Abajo");
            System.out.println("3- Izquierda");
            System.out.println("4- Derecha");
            System.out.println("0- Salir");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Cuanto mide la altura: ");
                    int a = teclado.nextInt();

                    for (int i = a; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = a; j >= i + 1; j--) {
                            System.out.print("*");
                        }
                        for (int j = a; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 2 -> {
                    System.out.print("Cuanto mide la altura: ");
                    int a = teclado.nextInt();
                    for (int i = a; i >= 1; i--) {
                        for (int j = 1; j <= a - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 3 -> {
                    System.out.print("Cuanto mide la altura: ");
                    int a = teclado.nextInt();
                    // Primera mitad del triangulo
                    for (int i = a; i >= 1; i--) {
                        for (int j = i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= a - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    // Segunda mitad del triangulo
                    for (int i = a; i >= 1; i--) {
                        for (int j = 0; j <= a - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 4 -> {
                    System.out.print("Cuanto mide la altura: ");
                    int a = teclado.nextInt();

                    for (int i = a; i >= 1; i--) {
                        for (int j = 0; j <= a - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    for (int i = a - 1; i >= 1; i--) {
                        for (int j = a; j > a - i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 0 -> {
                    System.out.println("Adios, gracias por usar el programa");
                }
            }
        } while (opcion != 0);
    }
}
