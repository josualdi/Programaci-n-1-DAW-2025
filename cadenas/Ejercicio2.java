import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();

        int num;
    

        do {
            System.out.println("Que letra quieres");
            num = sc.nextInt();
            if (num >= cadena.length()) {
                System.out.println("Numero incorrecto");
            } else if (num <= cadena.length() && num >= 0) {
                System.out.println(cadena.charAt(num));
            }
        } while (num >= 0);
    }
}
