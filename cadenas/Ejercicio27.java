import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word;
        String[][] diccionario = {
            {"casa" , "house"},
            {"perro" , "dog"},
            {"gato" , "cat"},
            {"silla" , "chair"},
            {"raton" , "mouse"},
            {"mesa" , "table"},
            {"ordenador" , "computer"},
            {"coche" , "car"},
            {"bicicleta" , "bike"},
            {"leche" , "milk"}
        };

        System.out.println("DICCIONARIO:");
        for (int i = 0; i < diccionario.length; i++) {
            System.out.println("    " + (i+1) + ". " + diccionario[i][0]);
        }

        do {
            System.out.print("Que palabra deseas traducir: ");
            word = sc.nextLine().toLowerCase();

            int posicion = buscarPalabra(word, diccionario);

            if (word != "") {
                if (posicion == -1) {
                    System.out.println(word + " no esta en el diccionario.");
                    System.out.println("Pruebe otra palabra.");
                    System.out.println();
                } else {
                    System.out.println("La traduccion de " + word + " es " + diccionario[posicion][1]);
                    System.out.println();
                }
            }
        } while (word != "");
        System.out.println("Gracias por usar el diccionario");


    }

    public static int buscarPalabra(String word, String diccionario[][]) {
        for (int i = 0; i < diccionario.length; i++) {

            String castellano = diccionario[i][0];

            if (word.equalsIgnoreCase(castellano)) {
                int posicion = i;
                return posicion;
            }
        }
        return -1;
    }
}
