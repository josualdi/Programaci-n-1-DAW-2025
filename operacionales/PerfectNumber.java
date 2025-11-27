package operacionales;

public class PerfectNumber {

    public static void main(String[] args) {
        int var = 0;
        int cont = 0;

            for (int i = 1; cont <= 4; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        var += j;
                    }
                }
                if (var == i) {
                    cont++;
                    System.out.println(i);
                }
                var = 0;
            }
    }
}
