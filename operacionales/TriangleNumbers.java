package operacionales;

import java.util.Scanner;

public class TriangleNumbers {

    public static void main(String[] args) {

        // 1 + 2 + 3 + 4 + ... + n = [n(n+1)]/2
        Scanner teclado = new Scanner(System.in);

        System.out.print("Que numero triangular quieres: ");
        int N = teclado.nextInt();

        System.out.println("Los " + N + " primeros numeros triangulares son: ");
        for (int i = 1; i <= N; i++) {
            int triangular = i * (i + 1) / 2;
            System.out.println(triangular);
        }
    }
}
