import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int EXAMEN = 10;

        int respuesta;
        int[] n;
        n = new int[2];
        int cont = 0;

        for (int i = 1; i <= EXAMEN; i++) {
            n[0] = numAleatorio();
            n[1] = numAleatorio();
            System.out.println("Pregunta numero " + i + ": " +  n[0] + " * " + n[1]);
            respuesta = sc.nextInt();
            cont++;

            if (esIncorrecto(n[0], n[1], respuesta)) {
                cont--;
                while (esIncorrecto(n[0], n[1], respuesta)) {
                    System.out.println("INCORRECTO. Prueba otra vez.");
                    System.out.println("Pregunta: " + n[0] + " * " + n[1]);
                    respuesta = sc.nextInt();
                }
            } 
            System.out.println("Respuesta correcta, felicidades.");
        }
        System.out.println("Has acertado " + cont + " preguntas a la primera.");
    }

    public static int numAleatorio() {
        int n = (int)(Math.random() * 10) + 1;
        return n;
    }

    public static boolean esIncorrecto(int a, int b, int res) {
        if (a * b != res) {
            return true;
        } else {
            return false;
        }
    }   
}