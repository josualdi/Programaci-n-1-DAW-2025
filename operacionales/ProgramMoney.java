package operacionales;

import java.util.Scanner;

public class ProgramMoney {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Desea pasar de Euros a Yenes(1) o de Yenes a Euros(2):");
            int menu = teclado.nextInt();

            if (menu == 1) {
                System.out.println("Cantidad de Euros a pasar:");
                double eur = teclado.nextDouble();

                // 1€ = 173.82 JPY
                double yen = eur * 173.82;

                System.out.println(eur + " es igual a " + yen + " YJP");
            } else if (menu == 2) {
                System.out.println("Cantidad de Yenes a pasar:");
                double yen = teclado.nextDouble();

                // 1YJP = 0.0057 Eur
                double eur = yen * 0.0057;

                System.out.println(yen + " YJP es igual a " + eur + " euros");
            } else {
                System.out.println("Esa no es una opcion");
            }
        }
    }
}
