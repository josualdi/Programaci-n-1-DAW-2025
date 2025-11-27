package operacionales;

import java.util.Scanner;

public class MultiplyTable {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("cuantas veces quieres multiplicarlo?: ");
        int num2 = teclado.nextInt();
        
        for (int i = 1; i<num2+1;i++) {
            System.out.println(num1 * i);
        }
    }
}
