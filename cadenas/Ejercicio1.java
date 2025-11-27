import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();

        while (cadena.length() != 0) {
            if (cadena.length() != 0) {
                System.out.println("Cadena de " + cadena.length() + " caracteres");
                System.out.println("Incorrecto");
                cadena = sc.nextLine();
            }
        }
        System.out.println("Cadena de " + cadena.length() + " caracteres");
        System.out.println("Correcto");
    }
}
