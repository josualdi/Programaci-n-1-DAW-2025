import java.util.Scanner;

public interface Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
            contador++;
            }
        }
        System.out.println("Tiene " + contador + " vocales");
    }

    public static boolean esVocal(char v) {
        switch (v) {
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
            case 'A': 
            case 'E': 
            case 'I': 
            case 'O': 
            case 'U': 
                return true;
            default:
                return false;
        }
    }
}
