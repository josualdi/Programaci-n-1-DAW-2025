import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Fraccion 1:");
        System.out.print("Numerador: ");
        int num1 = sc.nextInt();
        System.out.print("Denominador: ");
        int den1 = sc.nextInt();

        System.out.println("Fraccion 2:");
        System.out.print("Numerador: ");
        int num2 = sc.nextInt();
        System.out.print("Denominador: ");
        int den2 = sc.nextInt();

        sc.nextLine();
        char opcion;

        do {
            System.out.println("Que operacion desea: (+,-,*,/ o Salir: x)");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '+': {
                    System.out.println("Resultado: " + esSuma(num1, den1, num2, den2));
                }
                break;

                case '-': {
                    System.out.println("Resultado: " + esResta(num1, den1, num2, den2));
                }
                break;

                case '*': {
                    System.out.println("Resultado: " + esMultiplicacion(num1, den1, num2, den2));
                }
                break;

                case '/': {
                    System.out.println("Resultado: " + esDivision(num1, den1, num2, den2));
                }
                break;

                case 'x': {
                    System.out.println("Adios :)");
                }
                break;

                default: System.out.println("Opcion inválida. Intente de nuevo.");
            }
        } while (opcion != 'x');
    }

    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String simplificar(int num, int den) {
        int mcd = mcd(Math.abs(num), Math.abs(den));
        num /= mcd;
        den /= mcd;
        return num + "/" + den;
    }

    public static String esSuma(int n1, int d1, int n2, int d2) {
        int num = n1 * d2 + n2 * d1;
        int den = d1 * d2;
        return simplificar(num, den);
    }

    public static String esResta(int n1, int d1, int n2, int d2) {
        int num = n1 * d2 - n2 * d1;
        int den = d1 * d2;
        return simplificar(num, den);
    }

    public static String esMultiplicacion(int n1, int d1, int n2, int d2) {
        int num = n1 * n2;
        int den = d1 * d2;
        return simplificar(num, den);
    }

    public static String esDivision(int n1, int d1, int n2, int d2) {
        if (n2 == 0) return "Error: no se puede dividir entre 0.";
        int num = n1 * d2;
        int den = d1 * n2;
        return simplificar(num, den);
    }
}