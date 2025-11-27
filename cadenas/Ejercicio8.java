import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase");
        String cadena = sc.nextLine();
        int cont = 0;
        String palabra = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                cont++;
                System.out.println(palabra);
                palabra = "";
            } else {
                palabra = palabra + cadena.charAt(i);
            }
        }
        if (palabra.length() > 0) {
            cont++;
            System.out.println(palabra);
        }
        System.out.println("Son " + cont + " palabras.");
    }
}