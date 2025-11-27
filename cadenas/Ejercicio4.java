import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String cadena;

        System.out.print("Dime una cadena: ");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + "-" );
        }
    }
    
}
