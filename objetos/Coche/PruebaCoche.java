package objetos.Coche;

import java.util.Scanner;

public class PruebaCoche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Coche a = new Coche("5466-FNZ", 60, 7.1, 200);

        System.out.print("Cuantos litros desea repostar: ");
        int rep = sc.nextInt();
        a.repostar(rep);

        a.arrancarMotor();

        System.out.print("A que velocidad deseas ir: ");
        double vel = sc.nextDouble();
        a.fijarVelocidad(vel);

        System.out.print("Cuantos kilometros desea recorrer: ");
        double km = sc.nextDouble();
        a.recorrerDistancia(km);
    }
}
