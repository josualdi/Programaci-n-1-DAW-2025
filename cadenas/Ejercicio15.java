import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] nota;
        nota = new double[5];
        double suma = 0;

        for (int i = 0; i < nota.length; i++) {
            
            System.out.print("Introduzca la nota numero " + (i+1) + ": ");
            nota[i] = sc.nextDouble();
            System.out.println();
            suma += nota[i];
        }

        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i] + " ");
        }

        double media = suma / nota.length;

        System.out.println();
        System.out.println("Nota media: " + media);
        System.out.println();
        
        System.out.println("Notas por encima de la media:");
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > media) {
                System.out.println(nota[i] + " + 1 = " + (nota[i] + 1));
            }
        }
        
        double minima = nota[0];
        double maxima = nota[0];

        for (int i = 1; i < nota.length; i++) {
            if (nota[i] < minima) {
                minima = nota[i];
            }
            if (nota[i] > maxima) {
                maxima = nota[i];
            }
        }
        System.out.println("\nNota más baja: " + minima);
        System.out.println("Nota más alta: " + maxima);
    }
}