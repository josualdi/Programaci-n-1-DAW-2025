package operacionales;

import java.util.Scanner;

public class Crapulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("Su crapulo es " + num);
        } else if (num <= 0) {
            System.out.println("Nuumero no valido");
        } else {
            while (num >= 10) {
                int suma = 0;
                int temp = num;

                while (temp > 0) {
                    int digito = temp % 10;
                    suma += digito;
                    temp /= 10;
                }
                num = suma;
            }
            System.out.println("Su crapulo es " + num);
        }
    }
}
