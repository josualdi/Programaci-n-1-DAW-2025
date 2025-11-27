import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            int[] ganadores = new int[7]; 

            for (int i = 0; i < 5; i++) {
                ganadores[i] = numeroAleatorio();
                for (int j = 0; j < i; j++) {
                    while (ganadores[i] == ganadores[j]) {
                        ganadores[i] = numeroAleatorio();
                        j = 0; 
                    }
                }
            }

            for (int i = 5; i < 7; i++) {
                ganadores[i] = estrellaAleatoria();
                for (int j = 5; j < i; j++) {
                    while (ganadores[i] == ganadores[j]) {
                        ganadores[i] = estrellaAleatoria();
                        j = 5; 
                    }
                }
            }

            System.out.println("\nCOMBINACIÓN GANADORA");
            System.out.print("Números: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(ganadores[i] + " ");
            }
            System.out.print("\nEstrellas: ");
            for (int i = 5; i < 7; i++) {
                System.out.print(ganadores[i] + " ");
            }
            System.out.println("\n");

            int[] boleto = new int[7];
            System.out.println("Introduzca su boleto:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + " (1-50): ");
                boleto[i] = sc.nextInt();
                while (boleto[i] < 1 || boleto[i] > 50) {
                    System.out.print("Número fuera de rango. Intente de nuevo: ");
                    boleto[i] = sc.nextInt();
                }
            }

            for (int i = 5; i < 7; i++) {
                System.out.print("Estrella " + (i - 4) + " (1-12): ");
                boleto[i] = sc.nextInt();
                while (boleto[i] < 1 || boleto[i] > 12) {
                    System.out.print("Estrella fuera de rango. Intente de nuevo: ");
                    boleto[i] = sc.nextInt();
                }
            }

            int aciertosNum = 0;
            int aciertosEst = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (boleto[i] == ganadores[j]) {
                        aciertosNum++;
                    }
                }
            }

            for (int i = 5; i < 7; i++) {
                for (int j = 5; j < 7; j++) {
                    if (boleto[i] == ganadores[j]) {
                        aciertosEst++;
                    }
                }
            }

            System.out.println("\n RESULTADO:");
            System.out.println("Has acertado " + aciertosNum + " números y " + aciertosEst + " estrellas.");

            System.out.println("\n¿Desea comprobar otro boleto? (si / no)");
            sc.nextLine(); // limpiar buffer
            opcion = sc.nextLine().toLowerCase();

            while (!opcion.equals("si") && !opcion.equals("no")) {
                System.out.println("Respuesta inválida. Escriba 'si' o 'no':");
                opcion = sc.nextLine().toLowerCase();
            }

        } while (opcion.equals("si"));

        System.out.println("\n Gracias por jugar al Euromillón. ¡Suerte la próxima vez!");
    }

    public static int numeroAleatorio() {
        return (int) (Math.random() * 50) + 1;
    }

    public static int estrellaAleatoria() {
        return (int) (Math.random() * 12) + 1;
    }
}