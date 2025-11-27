import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int[] contador = new int[5];

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            tipoVocal(frase.charAt(i), contador);
        }
        System.out.println("a e i o u");
        for (int i = 0; i < contador.length; i++) {
            System.out.print(contador[i] + " ");
        }
    }

    public static void tipoVocal(char a, int contador[]) {
        switch (a) {
            case 'a': {
                contador[0]++;
            } 
            break;
            case 'e': {
                contador[1]++;
            }
            break;
            case 'i': {
                contador[2]++;
            }
            break;
            case 'o': {
                contador[3]++;
            } 
            break;
            case 'u': {
                contador[4]++;
            }
            break;
        }
    }


}
