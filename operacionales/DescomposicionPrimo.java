package operacionales;

import java.util.Scanner;

public class DescomposicionPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                while (num % i == 0) {
                    System.out.println(num + " | " + i);
                    num /= i;
                }
            }
        }
        System.out.println("1 |");
    }
}
