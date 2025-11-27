package operacionales;

import java.util.Scanner;

public class ProgramTime {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        do {
            System.out.println("MENU");
            System.out.println("1- Segundos a Horas, Minutos y Segundos");
            System.out.println("2- Horas, Minutos y Segundos a Segundos");
            System.out.println("0- Salir");
            System.out.print("Opcion --> ");
            menu = teclado.nextInt();

            if (menu == 1) {
                int s, m, h;
                System.out.println("Dime una cantidad de segundos");
                s = teclado.nextInt();

                m = s / 60;
                s %= 60;
                h = m / 60;
                m %= 60;

                System.out.println(h + "h " + m + "m " + s + "s ");
            }
            if (menu == 2) {
                System.out.println("Dime una cantidad de tiempo: hh mm ss");
                int h = teclado.nextInt();
                int m = teclado.nextInt();
                int s = teclado.nextInt();

                int ts = (h * 3600) + (m * 60) + s;

                System.out.println("La cantidad total de segundos es de " + ts + "s");
            }
            if (menu == 0) {
                System.out.println("Adios muy buenas");
            }
            if (menu != 0 && menu != 1 && menu != 2) {
                System.out.println("Esa no es una opcion");
            }

        } while (menu != 0);
    }
}
