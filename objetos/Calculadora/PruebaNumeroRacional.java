package objetos.Calculadora;

import java.util.Scanner;

public class PruebaNumeroRacional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer número racional:");
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        NumeroRacional r1 = new NumeroRacional(n1, d1);

        System.out.println("Operación (+, -, *, /):");
        char op = sc.next().charAt(0);

        System.out.println("Segundo número racional:");
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();
        NumeroRacional r2 = new NumeroRacional(n2, d2);

        NumeroRacional resultado = null;

        if (op == '+')
            resultado = r1.suma(r2);
        else if (op == '-')
            resultado = r1.resta(r2);
        else if (op == '*')
            resultado = r1.multiplicacion(r2);
        else if (op == '/')
            resultado = r1.division(r2);

        System.out.println("Resultado: " + resultado);

    }
}
