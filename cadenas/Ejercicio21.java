import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu DNI: ");
        String DNI = sc.next();
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (esCorrecto(DNI, cadena)) {
            System.out.println("DNI correcto");
        } else {
            System.out.println("DNI incorrecto");
        }
    }

    public static boolean esCorrecto(String a, String b) {
        if (a.length() == 9) {
            char ultima = a.charAt(a.length() - 1);
            int nums = Integer.parseInt(a.substring(0, a.length()-1));
            int resto = nums % 23;
            if (b.charAt(resto) == ultima) {
                return true;
            } else {
                return false;
            }
        } return false;
    }


}
