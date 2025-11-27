import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] nombre;
        nombre = new String[5];

        System.out.println("Introduce 5 nombres:");
        for (int i = 0; i < nombre.length ; i++) {
            nombre[i] = sc.nextLine();
        }
        Arrays.sort(nombre);
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
    }
}
