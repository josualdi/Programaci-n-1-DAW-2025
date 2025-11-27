import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        System.out.print("Qué palabra quieres buscar: ");
        String word = sc.nextLine();

        if (palabraEncontrada(texto, word)) {
            System.out.println("Palabra encontrada");
            System.out.println("Desea reemplazarla?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Respuesta: ");
            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "si":
                    System.out.print("Qué palabra deseas poner: ");
                    String newword = sc.nextLine();
                    String nuevoTexto = reemplazoPalabra(newword, word, texto);
                    System.out.println("Texto modificado: " + nuevoTexto);
                    break;
                case "no":
                    System.out.println("Adiós :)");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Palabra no encontrada, adiós :)");
        }

        sc.close();
    }

    public static boolean palabraEncontrada(String txt, String a) {
        String palabra = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == ' ') {
                if (palabra.equalsIgnoreCase(a)) {
                    return true;
                }
                palabra = "";
            } else {
                palabra += c;
            }
        }
        return palabra.equalsIgnoreCase(a);
    }

    public static String reemplazoPalabra(String nueva, String vieja, String txt) {
        String palabra = "";
        String resultado = "";

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == ' ') {
                if (palabra.equalsIgnoreCase(vieja)) {
                    resultado += nueva + " ";
                } else {
                    resultado += palabra + " ";
                }
                palabra = "";
            } else {
                palabra += c;
            }
        }

        if (palabra.equalsIgnoreCase(vieja)) {
            resultado += nueva;
        } else {
            resultado += palabra;
        }

        return resultado;
    }
}
