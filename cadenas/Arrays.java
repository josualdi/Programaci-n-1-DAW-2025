public class Arrays {
    public static void main(String[] args) {

        final int LANZAMIENTOS = 1000000;
        final int MIN = 11;
        final int MAX= 17;

        int dado;
        int dados[] = new int[MAX-MIN+1];

        for (int i = 0; i < LANZAMIENTOS; i++) {
            dado = ((int) (Math.random() * (MAX-MIN+1))) + MIN;
            dados[dado-MIN]++;
        }
        for (int i = 0; i < dados.length; i++) {
            System.out.println((i + MIN) + ":" + dados[i]);
        }
    }
}