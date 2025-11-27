import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos caballos van a correr?");
        int numcaballos = sc.nextInt();

        final int PUNTUACIONFINAL = 50;

        int[] caballos = new int[numcaballos];

        for (int i = 0; caballos[i] < PUNTUACIONFINAL; i++) {
            caballos[i] += aumentoPuntuacion();

            if (i == caballos.length-1) {
                i = -1;
            }
        }

        for (int i = 0; i < caballos.length; i++) {
            if (caballos[i] >= 50) {
                System.out.println("Dorsal " + i + " con una puntuacion de " + caballos[i]);
            }
        }
    }
    public static int aumentoPuntuacion() {
        int n = (int) (Math.random() * 5);
        return n;
    }
}