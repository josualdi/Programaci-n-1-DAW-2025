package operacionales;

import java.util.Scanner;

public class YesNoTriangular {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int num = teclado.nextInt();

        int triangular = 0;
        int n = 0;

        while (triangular < num) {
            triangular = n * (n + 1) / 2;
            n++;
            // Cuando salga del bucle n sera una mas
        }
        /**
         * tanterior es n-2 porque al salir del bucle es n+1
         * por lo cual hay que corregir eso con un -1
         * luego restar el -1 original para hayar el anterior
         * n-2
         */
        int tanterior = (n - 2) * (n - 1) / 2;
        int tposterior = n * (n + 1) / 2;
        int tposteriornp = (n - 1) * (n) / 2;

        if (num == triangular) {
            System.out.println(num + " es triangular");
            System.out.println("El numero  triangular anterior es " + tanterior + " y el posterior " + tposterior);
        } else {
            System.out.println(num + " no es triangular");
            System.out.println("El numero triangular anterior es " + tanterior + " y el posterior " + tposteriornp);
        }
    }
}
