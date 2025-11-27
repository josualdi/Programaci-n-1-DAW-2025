import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        String[] semana;
        semana = new String[7];
        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miercoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sabado";
        semana[6] = "Domingo";

        int num;

        do {
            System.out.print("Que dia de la semana quieres: ");
            num = sc.nextInt();
            if (num < 1 || num > 7) {
                System.out.println("Adios");
            } else {
                System.out.println(semana[num-1]);
            }
        } while (num > 0 && num < 8);
    }
}
