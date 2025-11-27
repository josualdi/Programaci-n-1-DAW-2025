package operacionales;

import java.util.Scanner;

public class ProgramEurYen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Desea de segundos a horas, minutos, segundos(1) o de horas, minutos, segundos a segundos(2)");
            int menu = teclado.nextInt();

            if (menu == 1) {
                System.out.println("Dime una cantidad de segundos");
                int s = teclado.nextInt();

                int horas = s / 3600;
                int minutos = (s % 3600) / 60;
                int segundos = (s % 3600) % 60;

                System.out.println(horas + "h " + minutos + "m " + segundos + "s");
            } else if (menu == 2) {
                System.out.println("Dime una cantidad de tiempo: hh mm ss");
                int h = teclado.nextInt();
                int m = teclado.nextInt();
                int s = teclado.nextInt();

                int ts = (h * 3600) + (m * 60) + s;

                System.out.println("La cantidad total de segundos es de " + ts + "s");
            } else {
                System.out.println("Esa no es una opcion");
            }
        }

    }
}
