import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frasecodificada = "";
        int num;
        
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        do {
            System.out.print("Introduce un numero del 1 al 5: ");
            num = sc.nextInt();
        } while (num < 1 || num > 5);

        for (int i = 0; i < cadena.length(); i++) {
            char codigo = cadena.charAt(i);
            char letra = (char)(codigo + num);

            frasecodificada += letra;
        }
        System.out.print("Frase Codificada: " + frasecodificada);
    }
}
