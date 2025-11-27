package objetos.Alumno;

import java.util.Scanner;

public class PruebaAlumno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Alumno[] a = new Alumno[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Nombre del Alumno: ");
            String nom = sc.nextLine();
            System.out.print("Años: ");
            int edad = sc.nextInt();
            System.out.print("Nota: ");
            int nota = sc.nextInt();
            sc.nextLine();
            a[i] = new Alumno(nom, nota, edad);

        }

        System.out.print("\nNota media: " + Alumno.notaMed());
        System.out.println();
        System.out.println("\nMejores Notas:");

        float menor = a[0].getNota();
        String nombremenor = null;

        for (int i = 0; i < a.length; i++) {
            if (a[i].getNota() >= Alumno.notaMed()) {
                System.out.println(a[i].getName() + ": " + a[i].getNota());
            } else {
                if (a[i].getNota() < menor) {
                    menor = a[i].getNota();
                    nombremenor = a[i].getName();
                }
            }
        }

        System.out.println();
        System.out.println("Peor Alumno: " + nombremenor + " - " + menor);

    }
}