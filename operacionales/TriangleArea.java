package operacionales;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Dime la base del triangulo");
        base = teclado.nextInt();

        System.out.println("Ahora dime la altura");
        altura = teclado.nextInt();

        area = (base * altura / 2);
        System.out.println("El area del triangulo es " + area);
    }
}
