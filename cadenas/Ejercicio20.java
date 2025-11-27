import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce una password: ");
            String password = sc.nextLine();

            byte resultado = comprobarPassword(password);
            System.out.println("Resultado: " + resultado);

            if (resultado == 0) {
                System.out.println("Contraseña aceptable");
                break; 
            }
        }
    }

    public static byte comprobarPassword(String password) {

        if (password.length() < 2) {
            return 1;
        }

        if (password.length() > 10) {
            return 2;
        }

        if (password.contains(" ")) {
            return 3;
        }

        String[] caracteres = { "@", "#", "$", "%", "&" };
        boolean contieneEspecial = false;

        for (String c : caracteres) {
            if (password.contains(c)) {
                contieneEspecial = true;
                break;
            }
        }

        if (!contieneEspecial) {
            return 4;
        }
        return 0;
    }
}
