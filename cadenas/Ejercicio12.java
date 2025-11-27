import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos nombres:");
        String nom1 = sc.nextLine();
        String nom2 = sc.nextLine();

        if (nom1.equalsIgnoreCase(nom2)) {
            System.out.println("Son iguales");
            System.out.println("Mayusculas: " + nom1.toUpperCase());
            System.out.println("Minusculas: " + nom1.toLowerCase());
        } else {
            if (nom1.compareToIgnoreCase(nom2) < 0) {
                System.out.println("Ordenados: " + nom1 + " , " + nom2);
                System.out.println("Mayusculas: " + nom1.toUpperCase() + " , " + nom2.toUpperCase());
                System.out.println("Minusculas: " + nom1.toLowerCase() + " , " + nom2.toLowerCase());
            } else if (nom1.compareToIgnoreCase(nom2) > 0){
                System.out.println("Ordenados: " + nom2 + " , " + nom1);
                System.out.println("Mayusculas: " + nom2.toUpperCase() + " , " +  nom1.toUpperCase());
                System.out.println("Minusculas: " + nom2.toLowerCase() + " , " + nom1.toLowerCase());
            }
        }
    }
}