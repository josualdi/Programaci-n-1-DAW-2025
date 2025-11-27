package operacionales;

import java.util.Scanner;

public class YenEur {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantidad de Yenes:");
        double yen = teclado.nextDouble();

        // 1YJP = 0.0057 Eur
        double eur = yen * 0.0057;

        System.out.println(yen + " YJP es igual a " + eur + " euros");
    }
}
