package objetos.Fecha;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;

        do {
            System.out.println("Dime una fecha:");
            System.out.print("Dia: ");
            dia = sc.nextInt();

            if (dia != 0) {
                System.out.print("Mes: ");
                mes = sc.nextInt();
                System.out.print("Año: ");
                ano = sc.nextInt();

                Fecha a = new Fecha(dia, mes, ano);
                if (a.esCorrecta() == true) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha no es correcta");
                }
            }
        } while (dia != 0);

    }
}
