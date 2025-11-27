package objetos.Tamagotchi;

import java.util.Scanner;

public class PruebaTamagotchi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        Tamagotchi a = null;

        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("  1. Crea tamagotchi");
            System.out.println("  2. Juega con tu mascota virtual");
            System.out.println("  3. Da de comer a tu mascota virtual");
            System.out.println("  4. Ver los datos de tu mascota");
            System.out.println("  5. Fin");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Que nombre quieres que tenga tu tamagotchi?");
                    String nom = sc.nextLine();
                    System.out.println("¿Cuanta vida maxima quieres que tenga?");
                    int hp = sc.nextInt();
                    sc.nextLine();

                    a = new Tamagotchi(nom, hp);
                    break;
                case 2:
                    a.juega();
                    break;
                case 3:
                    a.come();
                    break;
                case 4:
                    a.visualiza();
                    break;
                case 5:
                    System.out.println("Adios, gracias por jugar");
                    break;
                default:
                    System.out.println("Valor invalido. Pruebe de nuevo");
            }
        } while (opcion != 5);
    }
}
