import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int respuesta;

        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 99) + 1;
        }

        do {
            respuesta = sc.nextInt();
        } while (!esCorrecto(respuesta, nums));
        
    }

    public static boolean esCorrecto(int a, int b[]) {
        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                return true;
            }
        } 
        return false;
    }
}
